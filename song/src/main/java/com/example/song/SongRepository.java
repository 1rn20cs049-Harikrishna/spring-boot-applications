package com.example.song;

import java.util.ArrayList;

public interface SongRepository {
    ArrayList<Song> getSongs();

    Song addSong(Song song);

    Song getSongById(int songId);

    Song updateSongById(int songId, Song song);

    void deleteSongById(int songId);

}
