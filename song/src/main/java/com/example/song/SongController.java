package com.example.song;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class SongController {
    SongService songService = new SongService();

    @GetMapping("/songs")
    public ArrayList<Song> getSongs() {
        return songService.getSongs();
    }

    @PostMapping("/songs")
    public Song addSong(@RequestBody Song song) {
        return songService.addSong(song);
    }

    @GetMapping("/songs/{songId}")
    public Song getSongById(@PathVariable("songId") int songId) {
        return songService.getSongById(songId);
    }

    @PutMapping("/songs/{songId}")
    public Song updateSongById(@PathVariable("songId") int songId, @RequestBody Song song) {
        return songService.updateSongById(songId, song);
    }

    @DeleteMapping("/songs/{songId}")
    public void deleteSongById(@PathVariable("songId") int songId) {
        songService.deleteSongById(songId);
    }

}