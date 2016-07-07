package com.example.victor.recyclerandcards;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by victor on 7/7/16.
 */
public class CardRecyclerAdapter extends RecyclerView.Adapter<CardRecyclerAdapter.DataHolder> {


    //Create the data holder and #Create its constructor (That matches )
    //This represents how the text will be displayed
    public class DataHolder extends RecyclerView.ViewHolder{


        public DataHolder(View itemView) {
            super(itemView);



        }
    }



    @Override
    public DataHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(DataHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


}
