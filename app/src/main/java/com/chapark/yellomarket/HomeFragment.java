package com.chapark.yellomarket;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chapark.yellomarket.Data.StoreItem;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }
    @BindView(R.id.rv_list_home)
    RecyclerView listView;


    MyAdapter mAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAdapter = new MyAdapter();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, view);
        listView.setAdapter(mAdapter);
        listView.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();

        List<StoreItem> list = new ArrayList<>();
        list.add(new StoreItem(ContextCompat.getDrawable(getContext(), R.drawable.home_1)));
        list.add(new StoreItem(ContextCompat.getDrawable(getContext(), R.drawable.home_2)));
        list.add(new StoreItem(ContextCompat.getDrawable(getContext(), R.drawable.home_3)));
        list.add(new StoreItem(ContextCompat.getDrawable(getContext(), R.drawable.home_4)));
        list.add(new StoreItem(ContextCompat.getDrawable(getContext(), R.drawable.home_5)));

        mAdapter.setItems(list);
    }

}
