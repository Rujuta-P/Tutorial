package com.aphruedite.myapplication.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.aphruedite.myapplication.Constants
import com.aphruedite.myapplication.R
import com.aphruedite.myapplication.showToast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

       val bundle: Bundle? = intent.extras

        bundle?.let{

            val msg = bundle!!.getString(Constants.USER_MSG_KEY)
            showToast("user_message")
            txvUserMessage.text=msg
        }
    }
}