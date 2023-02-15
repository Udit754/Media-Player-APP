package com.example.project1_androiddevelopment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
    }
    public void Screen2(View view){
        Toast.makeText(this, "Opening Audio Player", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,MainActivity2.class );
        startActivity(intent);
    }
    public  void Screen3(View view){
        Toast.makeText(this, "Opening Video Player", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,MainActivity3.class);
        startActivity(intent);
    }

}