package com.example.jh.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ToggleButton;

/**
 * togglebutton,后续再补充！
 */
public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
        final LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mylayout);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    linearLayout.setOrientation(LinearLayout.VERTICAL); // 设置垂直布局
                }else{
                    linearLayout.setOrientation(LinearLayout.HORIZONTAL);  // 水平布局
                }
            }
        });
    }
}
