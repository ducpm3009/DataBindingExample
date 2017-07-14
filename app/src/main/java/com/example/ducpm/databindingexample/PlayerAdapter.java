package com.example.ducpm.databindingexample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.ducpm.databindingexample.model.Player;
import java.util.ArrayList;

/**
 * Created by ducpm on 13/07/17.
 */

public class PlayerAdapter extends RecyclerView.Adapter<PlayerHolder> {

    private ArrayList<Player> mPlayerArrayList;

    public PlayerAdapter(ArrayList<Player> playerArrayList) {
        //        super();
        mPlayerArrayList = playerArrayList;
    }

    @Override
    public PlayerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View container = inflater.inflate(R.layout.item_player,parent,false);
        return new PlayerHolder(container);
    }

    @Override
    public void onBindViewHolder(PlayerHolder holder, int position) {
        holder.bindConnection(mPlayerArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return mPlayerArrayList.size();
    }
}
