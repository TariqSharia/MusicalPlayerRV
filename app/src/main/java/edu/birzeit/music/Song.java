package edu.birzeit.music;

public class Song {
    private String name;
    private int imageID;
    private  int soundTrack;

    public static final Song[] songs = {
            new Song("Psycho - Red Velvet", R.drawable.first, R.raw.first),
            new Song("Part of Your World (The Little Mermaid)", R.drawable.second , R.raw.second),
            new Song("Let It Go (Frozen))", R.drawable.third, R.raw.third),
            new Song("Remember Me (Coco)", R.drawable.fourth, R.raw.fourth),
            new Song("You're Welcome (Moana)", R.drawable.fifth, R.raw.fifth),
            new Song("Baby Mine (Dumbo)", R.drawable.sixth, R.raw.sixth),
            new Song("A Spoonful of Sugar (Mary Poppins)", R.drawable.seventh, R.raw.seventh),
            new Song("What's This? (The Nightmare Before Christmas)", R.drawable.eighth, R.raw.eighth),
            new Song("Grim Grinning Ghosts (The Haunted Mansion)", R.drawable.ninth, R.raw.ninth),
            new Song("Almost There (The Princess and the Frog)", R.drawable.tenth, R.raw.tenth),

    };

    public Song(String name, int imageID, int soundTrack) {
        this.name = name;
        this.imageID = imageID;
        this.soundTrack = soundTrack;
    }

    public String getName() {
        return name;
    }

    public int getImageID() {
        return imageID;
    }

    public int getSoundTrack() {return soundTrack;
    }
}
