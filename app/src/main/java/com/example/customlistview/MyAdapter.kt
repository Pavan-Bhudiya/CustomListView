package com.example.customlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(var mCntxt:Context,var resources:Int,var items:List<Model>):ArrayAdapter<Model>(mCntxt,resources,items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutinflater:LayoutInflater=LayoutInflater.from(mCntxt)
        val view:View=layoutinflater.inflate(resources,null)

        val imageview:ImageView=view.findViewById(R.id.image)
        val titletextview:TextView=view.findViewById(R.id.Tv_maintext)
        val desciptiontextview:TextView=view.findViewById(R.id.Tv_subtext)

        var myitem:Model=items[position]
        imageview.setImageDrawable(mCntxt.resources.getDrawable(myitem.image))
        titletextview.text=myitem.title
        desciptiontextview.text=myitem.desciption
        return view
    }
}