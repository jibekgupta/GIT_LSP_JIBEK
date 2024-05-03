package org.howard.edu.lsp.oopfinal.question1;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SongsDatabaseTest {
    private SongsDatabase db;

    @Before
    public void setUp() {
        db = new SongsDatabase();
    }

    @Test
    public void testAddSong() {
        db.addSong("Rap", "Savage");
        db.addSong("Country", "Sweet Alabama");
        db.addSong("Jazz", "Always There");

        Set<String> rapSongs = db.getSongs("Rap");
        assertTrue(rapSongs.contains("Savage"));

        Set<String> countrySongs = db.getSongs("Country");
        assertTrue(countrySongs.contains("Sweet Alabama"));

        Set<String> jazzSongs = db.getSongs("Jazz");
        assertTrue(jazzSongs.contains("Always There"));
    }

    @Test
    public void testGetGenreOfSong() {
        db.addSong("Rap", "Savage");
        db.addSong("Country", "Sweet Alabama");
        db.addSong("Jazz", "Always There");

        assertEquals("Rap", db.getGenreOfSong("Savage"));
        assertEquals("Country", db.getGenreOfSong("Sweet Alabama"));
        assertEquals("Jazz", db.getGenreOfSong("Always There"));
    }

    @Test
    public void testGetSongs() {
        db.addSong("Rap", "Savage");
        db.addSong("Country", "Sweet Alabama");
        db.addSong("Jazz", "Always There");

        Set<String> rapSongs = db.getSongs("Rap");
        assertEquals(1, rapSongs.size());
        assertTrue(rapSongs.contains("Savage"));

        Set<String> countrySongs = db.getSongs("Country");
        assertEquals(1, countrySongs.size());
        assertTrue(countrySongs.contains("Sweet Alabama"));

        Set<String> jazzSongs = db.getSongs("Jazz");
        assertEquals(1, jazzSongs.size());
        assertTrue(jazzSongs.contains("Always There"));
    }
}
