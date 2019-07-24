package com.aphruedite.myapplication.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aphruedite.myapplication.adapters.HobbiesAdapter
import com.aphruedite.myapplication.R
import com.aphruedite.myapplication.models.Supplier
import kotlinx.android.synthetic.main.activity_hobbies.*


class HobbiesActivity : AppCompatActivity() {

    companion object {
        val TAG: String = HobbiesActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)

        setupRecyclerView()



    }

    private fun setupRecyclerView() {

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation= RecyclerView.VERTICAL
        recyclerView.layoutManager = layoutManager

        val adapter = HobbiesAdapter(this, Supplier.hobbies)
        recyclerView.adapter = adapter
    }
}
