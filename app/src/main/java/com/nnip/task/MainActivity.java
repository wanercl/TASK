package com.nnip.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        5120181550-陈龙
         */
        findViewById(R.id._5120181550_btn_enter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), com.nnip.task._5120181550.MainActivity.class);
                startActivity(intent);
            }
        });


        /*
        此处之后添加您的代码并按如上代码注释改动
         */

    }
}