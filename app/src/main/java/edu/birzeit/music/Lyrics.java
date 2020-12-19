package edu.birzeit.music;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class Lyrics extends AppCompatActivity {
    int position=0;
    ImageView imageView;
    TextView textView;
    private MediaPlayer mediaPlayer;
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyrics);
        Intent intent = getIntent();
        imageView = findViewById(R.id.imageView);
        position = intent.getIntExtra("pos", 0);
        Drawable drawable = ContextCompat.getDrawable(imageView.getContext(),Song.songs[position].getImageID());
        TextView textView = findViewById(R.id.textView);
        textView.setText(Song.songs[position].getName());
        int songId = Song.songs[position].getSoundTrack();
        mediaPlayer = mediaPlayer.create(this , songId);
        imageView.setImageDrawable(drawable);

    }
    public void nextSong(View view){
        if (position==Song.songs.length-1){
            position=0;
        }else{
            position++;
        }
        System.out.println(position);
        Drawable drawable = ContextCompat.getDrawable(imageView.getContext(),Song.songs[position].getImageID());
        textView = findViewById(R.id.textView);
        textView.setText(Song.songs[position].getName());
        imageView.setImageDrawable(drawable);
        mediaPlayer.stop();
        int songId = Song.songs[position].getSoundTrack();
        mediaPlayer = mediaPlayer.create(this , songId);
        mediaPlayer.start();
    }

    public void startPauseSong(View view){
        if (mediaPlayer.isPlaying()){
            mediaPlayer.pause();
        }else {
            mediaPlayer.start();
        }
    }
    public void previousSong(View view){
        if (position==0){
            position=Song.songs.length-1;
            System.out.println(position);
        }else{
            position--;
        }
//                System.out.println(position);
//        System.out.println(Song.songs[position].getName());
        Drawable drawable = ContextCompat.getDrawable(imageView.getContext(),Song.songs[position].getImageID());
        textView = findViewById(R.id.textView);
        textView.setText(Song.songs[position].getName());
        imageView.setImageDrawable(drawable);
        mediaPlayer.stop();
        int songId = Song.songs[position].getSoundTrack();
        mediaPlayer = mediaPlayer.create(this , songId);
        mediaPlayer.start();

    }
}
