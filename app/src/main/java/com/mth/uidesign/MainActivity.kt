package com.mth.uidesign

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.smarteist.autoimageslider.SliderView

class MainActivity : AppCompatActivity() {
    private lateinit var byRoomBtn: Button
    private lateinit var byRateBtn: Button
    private lateinit var byRoomLayout: ConstraintLayout
    private lateinit var byRateLayout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageSlider = findViewById<SliderView>(R.id.imageSlider)
        val imageList: ArrayList<String> = ArrayList()
        imageList.add("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__340.jpg")
        imageList.add("https://images.ctfassets.net/hrltx12pl8hq/4plHDVeTkWuFMihxQnzBSb/aea2f06d675c3d710d095306e377382f/shutterstock_554314555_copy.jpg")
        imageList.add("https://media.istockphoto.com/photos/child-hands-formig-heart-shape-picture-id951945718?k=6&m=951945718&s=612x612&w=0&h=ih-N7RytxrTfhDyvyTQCA5q5xKoJToKSYgdsJ_mHrv0=")
        setImageInSlider(imageList, imageSlider)

        byRoomBtn=findViewById(R.id.btn_by_room)
        byRateBtn=findViewById(R.id.btn_by_room)
        byRoomLayout=findViewById(R.id.cl_by_room)
        byRateLayout=findViewById(R.id.cl_by_rate)
        byRoomBtn.setOnClickListener{

        }
        byRateBtn.setOnClickListener{
            byRateLayout.visibility()

            byRoomLayout.visibility=false
        }
    }

    private fun setImageInSlider(images: ArrayList<String>, imageSlider: SliderView) {
        val adapter = MySliderImageAdapter()
        adapter.renewItems(images)
        imageSlider.setSliderAdapter(adapter)
        imageSlider.isAutoCycle = true
        imageSlider.startAutoCycle()
    }
}