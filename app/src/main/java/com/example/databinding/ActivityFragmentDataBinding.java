package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import android.os.Bundle;

import com.example.databinding.databinding.ActivityFragmentDataBindingBinding;

public class ActivityFragmentDataBinding extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_data_binding);

        ActivityFragmentDataBindingBinding bindingBinding = DataBindingUtil.setContentView(this,R.layout.activity_fragment_data_binding);



    }
}