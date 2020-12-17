package edu.birzeit.music;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recycler = (RecyclerView) findViewById(R.id.song_recycler);

        String[] captions = new String[Song.songs.length];
        int[] ids = new int[Song.songs.length];

        for (int i = 0; i < captions.length; i++){
            captions[i] = Song.songs[i].getName();
            ids[i] = Song.songs[i].getImageID();
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        CaptionImageAdapter adapter = new CaptionImageAdapter(captions, ids);
        recycler.setAdapter(adapter);
    }
}