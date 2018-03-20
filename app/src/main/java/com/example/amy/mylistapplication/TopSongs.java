package com.example.amy.mylistapplication;

import java.util.ArrayList;

/**
 * Created by Amy on 20/03/2018.
 */

public class TopSongs {
    private ArrayList<Song> list;

    public TopSongs() {
        list = new ArrayList<Song>();
        list.add(new Song(1, "Guns and Horses", "Lights"));
        list.add(new Song(2, "Winter", "AWKOH, AWNOH"));
        list.add(new Song(3, "I Of The Storm", "Beneath The Skin"));
        list.add(new Song(4, "What's Wrong", "AWKOH, AWNOH"));
        list.add(new Song(5, "Last Friday Night", "Teenage Dream"));
    }

    public ArrayList<Song> getList() {
        return new ArrayList<Song>(list);
    }
}