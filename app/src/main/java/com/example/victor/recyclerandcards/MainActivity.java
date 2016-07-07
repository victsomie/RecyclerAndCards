package com.example.victor.recyclerandcards;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Reference variables here
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    //Arraylist where to add data
    ArrayList results = new ArrayList<DataObject>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);


        //Initializes references here
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view); //The recycler view to use put our recylces
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new CardRecyclerAdapter(getDataSet());//new instance of a class our adapter with data from the arraylist defined
        mRecyclerView.setAdapter(mAdapter); //uses the adapter(mAdapter) to put elements into



        //Fab button here
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }



    //Class to hold primary data here

    //Method to add data to arraylist
    private ArrayList<DataObject> getDataSet() {
        //ArrayList<DataObject> results = new ArrayList<DataObject>(); //Arraylist to take in objects
        for (int index = 0; index < 10; index++) {

            //Remember DataObject has three parameters
            DataObject obj = new DataObject(
                    "Will" + index,
                    "This " + index,
                    "Work " +index); //This defines the object


//            DataObject obj = new DataObject("Some Primary Text " + index,
//                    "Secondary " + index);
            results.add(index, obj); //Add the object to the arraylist
        }


        return results;

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
