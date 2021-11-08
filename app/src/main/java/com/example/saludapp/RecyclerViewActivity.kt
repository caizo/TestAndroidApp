package com.example.saludapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.saludapp.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : AppCompatActivity() {

    /**
     * Datos que mostraremos en el RecyclerView
     */
    private val data = listOf<SouthParkDataClass>(SouthParkDataClass("https://i.pinimg.com/originals/0f/84/d5/0f84d5acb3305df7d181f75ddc5c05d6.png","Stan"),
        SouthParkDataClass("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTHVlm_bBAHJTPvAKWQ5pVHI--3RpesR7tLxNDHKA9EGL7O3JV87HY1V6jdoINNFt62Lv0&usqp=CAU","Eric"),
        SouthParkDataClass("https://a.wattpad.com/useravatar/MoonrabUwU.256.772088.jpg","Kenny"),
        SouthParkDataClass("https://static.wikia.nocookie.net/doblaje-fanon/images/0/0a/ProfesorC..jpg/revision/latest?cb=20170420000130&path-prefix=es","Butters"),
        SouthParkDataClass("https://cdn.quotesgram.com/img/29/20/1023770450-chef-children_copy_2.png","Chef"),
        SouthParkDataClass("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTHVlm_bBAHJTPvAKWQ5pVHI--3RpesR7tLxNDHKA9EGL7O3JV87HY1V6jdoINNFt62Lv0&usqp=CAU","Eric"),
        SouthParkDataClass("https://a.wattpad.com/useravatar/MoonrabUwU.256.772088.jpg","Kenny"),
        SouthParkDataClass("https://static.wikia.nocookie.net/doblaje-fanon/images/0/0a/ProfesorC..jpg/revision/latest?cb=20170420000130&path-prefix=es","Butters"),
        SouthParkDataClass("https://cdn.quotesgram.com/img/29/20/1023770450-chef-children_copy_2.png","Chef"),
        SouthParkDataClass("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTHVlm_bBAHJTPvAKWQ5pVHI--3RpesR7tLxNDHKA9EGL7O3JV87HY1V6jdoINNFt62Lv0&usqp=CAU","Eric"),
        SouthParkDataClass("https://a.wattpad.com/useravatar/MoonrabUwU.256.772088.jpg","Kenny"),
        SouthParkDataClass("https://static.wikia.nocookie.net/doblaje-fanon/images/0/0a/ProfesorC..jpg/revision/latest?cb=20170420000130&path-prefix=es","Butters"),
        SouthParkDataClass("https://cdn.quotesgram.com/img/29/20/1023770450-chef-children_copy_2.png","Chef"),
        SouthParkDataClass("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTHVlm_bBAHJTPvAKWQ5pVHI--3RpesR7tLxNDHKA9EGL7O3JV87HY1V6jdoINNFt62Lv0&usqp=CAU","Eric"),
        SouthParkDataClass("https://a.wattpad.com/useravatar/MoonrabUwU.256.772088.jpg","Kenny"),
        SouthParkDataClass("https://static.wikia.nocookie.net/doblaje-fanon/images/0/0a/ProfesorC..jpg/revision/latest?cb=20170420000130&path-prefix=es","Butters"),
        SouthParkDataClass("https://cdn.quotesgram.com/img/29/20/1023770450-chef-children_copy_2.png","Chef"),
        SouthParkDataClass("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTHVlm_bBAHJTPvAKWQ5pVHI--3RpesR7tLxNDHKA9EGL7O3JV87HY1V6jdoINNFt62Lv0&usqp=CAU","Eric"),
        SouthParkDataClass("https://a.wattpad.com/useravatar/MoonrabUwU.256.772088.jpg","Kenny"),
        SouthParkDataClass("https://static.wikia.nocookie.net/doblaje-fanon/images/0/0a/ProfesorC..jpg/revision/latest?cb=20170420000130&path-prefix=es","Butters"),
        SouthParkDataClass("https://cdn.quotesgram.com/img/29/20/1023770450-chef-children_copy_2.png","Chef"),
        SouthParkDataClass("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTHVlm_bBAHJTPvAKWQ5pVHI--3RpesR7tLxNDHKA9EGL7O3JV87HY1V6jdoINNFt62Lv0&usqp=CAU","Eric"),
        SouthParkDataClass("https://a.wattpad.com/useravatar/MoonrabUwU.256.772088.jpg","Kenny"),
        SouthParkDataClass("https://static.wikia.nocookie.net/doblaje-fanon/images/0/0a/ProfesorC..jpg/revision/latest?cb=20170420000130&path-prefix=es","Butters"),
        SouthParkDataClass("https://cdn.quotesgram.com/img/29/20/1023770450-chef-children_copy_2.png","Chef"),

    )
    private lateinit var binding: ActivityRecyclerViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }


    private fun initRecyclerView(){
        binding.rvSouthParkCharacters.layoutManager = LinearLayoutManager(this)
        val adapter = SouthParkAdapter(data)
        binding.rvSouthParkCharacters.adapter = adapter
    }







}