package com.example.gitsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.toastlib.ToastMsg

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ToastMsg.SimpleToast(this, "Its Android Library!!");
    }
}