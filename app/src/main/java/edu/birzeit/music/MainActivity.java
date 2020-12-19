package edu.birzeit.music;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycler;
    ImageView img;
    CaptionImageAdapter adapter;
    String[] captions;
    int[] ids;
    int n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.image);
        recycler = (RecyclerView) findViewById(R.id.song_recycler);

        captions = new String[Song.songs.length];
        ids = new int[Song.songs.length];

        for (int i = 0; i < captions.length; i++){
            captions[i] = Song.songs[i].getName();
            ids[i] = Song.songs[i].getImageID();
        }
        n = Song.songs.length;
        recycler.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CaptionImageAdapter(captions, ids);
        recycler.setAdapter(adapter);
//        for (int i =0 ;i<n;i++){
//            System.out.println(captions[i]);
//        }
    }
    public void cardViewOnClick (View view){
        Intent intent = new Intent(this, Lyrics.class);
      /*  String msg = "";
        TextView lyricTxt = findViewById(R.id.lyricTxt);

        for (int i = 0; i < Song.songs.length; i++){
           msg =  Song.songs[i].getLyrics();

           lyricTxt.setText(msg);
        }
        */

//        int id = adapter.getImageId();
//        CardView cardView = findViewById(R.id.card_view);
//        String caption=captions[id];
//        System.out.println(caption+"      "+ id);
//        Drawable dr = ContextCompat.getDrawable(cardView.getContext(), ids[0]);
//        for (int i = 0;i<n;i++){
//            if (ids[i]==id){
//                dr = ContextCompat.getDrawable(cardView.getContext(), ids[i]);
//                System.out.println(captions[0]);
////                caption = captions[i];
//            }
//        }

    //        System.out.println(adapter.getImageid());
//        intent.putExtra("url", (Parcelable) dr);
//        intent.putExtra("cap", caption);
//        System.out.println(img.get);
        startActivity(intent);
    }

}