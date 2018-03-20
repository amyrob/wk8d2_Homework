package com.example.amy.mylistapplication;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Amy on 20/03/2018.
 */

public class SongTest {
    Song song;

    @Before
    public void before() {
        song = new Song(5, "Tesselate", "An Awesome Wave");
    }

   @Test
    public void canGetRanking() {
       assertEquals((Integer)5, song.getRanking());
    }

    @Test
    public void canGetSongTitle() {
        assertEquals("Tesselate", song.getTitle());
    }

    @Test
    public void canGetAlbumTitle() {
        assertEquals("An Awesome Wave", song.getAlbum());
    }
}
