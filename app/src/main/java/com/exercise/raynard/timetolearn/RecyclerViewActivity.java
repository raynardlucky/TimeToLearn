package com.exercise.raynard.timetolearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        initializeData();

        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        RVAdapter adapter = new RVAdapter(movies);
        rv.setAdapter(adapter);
    }

    private List<MovieData> movies;

    private void initializeData() {
        movies = new ArrayList<>();
        movies.add(new MovieData("Captain Marvel",
                "https://m.media-amazon.com/images/M/MV5BMTE0YWFmOTMtYTU2ZS00ZTIxLWE3OTEtYTNiYzBkZjViZThiXkEyXkFqcGdeQXVyODMzMzQ4OTI@._V1_.jpg",
                "2019"));
        movies.add(new MovieData("Avengers : Infinity War",
                "https://images-na.ssl-images-amazon.com/images/I/A1t8xCe9jwL._SY679_.jpg",
                "2018"));
        movies.add(new MovieData("Aquaman",
                "https://i.redd.it/mioxrsm1sma11.jpg",
                "2018"));
        movies.add(new MovieData("Doctor Strange",
                "https://images-na.ssl-images-amazon.com/images/I/71gyLVWIfIL._SY606_.jpg",
                "2016"));
        movies.add(new MovieData("Antman and The Wasp",
                "https://m.media-amazon.com/images/M/MV5BYjcyYTk0N2YtMzc4ZC00Y2E0LWFkNDgtNjE1MzZmMGE1YjY1XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UX182_CR0,0,182,268_AL_.jpg",
                "2018"));
    }
}
