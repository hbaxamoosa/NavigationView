package com.android4dev.navigationview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ItemFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.item_layout, container, false);
        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(mLayoutManager);
        ItemData itemsData[] = {
                new ItemData("Help", R.drawable.ic_drawer),
                new ItemData("Delete", R.drawable.ic_drawer),
                new ItemData("Cloud", R.drawable.ic_drawer),
                new ItemData("Favorite", R.drawable.ic_drawer),
                new ItemData("Like", R.drawable.ic_drawer),
                new ItemData("Rating", R.drawable.ic_drawer),
                new ItemData("Help", R.drawable.ic_drawer),
                new ItemData("Delete", R.drawable.ic_drawer),
                new ItemData("Cloud", R.drawable.ic_drawer),
                new ItemData("Favorite", R.drawable.ic_drawer),
                new ItemData("Like", R.drawable.ic_drawer),
                new ItemData("Rating", R.drawable.ic_drawer)
        };
        MyAdapter mAdapter = new MyAdapter(itemsData);
        recyclerView.setAdapter(mAdapter);
        return v;
    }
}
