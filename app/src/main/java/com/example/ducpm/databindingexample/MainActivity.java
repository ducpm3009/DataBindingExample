package com.example.ducpm.databindingexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.example.ducpm.databindingexample.model.Player;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private PlayerAdapter mAdapter;
    private RecyclerView mRecyclerView;
    private List<Player> mPlayerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //

        //        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout
        // .activity_main);
        //        Player player = new Player("Danil", "Dendi");
        //        binding.setPlayer(player);
        //        AdapterPlayerBinding binding =
        //                DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
        //                        R.layout.item_player, parent, false);


        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mPlayerList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Player player = new Player("Amer Al-Barkawi", "Miracle-");
            mPlayerList.add(player);
        }
        mAdapter = new PlayerAdapter((ArrayList<Player>) mPlayerList);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mAdapter);
    }
}
