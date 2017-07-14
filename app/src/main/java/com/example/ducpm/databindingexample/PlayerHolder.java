package com.example.ducpm.databindingexample;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.example.ducpm.databindingexample.databinding.ItemPlayerBinding;
import com.example.ducpm.databindingexample.model.Player;

/**
 * Created by ducpm on 13/07/17.
 */

public class PlayerHolder extends RecyclerView.ViewHolder {
    private ItemPlayerBinding mBinding;

    public PlayerHolder(View binding) {
        super(binding);
        mBinding = DataBindingUtil.bind(binding);
    }



    public void bindConnection(Player player){
        mBinding.setPlayer(player);
    }
}
