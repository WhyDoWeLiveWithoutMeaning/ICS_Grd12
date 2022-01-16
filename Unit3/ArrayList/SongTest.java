package Unit3.ArrayList;

import java.util.ArrayList;

import Unit3.ArrayList.Song.Genre;

public class SongTest {

    public static void main(String[] args){

        ArrayList<Song> playlist = new ArrayList<Song>();

        playlist.add(new Song());
        playlist.add(new Song());
        playlist.add(new Song());

        playlist.add(new Song("Jesus Lord pt 2", "Donda", "Kanye West"));
        playlist.add(new Song("Moon", "Donda", "Kanye West"));
        playlist.add(new Song("Heaven and Hell", "Donda", "Kanye West"));

        // Test Mutators
        playlist.get(1).setTitle("Donda");
        playlist.get(1).setAlbum("Donda");
        playlist.get(1).setArtist("Kanye West");
        playlist.get(1).setGenre(Genre.RAP);

        System.out.println(playlist.get(1).getAlbum());
        System.out.println(playlist.get(1).getArtist());
        System.out.println(playlist.get(1).getGenre());
        System.out.println(playlist.get(1).getTitle());
        System.out.println(playlist.get(0));
        System.out.println();

        System.out.println(playlist);
        System.out.println();

        playlist.remove(1);

        playlist.add(2, new Song("No Child Left Behind", "Donda", "Kanye West"));
        playlist.add(new Song("Pure Souls", "Donda", "Kanye West"));

        System.out.println(playlist);

        System.out.println(playlist.size());

    }
    
}
