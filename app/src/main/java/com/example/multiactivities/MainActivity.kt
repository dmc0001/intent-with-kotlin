package com.example.multiactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.multiactivities.MainActivity.Constant.extraDate
import com.example.multiactivities.databinding.ActivityMain2Binding
import com.example.multiactivities.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addCallBacks()
    }
    private fun addCallBacks(){

        button.setOnClickListener{
           val  i =  Intent(this,MainActivity2::class.java)
            val data = editTextTextPersonName.text.toString()
            i.putExtra(extraDate,data)
            startActivity(i)
        }
    }
    object Constant{
        const val extraDate = "extraData"
    }
}