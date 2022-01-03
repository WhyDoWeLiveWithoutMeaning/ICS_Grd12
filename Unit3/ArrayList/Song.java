package Unit3.ArrayList;

public class Song {

    public static enum Genre {
        UNKNOWN,
        POP,
        ROCK,
        CLASSIC,
        JAZZ,
        BLUES,
        COUNTRY,
        HIPHOP,
        REGGAE,
        FUNK,
        FOLK,
        PUNK,
        METAL,
        ELECTRONIC,
        RAP
    }

    private String title;
    private String album;
    private String artist;
    private Genre genre;

    public Song(){
        title = "";
        album = "";
        artist = "";
        genre = Genre.UNKNOWN;
    }

    public Song(String title, String album, String artist){
        this.title = title;
        this.album = album;
        this.artist = artist;
        this.genre = Genre.UNKNOWN;
    }

    public Song(String title, String album, String artist, Genre genre){
        this.title = title;
        this.album = album;
        this.artist = artist;
        this.genre = genre;
    }

    public String getTitle(){
        return title;
    }

    public String getAlbum(){
        return album;
    }

    public String getArtist(){
        return artist;
    }

    public Genre getGenre(){
        return genre;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAlbum(String album){
        this.album = album;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    public void setGenre(Genre genre){
        this.genre = genre;
    }

    @Override
    public String toString(){
        return title + " by " + artist + " in " + album;
    }
    
}
