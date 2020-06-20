package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class Dagger2Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = LayoutInflater.from(context).inflate(R.layout.dagger2_layout, container, false)
        view.findViewById<Button>(R.id.test).setOnClickListener { view->
            Toast.makeText(context,"test", Toast.LENGTH_SHORT).show()
        }
        return view
    }
}