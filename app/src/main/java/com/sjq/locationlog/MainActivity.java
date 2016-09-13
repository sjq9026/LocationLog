package com.sjq.locationlog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getStracks();
        a();
    }

    private void a() {
        getStracks();
        b();
    }

    private void b() {
        getStracks();
        Log.i("hello world");
    }

    private void getStracks() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StringBuffer sb = new StringBuffer();
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append(stackTraceElement.getClassName() + "      " + stackTraceElement.getMethodName() + "    " + stackTraceElement.getLineNumber() + "\n");
        }
        android.util.Log.i("stack", "b()----->" + sb.toString());
    }
}
