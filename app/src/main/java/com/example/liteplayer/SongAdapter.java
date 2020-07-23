package com.example.liteplayer;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SongAdapter extends BaseAdapter {
    private ArrayList<Song> songs;
    private LayoutInflater songInfl;
    public SongAdapter(Context c, ArrayList<Song> theSongs){
        songs = theSongs;
        songInfl = LayoutInflater.from(c);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return songs.size();
    }

    @Override
    public Object getItem(int arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        //map to song Layout
        LinearLayout songLay = (LinearLayout) songInfl.inflate(R.layout.song,parent,false);
        TextView songView = (TextView) songLay.findViewById(R.id.song_title);
        TextView artistView =(TextView) songLay.findViewById(R.id.song_artist);
        //Get song using position
        Song currentSong = songs.get(position);
        // get title and artist strings
        songView.setText(currentSong.getTitle());
        artistView.setText(currentSong.getArtist());
        songLay.setTag(position);
        return songLay;
    }
}
