package com.example.myapplication.dagger;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.http.Body;
import retrofit2.http.POST;

public class Logger {

    private Retrofit retrofit;
    public Logger(Retrofit retrofit) {
        this.retrofit = retrofit;
    }

    public void log(String msg) {
        System.out.println(msg);
        System.out.println("retrofit:"+retrofit);
    }

    public void uploadLog() {
        //异步上传日志
        retrofit.create(UploadApiServices.class).uploadLog("").enqueue(new Callback<Response<Object>>() {
            @Override
            public void onResponse(Call<Response<Object>> call, Response<Response<Object>> response) {
                // TODO: 2020-06-23 上传成功
            }

            @Override
            public void onFailure(Call<Response<Object>> call, Throwable t) {
                // TODO: 2020-06-23 上传失败
            }
        });
    }

    interface UploadApiServices {
        @POST("api/v1/uploadLog")
        Call<Response<Object>> uploadLog(@Body String json);
    }
}
