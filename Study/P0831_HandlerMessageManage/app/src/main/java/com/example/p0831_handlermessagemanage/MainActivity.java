package com.example.p0831_handlermessagemanage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    final  String LOG_TAG = "myLogs";

    Handler h;

    Handler.Callback hc = new Handler.Callback() {
        @Override
        public boolean handleMessage(@NonNull Message msg) {
            Log.d(LOG_TAG, "what =" + msg.what);

            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        h = new Handler(hc);
        sendMessages();
    }

    void sendMessages(){

        Log.d(LOG_TAG, "send messages");
        h.sendEmptyMessageDelayed(1, 1000);
        h.sendEmptyMessageDelayed(2, 2000);
        h.sendEmptyMessageDelayed(2, 3000);
    }
}