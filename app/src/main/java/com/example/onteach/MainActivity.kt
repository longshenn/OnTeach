package com.example.onteach

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , GestureDetector.OnGestureListener,
    GestureDetector.OnDoubleTapListener, View.OnTouchListener{

    lateinit var gDetector: GestureDetector
    var PictureNo:Int = 0  //目前顯示第幾張圖
    var TotalPictures:Int = 6 //總共幾張圖片(假設僅顯示pu0-pu3)

    var StoryTvx:Int = 0
    var TotalTvx:Int =3

    fun ShowPicture(){
        when (PictureNo){
            0 -> img.setImageResource(R.drawable.pu0)
            1 -> img.setImageResource(R.drawable.w2)
            2 -> img.setImageResource(R.drawable.w3)
            3 -> img.setImageResource(R.drawable.w4)
            4 -> img.setImageResource(R.drawable.w5)
            5 -> img.setImageResource(R.drawable.w6)
        }
    }

   /* fun ShowStory(){
            when(StoryTvx){
                0 -> txv.text = "短按"
                1 -> txv.text = "說故事"
                2 -> txv.text = "快say"
                3 -> txv.text = "共"
            }
    }*/



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gDetector = GestureDetector(this, this)
        img.setOnTouchListener(this)


    }
   /* override fun onTouchEvent(event: MotionEvent?): Boolean {
        gDetector.onTouchEvent(event)
        return true

    }*/
   override fun onTouch(p0: View?, event: MotionEvent?): Boolean {
       gDetector.onTouchEvent(event)
       return true
   }

    override fun onDown(e: MotionEvent?): Boolean {
        //txv.text = "按下"
        return true

    }

    override fun onShowPress(e: MotionEvent?) {
        //txv.text = "按下後無後續動作"

    }

    override fun onSingleTapUp(e: MotionEvent?): Boolean {

        /*PictureNo = 0
        ShowPicture()*/
        if (PictureNo == 0){
            txv.text = "短按"
        }
        if (PictureNo == 1){
            txv.text = "說故事"
        }

        if (PictureNo == 2){
            txv.text = "say story"
        }

        if (PictureNo == 3){
            txv.text = "共story"
        }

        if (PictureNo == 4){
            txv.text = "say the story"
        }

        if (PictureNo == 5){
            txv.text = "say the story for you"
        }






        return true

    }

    override fun onScroll(
        e1: MotionEvent, e2: MotionEvent, distanceX: Float, distanceY: Float
    ): Boolean {
       // txv.text = "拖曳\nx1y1: " +  e1.getX().toString() + ", " + e1.getY().toString() +
          //      "\nx2y2: " + e2.getX().toString() + ", " + e2.getY().toString()
        return true

    }

    override fun onLongPress(e: MotionEvent?) {
        //txv.text = "長按"
        PictureNo = TotalPictures - 1
        ShowPicture()


    }

    override fun onFling(
        e1: MotionEvent, e2: MotionEvent, velocityX: Float, velocityY: Float
    ): Boolean {
       /* txv.text = "快滑\nx1y1: " + e1.getX().toString() + ", " + e1.getY().toString() +
               "\nx2y2: " + e2.getX().toString() + ", " + e2.getY().toString() +
               "\nX軸Y軸速度:" + velocityX.toString() + ", " +  velocityY.toString()*/
        if (e1.getX() < e2.getX()){  //向右快滑
            PictureNo--
            if (PictureNo == TotalPictures) {PictureNo = 0}
        }
        else{     //向左快滑
            PictureNo++;
            if (PictureNo < 0) {PictureNo = TotalPictures - 1 }
        }
        ShowPicture()

        return true

    }

    override fun onSingleTapConfirmed(e: MotionEvent?): Boolean {
        return true
    }

    override fun onDoubleTap(e: MotionEvent?): Boolean {
        return true

    }

    override fun onDoubleTapEvent(e: MotionEvent?): Boolean {
        //txv.text = "連續點兩下"
        return true

    }

}