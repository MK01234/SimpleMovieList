package sg.edu.rp.c346.simplemovielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //step 1b create variable for UI

    ListView lvmovie;

    //step 2 create an arraylist

    ArrayList<String> alMovieList;

    //step 3a create an arrayAdapter
    ArrayAdapter<String> aaMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //step 1c link the UI to java
        lvmovie = findViewById(R.id.listViewMovie);
        //step 2b create object
        alMovieList = new ArrayList<>();
        //step 2c Add data to ArrayList
        alMovieList.add("Avengers Release date: 2018.04");
        alMovieList.add("Justice League Realease Date: 2017.11");

        //step 3b initializing the arrayAdapter and link the arraylist
        aaMovie = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alMovieList);

        //step 4 link the listView to arrayAdapter
        lvmovie.setAdapter(aaMovie);


    }
}
