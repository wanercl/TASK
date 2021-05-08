package com.nnip.task._5120181550;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.nnip.task.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout._5120181550_activity_main);
        findViewById(R.id._5120181550_btn_task1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), com.nnip.task._5120181550.Task1.MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
