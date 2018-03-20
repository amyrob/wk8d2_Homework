package com.example.amy.mylistapplication;

import java.io.Serializable;

/**
 * Created by Amy on 20/03/2018.
 */

public class Song implements Serializable{
    private Integer ranking;
    private String songTitle;
    private String albumTitle;

    public Song(Integer ranking, String songTitle, String albumTitle) {
        this.ranking = ranking;
        this.songTitle = songTitle;
        this.albumTitle = albumTitle;
    }


    public Integer getRanking() {
        return this.ranking;
    }

    public String getTitle() {
        return this.songTitle;
    }

    public String getAlbum() {
        return this.albumTitle;
    }

}
