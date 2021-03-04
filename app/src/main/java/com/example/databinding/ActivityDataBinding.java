package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.databinding.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class ActivityDataBinding extends AppCompatActivity {

    private ActivityMainBinding mActivityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        // 메인 엑티비티 -> 엑티비티 메인 바인딩
        // 자동으로 완성된 엑티비티 메인 바인딩 클래스 인스턴스를 가져왔다.
        mActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // 방법 1. data클래스를 통한 입
        User user = new User("First Name", "Last Name");
        mActivityMainBinding.setUser(user);

        // 방법 2. dataBinding으로 직접 접근하여 사용 : findViewById 확인필요없음
        mActivityMainBinding.btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = String.valueOf(mActivityMainBinding.enter.getText());

                if (!content.equals("")) {
                    Log.d("sky", "btn In -if");
                    mActivityMainBinding.result.setText(content);
                } else {
                    Log.d("sky", "btn In -else");
                    Snackbar.make(v, "hello I'm Snackbar", BaseTransientBottomBar.LENGTH_SHORT).show();
                }
            }
        });


    }

}