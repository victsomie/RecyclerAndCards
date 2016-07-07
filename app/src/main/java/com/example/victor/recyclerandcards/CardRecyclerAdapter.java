package com.example.victor.recyclerandcards;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by victor on 7/7/16.
 */
public class CardRecyclerAdapter extends RecyclerView.Adapter<CardRecyclerAdapter.DataHolder> {


    //Create the data holder and #Create its constructor (That matches )
    //This represents how the text will be displayed
    public class DataHolder extends RecyclerView.ViewHolder{

        //Reference the items in your card by ID and initialize them inside the Dataholder constructor below
        TextView eventTitle;
        TextView eventPoster;
        TextView eventDetails;
        ImageView eventImage;
        Button eventJoin;
        Button eventLike;
        Button eventShare;


        public DataHolder(View itemView) {
            super(itemView);

            //references below
            eventImage = (ImageView) itemView.findViewById(R.id.imgUser);
            eventTitle = (TextView) itemView.findViewById(R.id.textEventTitle);
            eventPoster = (TextView) itemView.findViewById(R.id.textPostedby);
            eventDetails = (TextView) itemView.findViewById(R.id.textEventDetails);
            eventJoin= (Button) itemView.findViewById(R.id.buttonJoin);
            eventLike= (Button) itemView.findViewById(R.id.buttonLike);
            eventShare= (Button) itemView.findViewById(R.id.buttonShare);

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
