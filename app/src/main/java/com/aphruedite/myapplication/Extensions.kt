package com.aphruedite.myapplication

import android.app.Activity
import android.content.Context
import android.widget.Toast

fun Context.showToast(message: String, duration: Int = Toast.LENGTH_SHORT){

    Toast.makeText(this, message, duration).show()
}

