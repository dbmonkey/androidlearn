package com.example.first.checkboxandradiobuttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //实例化控件；
    private RadioGroup radioGroup;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //初始化控件；
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        checkBox = (CheckBox) findViewById(R.id.checkBox);

        //为单选按钮添加监听事件；
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radioButton1:
                        Log.i("tag", "你选择了男！");
                        Toast.makeText(MainActivity.this,"你选择了男！",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton2:
                        Log.i("tag", "你选择了女！");
                        Toast.makeText(MainActivity.this,"你选择了女！",Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });

        //为复选框添加监听事件；
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.i("tag", isChecked+"");
                if(isChecked)
                {
                    String text = buttonView.getText().toString();
                    Toast.makeText(MainActivity.this,"你的爱好是："+text,Toast.LENGTH_SHORT).show();}
            }
        });
    }
}
