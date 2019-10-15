package com.kou.annotationexample

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class KotlinActivity : AppCompatActivity() {

    @BindViewKotlin(R.id.txtView3)
    lateinit var txtView3: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        ViewBinder.bindKotlin(this)
    }

    override fun onResume() {
        super.onResume()

        txtView3.text = "It works!! Kotlin annotation"
    }
}
