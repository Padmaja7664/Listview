package com.example.listview_project2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val name=intent.getStringExtra("name")
        val phone=intent.getStringExtra("phone")
        val imageid=intent.getIntExtra("image",R.drawable.pic0)

        val nameTv=findViewById<TextView>(R.id.tvname)
        val phonetv=findViewById<TextView>(R.id.tvphone)
        val imagetv=findViewById<CircleImageView>(R.id.profile_image)

        nameTv.text=name
        phonetv.text=phone
        imagetv.setImageResource(imageid)
    }
}