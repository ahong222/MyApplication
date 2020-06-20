package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val list:MutableList<ItemInfo> = ArrayList<ItemInfo>()
    init {
        list.add(ItemInfo("Dagger2测试", Dagger2Fragment()))
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(baseContext)
        recyclerView.adapter = object : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
            override fun getItemCount(): Int {
                return list.size
            }

            override fun onBindViewHolder(holder: ViewHolder, position: Int) {
                holder.itemView.findViewById<TextView>(android.R.id.text1).text = list[position].name
                holder.itemView.setOnClickListener(View.OnClickListener { view ->
                    if (list[position].data is View.OnClickListener) {
                        (list[position].data as View.OnClickListener).onClick(null)
                    } else if (list[position].data is Fragment) {
                        showFragment((list[position].data as Fragment))
                    } else if (list[position].data is Class<*> && (list[position].data as Class<*>).isAssignableFrom(Activity::class.java)) {
                        startActivityPage((list[position].data as Class<Activity>))
                    }
                })
            }

            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
                val view: View = LayoutInflater.from(baseContext).inflate(android.R.layout.simple_list_item_1, parent, false)
                return object:ViewHolder(view){}
            }

        }

    }

    fun showFragment(fragment: Fragment) {
        content.visibility = View.VISIBLE
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.content, fragment)
        transaction.show(fragment)
        transaction.commitNowAllowingStateLoss()
    }

    fun startActivityPage(clazz: Class<Activity>) {
        startActivity(Intent(this, clazz))
    }

    override fun onBackPressed() {
        if (content.visibility == View.VISIBLE) {
            content.visibility = View.GONE
            supportFragmentManager.popBackStack()
            return
        }
        super.onBackPressed()

    }


    class ItemInfo constructor(_name:String, _data:Any) {
        internal var name = _name
        internal var data = _data

    }
}
