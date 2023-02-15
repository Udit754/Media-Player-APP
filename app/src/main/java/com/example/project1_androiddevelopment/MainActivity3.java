package com.example.project1_androiddevelopment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    private TextView textView3;
    private Button button3;
    private SurfaceView surfaceView;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView3=findViewById(R.id.textView3);
        button3=findViewById(R.id.button3);
        surfaceView=findViewById(R.id.surfaceView);
        
        // Adding media player code
        mediaPlayer = MediaPlayer.create(this,R.raw.video1);
        mediaPlayer.start();

        // To keep screen open while playing video    
        surfaceView.setKeepScreenOn(true);

        SurfaceHolder surfaceHolder=surfaceView.getHolder();
        surfaceHolder.addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(@NonNull SurfaceHolder holder) {
                mediaPlayer.setDisplay(surfaceHolder);
            }
            @Override
            public void surfaceChanged(@NonNull SurfaceHolder holder, int format, int width, int height) {
            }
            @Override
            public void surfaceDestroyed(@NonNull SurfaceHolder holder) {

            }
        });
        // Assigning button work
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    button3.setText("Play");
                }
                else{
                    mediaPlayer.start();
                    button3.setText("Pause");
                }
            }
        });

        
        
        
    }
    
    Intent intent=getIntent();
}