package com.example.amy.mylistapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Amy on 20/03/2018.
 */

public class TopSongsAdapter extends ArrayAdapter<Song> {
    public TopSongsAdapter(Context context, ArrayList<Song> list) {
        super(context, 0, list);}

        @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
            Song currentSong = getItem(position);

            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.song_item, parent, false);
            }
            TextView ranking = listItemView.findViewById(R.id.ranking);
            ranking.setText(currentSong.getRanking().toString());

            TextView song = listItemView.findViewById(R.id.song);
            song.setText(currentSong.getTitle());

            TextView album = listItemView.findViewById(R.id.album);
            album.setText(currentSong.getAlbum());

            listItemView.setTag(currentSong);
            return listItemView;
        }

}
