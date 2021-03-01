package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        // 메인 엑티비티 -> 엑티비티 메인 바인딩
        // 자동으로 완성된 엑티비티 메인 바인딩 클래스 인스턴스를 가져왔다.
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        User user = new User("First Name","Last Name");
        activityMainBinding.setUser(user);
    }
}