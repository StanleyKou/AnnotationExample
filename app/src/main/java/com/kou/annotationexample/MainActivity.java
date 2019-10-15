package com.kou.annotationexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.kou.binder.Binding;
import com.kou.lib.annotations.BindView;
import com.kou.lib.annotations.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindViewJava(R.id.txtView1)
    TextView txtView1;

    @BindView(R.id.txtView2)
    TextView txtView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewBinder.INSTANCE.bindJava(this);

        Binding.bind(this);
        txtView2.setText("BindView Java");
    }

    @Override
    protected void onResume() {
        super.onResume();
        txtView1.setText("It works!! Java annotation");
    }

    @OnClick(R.id.btn1)
    void bt1Click(View view) {
        txtView2.setText("Button 1 Clicked - Java poet");
    }

    @OnClick(R.id.btn2)
    void bt2Click(View view) {
        startActivity(new Intent(this, KotlinActivity.class));
    }
}


