package com.example.dell.task_24;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    private static final String TAG="myServicetag";
    public MyService() {
    }

    @Override
    public void onCreate(){
        Log.e(TAG,"onCreate()");
        super.onCreate();
    }
    @Override
    public int onStartCommand(Intent intent,int flags,int startId){
        Log.e(TAG,"onStartCommand");
        int n=intent.getIntExtra("num",0);
        Log.e(TAG,"int is:"+n);
        return super.onStartCommand(intent,flags,startId);
    }
    @Override
    public void onDestroy(){
        Log.e(TAG,"onDestroy");
        super.onDestroy();
    }
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
