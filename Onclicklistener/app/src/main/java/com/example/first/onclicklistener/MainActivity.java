package com.example.first.onclicklistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn_1);
        btn2 = (Button) findViewById(R.id.btn_2);
        btn3 = (Button) findViewById(R.id.btn_3);
        btn4 = (Button) findViewById(R.id.btn_4);

        /*
        1、使用匿名内部类实现监听事件
         */
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "使用匿名内部类实现监听事件", Toast.LENGTH_SHORT).show();
            }
        });

        /*
        2、使用外部类实现监听事件
         */
        btn2.setOnClickListener(new MyOnClickListener(){
            @Override
            public void onClick(View v) {
                //调用父类的onClick()方法；
                super.onClick(v);
                Toast.makeText(MainActivity.this,"btn2要执行的逻辑",Toast.LENGTH_SHORT).show();
            }
        });
        btn3.setOnClickListener(new MyOnClickListener(){
            @Override
            public void onClick(View v) {
                //调用父类的onClick()方法；
                super.onClick(v);
                Toast.makeText(MainActivity.this,"btn3要执行的逻辑",Toast.LENGTH_SHORT).show();
            }
        });

        /*
        3、使用接口方式实现监听事件
         */
        btn4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this,"使用接口方式实现监听事件",Toast.LENGTH_SHORT).show();
    }
}

class  MyOnClickListener implements View.OnClickListener{

    @Override
    public void onClick(View v) {
        //让所有使用当前外部类的按钮都实现这个方法，改变按钮的透明度；
        v.setAlpha(0.5f);
    }
}