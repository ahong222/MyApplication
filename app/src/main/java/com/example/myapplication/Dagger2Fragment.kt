package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.myapplication.dagger.Street

class Dagger2Fragment : Fragment() {

    val street1:Street= Street()
    val street2:Street= Street()
    val street3:Street= Street()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = LayoutInflater.from(context).inflate(R.layout.dagger2_layout, container, false)
        view.findViewById<Button>(R.id.test1).setOnClickListener { view->

            street1.byCoffee()
        }

        view.findViewById<Button>(R.id.test2).setOnClickListener { view->

            street2.byCoffee()
        }

        view.findViewById<Button>(R.id.test3).setOnClickListener { view->

            street3.byCoffee()
        }
        return view
    }
}