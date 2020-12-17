package edu.birzeit.music;

public class Song {
    private String name;
    private int imageID;

    public static final Song[] songs = {
            new Song("Psycho - Red Velvet", R.drawable.first),
            new Song("Part of Your World (The Little Mermaid)", R.drawable.second),
            new Song("Let It Go (Frozen))", R.drawable.third),
            new Song("Remember Me (Coco)", R.drawable.fourth),
            new Song("You're Welcome (Moana)", R.drawable.fifth),
            new Song("Baby Mine (Dumbo)", R.drawable.sixth),
            new Song("A Spoonful of Sugar (Mary Poppins)", R.drawable.seventh),
            new Song("What's This? (The Nightmare Before Christmas)", R.drawable.eighth),
            new Song("Grim Grinning Ghosts (The Haunted Mansion)", R.drawable.ninth),
            new Song("Almost There (The Princess and the Frog)", R.drawable.tenth),

    };

    public Song(String name, int imageID) {
        this.name = name;
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public int getImageID() {
        return imageID;
    }
}
