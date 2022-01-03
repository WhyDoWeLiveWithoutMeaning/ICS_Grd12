package Unit3.ArrayList;

import java.util.ArrayList;

import Unit3.ArrayList.Song.Genre;

public class SongTest {

    public static void main(String[] args){

        Song song1 = new Song("Jesus Lord pt 2", "Donda", "Kanye West");
        Song song2 = new Song();
        Song song3 = new Song("Moon", "Donda", "Kanye West");
        Song song4 = new Song("Heaven and Hell", "Donda", "Kanye West");
        Song song5 = new Song("24", "Donda", "Kanye West", Genre.RAP);
        Song song6 = new Song("Junya", "Donda", "Kanye West");
        Song song7 = new Song("Ok Ok", "Donda", "Kanye West");
        Song song8 = new Song("Believe What I Say", "Donda", "Kanye West");
        Song song9 = new Song("Remote Control", "Donda", "Kanye West");
        Song song10 = new Song("Jesus Lord", "Donda", "Kanye West");

        // Test Mutators
        song2.setTitle("Donda");
        song2.setAlbum("Donda");
        song2.setArtist("Kanye West");
        song2.setGenre(Genre.RAP);

        System.out.println(song2.getAlbum());
        System.out.println(song2.getArtist());
        System.out.println(song2.getGenre());
        System.out.println(song2.getTitle());
        System.out.println(song1);
        System.out.println();

        ArrayList<Song> songList = new ArrayList<Song>();

        songList.add(song1);
        songList.add(song2);
        songList.add(song3);
        songList.add(song4);
        songList.add(song5);
        songList.add(song6);
        songList.add(song7);
        songList.add(song8);
        songList.add(song9);
        songList.add(song10);

        System.out.println(songList);
        System.out.println();

        songList.remove(1);

        songList.add(4, new Song("No Child Left Behind", "Donda", "Kanye West"));
        songList.add(new Song("Pure Souls", "Donda", "Kanye West"));

        System.out.println(songList);

        System.out.println(songList.size());

    }
    
}
