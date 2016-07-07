package com.example.victor.recyclerandcards;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by victor on 7/7/16.
 */
public class CardRecyclerAdapter extends RecyclerView.Adapter<CardRecyclerAdapter.DataHolder> {

    private ArrayList<DataObject> mDataset;//Arraylist that will hold the data


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



    //This is your class constructor that will take Arraylist containing DataObject(you definedd this in a different class) you created
    public CardRecyclerAdapter(ArrayList<DataObject> mDataset) {
        mDataset = mDataset;
    }



    //Define which view t recycle
    @Override
    public DataHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //Inflate you card view
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.my_card, parent, false);

        DataHolder dataHolder = new DataHolder(view); //This say, our data holder viewis the view we have defined above(Which is our card)

        return dataHolder; //Returns that dataHolder, which now is the card
    }

    @Override
    public void onBindViewHolder(DataHolder holder, int position) {


        //Inside the onBindViewHolder, bind the items in the arralist(mDataSet) to the ones in your card view (in the DataHolder)
        holder.eventTitle.setText(mDataset.get(position).getmText1());
        holder.eventPoster.setText(mDataset.get(position).getmText2());
        holder.eventDetails.setText(mDataset.get(position).getmText3());
    }


    //Method to data objects into our arraylist (mDataSet)
    public void addItem(DataObject dataObj, int index) {
        mDataset.add(index, dataObj); //added the item passed to that index
        notifyItemInserted(index); //Notifies of the insertion
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
