package com.example.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listview=findViewById<ListView>(R.id.listview)
        var mylist= mutableListOf<Model>()

        //lets add images,title and description

        mylist.add(Model(" car ","  Royals royce white car ",R.drawable.car))
        mylist.add(Model("car"," blue car",R.drawable.car1))
        mylist.add(Model("car"," ferrari red car",R.drawable.car2))
        mylist.add(Model("car"," grey car", R.drawable.car3))
        mylist.add(Model("car"," bugatti white  car",R.drawable.car4))
        mylist.add(Model("car"," Royals royce blue  car",R.drawable.car5))

        listview.adapter=MyAdapter(this,R.layout.row,mylist)
    }
}