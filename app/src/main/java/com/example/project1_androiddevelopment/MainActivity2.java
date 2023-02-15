package com.example.project1_androiddevelopment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView textView2;
    Button play;
    private MediaPlayer mediaPlayer;
    SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView2=findViewById(R.id.textView2);
        play=findViewById(R.id.play);
        seekBar=findViewById(R.id.seekBar);

        //  Adding Medial player widget
        mediaPlayer=MediaPlayer.create(this,R.raw.auido1);
        mediaPlayer.start();
        //Adding seekbar
        seekBar.setMax(mediaPlayer.getDuration());
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if(fromUser){
                    mediaPlayer.seekTo(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        // Button work to Play Pause
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    play.setText("play");
                    Toast.makeText(MainActivity2.this, "Pausing", Toast.LENGTH_SHORT).show();
                }
                else{
                    mediaPlayer.start();
                    play.setText("pause");
                    Toast.makeText(MainActivity2.this, "Playing", Toast.LENGTH_SHORT).show();
                }

            }

        });

    }
    Intent intent=getIntent();
}