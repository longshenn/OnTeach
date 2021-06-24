package com.example.onteach

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View

import kotlinx.android.synthetic.main.activity_start.*

class StoryActivity1 : AppCompatActivity() , GestureDetector.OnGestureListener,
    GestureDetector.OnDoubleTapListener, View.OnTouchListener{

    lateinit var gDetector: GestureDetector
    var PictureNo:Int = 0  //目前顯示第幾張圖
    var TotalPictures:Int = 3 //總共幾張圖片(假設僅顯示pu0-pu3)

    var StoryTvx:Int = 0
    var TotalTvx:Int =3

    fun ShowPicture(){
        when (PictureNo){
            0 -> img.setImageResource(R.drawable.d0)
            1 -> img.setImageResource(R.drawable.n1)
            2 -> img.setImageResource(R.drawable.c21)

        }
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        gDetector = GestureDetector(this, this)
        img.setOnTouchListener(this)

        /*btnM1.setOnClickListener(object :View.OnClickListener{
            override fun onClick(p0:View?){
                intent = Intent(this@MainActivity, SelectActivity::class.java)
                startActivity(intent)
            }
        })*/


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
            txv.text = "因外婆是童養媳，從小就沒被好好對待，以至於長大後也不懂如何待媳婦"
        }

        if (PictureNo == 2){
            txv.text = "因此媽媽身上累積了不少外婆的壓力"
        }

        if (PictureNo == 3){
            txv.text = "而這些壓力也釋放在我身上"
        }

        if (PictureNo == 4){
            txv.text = "只是......"
        }

        if (PictureNo == 5){
            txv.text = "我才不是你們的所有物！我是獨立的個體！"
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