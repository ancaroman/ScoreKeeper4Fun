package com.example.anca.scorekeeper4fun;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Tracks the score for Team Leffe
    int scoreTeamLeffe=0;

    // Tracks the score for Team Peroni
    int scoreTeamPeroni=0;

    TextView scoreView1;
    TextView scoreView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreView1 = findViewById(R.id.team_leffe_score);
        scoreView2 = findViewById(R.id.team_peroni_score);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save UI state changes to the savedInstanceState.
        // This bundle will be passed to onCreate if the process is
        // killed and restarted.
        savedInstanceState.putInt("scoreTeamLeffe", scoreTeamLeffe);
        savedInstanceState.putInt("scoreTeamPeroni", scoreTeamPeroni);
        super.onSaveInstanceState(savedInstanceState);
    }
    //onRestoreInstanceState
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        // Restore UI state from the savedInstanceState.
        // This bundle has also been passed to onCreate.
        scoreTeamLeffe = savedInstanceState.getInt("scoreTeamLeffe");
        scoreTeamPeroni = savedInstanceState.getInt("scoreTeamPeroni");
        displayForTeamLeffe (scoreTeamLeffe);
        displayForTeamPeroni(scoreTeamPeroni);
    }

    /**
     * Increase the score for Team Leffe by 1 point.
     */
    public void addOneForTeamLeffe(View v) {
        scoreTeamLeffe = scoreTeamLeffe + 1;
        displayForTeamLeffe(scoreTeamLeffe);
    }

    /**
     * Increase the score for Team Leffe by 2 points.
     */
    public void addTwoForTeamLeffe(View v) {
        scoreTeamLeffe = scoreTeamLeffe + 2;
        displayForTeamLeffe(scoreTeamLeffe);
    }

    /**
     * Increase the score for Team Leffe by 3 points.
     */
    public void addThreeForTeamLeffe(View v) {
        scoreTeamLeffe = scoreTeamLeffe + 3;
        displayForTeamLeffe(scoreTeamLeffe);}

    /**
     * Displays the given score for Team Leffe.
     */
    public void displayForTeamLeffe(int score) {
        scoreView1.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team Peroni.
     */
    public void displayForTeamPeroni(int score) {
        scoreView2.setText(String.valueOf(score));
    }
    /**
     * Increase the score for Team Peroni by 1 point.
     */
    public void addOneForTeamPeroni(View v) {
        scoreTeamPeroni = scoreTeamPeroni + 1;
        displayForTeamPeroni(scoreTeamPeroni);
    }

    /**
     * Resets score for both teams back to 0.
     */
    public void resetScore (View v) {
        scoreTeamLeffe = 0;
        scoreTeamPeroni = 0;
        displayForTeamPeroni(scoreTeamPeroni);
        displayForTeamLeffe(scoreTeamLeffe);
    }

    /**
     * Increase the score for Team Peroni by 2 points.
     */
    public void addTwoForTeamPeroni(View v) {
        scoreTeamPeroni = scoreTeamPeroni + 2;
        displayForTeamPeroni(scoreTeamPeroni);
    }

    /**
     * Increase the score for Team Peroni by 3 points.
     */
    public void addThreeForTeamPeroni(View v) {
        scoreTeamPeroni = scoreTeamPeroni + 3;
        displayForTeamPeroni(scoreTeamPeroni);}



}

