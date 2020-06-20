package com.example.myapplication;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Test {

    public void test (){
        View view = null;
        view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                view.setVisibility(View.GONE);


            }
        });
        Object c = null;

        if((c instanceof Class) && ((Class)c).isAssignableFrom(Activity.class)) {

        }
//        if(c assi)
    }


    private void startActivity(Class<Activity> clazz) {

    }

    private static class ItemInfo {
        String name;
        Object data;
    }
}
