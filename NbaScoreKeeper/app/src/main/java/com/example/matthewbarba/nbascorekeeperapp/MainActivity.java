package com.example.matthewbarba.nbascorekeeperapp;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int homeScore = 0;
    int awayScore = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//      Source for spinner code: https://developer.android.com/guide/topics/ui/controls/spinner
        Spinner spinnerHome = (Spinner) findViewById(R.id.spinner_home);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.nba_playoff_teams, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerHome.setAdapter(adapter);

        Spinner spinnerAway = (Spinner) findViewById(R.id.spinner_away);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(this,
                R.array.nba_playoff_teams, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerAway.setAdapter(adapter);

    }

    //    Find home team TextView score and change score
    public void displayForHomeTeam(int score) {
        TextView scoreView = findViewById(R.id.score_home);
        scoreView.setText(String.valueOf(score));
    }

    //    Find away team TextView score and change score
    public void displayForAwayTeam(int score) {
        TextView scoreView = findViewById(R.id.score_away);
        scoreView.setText(String.valueOf(score));
    }

    //    Away Team
    //    Bind to imageview id away_plus_one. add 1 to score when button is clicked
    public void awayTeamPlus1(View view) {
        awayScore = awayScore + 1;
        displayForAwayTeam(awayScore);
    }

    //    Bind to imageview id away_minus_one. subtract 1 to score when button is clicked
    public void awayTeamMinus1(View view) {
        if (awayScore <= 1) {
            awayScore = 0;
            Toast toast = Toast.makeText(getApplicationContext(), "The score cannot be less than 0!", Toast.LENGTH_SHORT);
            toast.show();
        } else {
            awayScore = awayScore - 1;
        }
        displayForAwayTeam(awayScore);
    }

    //    Bind to imageview id away_plus_two. add 2 to score when button is clicked
    public void awayTeamPlus2(View view) {
        awayScore = awayScore + 2;
        displayForAwayTeam(awayScore);
    }

    //    Bind to imageview id away_minus_two. subtract 2 to score when button is clicked
    public void awayTeamMinus2(View view) {
        if (awayScore <= 2) {
            awayScore = 0;
            Toast toast = Toast.makeText(getApplicationContext(), "The score cannot be less than 0!", Toast.LENGTH_SHORT);
            toast.show();
        } else {
            awayScore = awayScore - 2;
        }
        displayForAwayTeam(awayScore);
    }

    //    Bind to imageview id away_plus_three. add 3 to score when button is clicked
    public void awayTeamPlus3(View view) {
        awayScore = awayScore + 3;
        displayForAwayTeam(awayScore);
    }

    //    Bind to imageview id away_minus_three. subtract 3 to score when button is clicked
    public void awayTeamMinus3(View view) {
        if (awayScore <= 3) {
            awayScore = 0;
            Toast toast = Toast.makeText(getApplicationContext(), "The score cannot be less than 0!", Toast.LENGTH_SHORT);
            toast.show();
        } else {
            awayScore = awayScore - 3;
        }
        displayForAwayTeam(awayScore);
    }

    //    Home Team
    //    Bind to imageview id home_plus_one. add 1 to score when button is clicked
    public void homeTeamPlus1(View view) {
        homeScore = homeScore + 1;
        displayForHomeTeam(homeScore);
    }

    //    Bind to imageview id home_minus_one. subtract 1 to score when button is clicked
    public void homeTeamMinus1(View view) {
        if (homeScore <= 1) {
            homeScore = 0;
            Toast toast = Toast.makeText(getApplicationContext(), "The score cannot be less than 0!", Toast.LENGTH_SHORT);
            toast.show();
        } else  {
            homeScore = homeScore - 1;
        }
        displayForHomeTeam(homeScore);
    }

    //    Bind to imageview id home_plus_two. add 2 to score when button is clicked
    public void homeTeamPlus2(View view) {
        homeScore = homeScore + 2;
        displayForHomeTeam(homeScore);
    }

    //    Bind to imageview id home_minus_two. subtract 2 to score when button is clicked
    public void homeTeamMinus2(View view) {
        if (homeScore <= 2) {
            homeScore = 0;
            Toast toast = Toast.makeText(getApplicationContext(), "The score cannot be less than 0!", Toast.LENGTH_SHORT);
            toast.show();
        } else {
            homeScore = homeScore - 2;
        }
        displayForHomeTeam(homeScore);
    }

    //    Bind to imageview id home_plus_three. add 3 to score when button is clicked
    public void homeTeamPlus3(View view) {
        homeScore = homeScore + 3;
        displayForHomeTeam(homeScore);
    }

    //    Bind to imageview id home_minus_three. subtract 3 to score when button is clicked
    public void homeTeamMinus3(View view) {
        if (homeScore <= 3) {
            homeScore = 0;
            Toast toast = Toast.makeText(getApplicationContext(), "The score cannot be less than 0!", Toast.LENGTH_SHORT);
            toast.show();
        } else {
            homeScore = homeScore - 3;
        }
        displayForHomeTeam(homeScore);
    }

//    Reset Scores for home and away teams
    public void resetOnClick (View v)   {
        homeScore = 0;
        awayScore = 0;
        displayForHomeTeam(homeScore);
        displayForAwayTeam(awayScore);
    }
}
