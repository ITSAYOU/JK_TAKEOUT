package com.example.ayou.interfacetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private String aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Texse.getTT(new Iinterface() {
            @Override
            public void getData(String s) {
                aa = s;
            }
        });

        Log.i("jzq", "回调=="+aa);

    }


}
