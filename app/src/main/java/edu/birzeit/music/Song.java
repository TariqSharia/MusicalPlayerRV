package edu.birzeit.music;

public class Song {
    private String name;
    private int imageID;
    private  String lyrics;

    public static final Song[] songs = {
            new Song("Psycho - Red Velvet", R.drawable.first, "test"),
            new Song("Part of Your World (The Little Mermaid)", R.drawable.second , "test"),
            new Song("Let It Go (Frozen))", R.drawable.third, "test"),
            new Song("Remember Me (Coco)", R.drawable.fourth, "test"),
            new Song("You're Welcome (Moana)", R.drawable.fifth, "test"),
            new Song("Baby Mine (Dumbo)", R.drawable.sixth, "test"),
            new Song("A Spoonful of Sugar (Mary Poppins)", R.drawable.seventh, "test"),
            new Song("What's This? (The Nightmare Before Christmas)", R.drawable.eighth, "test"),
            new Song("Grim Grinning Ghosts (The Haunted Mansion)", R.drawable.ninth, "test"),
            new Song("Almost There (The Princess and the Frog)", R.drawable.tenth, "test"),

    };

    public Song(String name, int imageID, String lyrics) {
        this.name = name;
        this.imageID = imageID;
        this.lyrics = lyrics;
    }

    public String getName() {
        return name;
    }

    public int getImageID() {
        return imageID;
    }

    public String getLyrics() {
        return lyrics;
    }
}
