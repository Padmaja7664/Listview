package com.example.listview_project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var userArrayList:ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name= arrayOf("JungKook","V","Jin","Suga","RM","Jimin","Jhope")
        val lastMsg= arrayOf("I want to meet Padmaja","Come to our concert","Hello","HI","Bye","Take care","Good night")
        val lastMsgTime= arrayOf("7:00 PM","3:33 AM","2:39 PM","3:20 PM","1:00 AM","8:00 PM","2:00 PM")
        val phone= arrayOf("6738629","893044","2939810","2637849","784563","893546","768329")
        val imageId= intArrayOf(R.drawable.pic0,R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,R.drawable.pic5,R.drawable.pic6)

        userArrayList=ArrayList()

        for(eachIndex in name.indices){
            val user=User(name[eachIndex],lastMsg[eachIndex], lastMsgTime[eachIndex],phone[eachIndex],imageId[eachIndex])
            userArrayList.add(user)
        }

        val listView=findViewById<ListView>(R.id.listView)
        listView.adapter=MyAdapter(this,userArrayList)
        
        listView.setOnItemClickListener { parent, view, position, id ->
            val name=name[position]
            val pho=phone[position]
            val img=imageId[position]

            val i=Intent(this,UserActivity::class.java)

            i.putExtra("name",name)
            i.putExtra("phone",pho)
            i.putExtra("image",img)
            startActivity(i)
        }

    }
}