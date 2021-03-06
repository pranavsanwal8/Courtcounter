package com.example.pranav.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }

    public void addThreeForTeamA(View view) {
        scoreA = scoreA+3;
        displayForTeamA(scoreA);

    }

    public void addTwoForTeamA(View view) {
        scoreA = scoreA+2;
        displayForTeamA(scoreA);

    }

    public void addOneForTeamA(View view) {
        scoreA = scoreA+1;
        displayForTeamA(scoreA);

    }

    public void displayForTeamB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }

    public void addThreeForTeamB(View view) {
        scoreB = scoreB+3;
        displayForTeamB(scoreB);

    }

    public void addTwoForTeamB(View view) {
        scoreB = scoreB+2;
        displayForTeamB(scoreB);

    }

    public void addOneForTeamB(View view) {
        scoreB = scoreB+1;
        displayForTeamB(scoreB);

    }

    public void reset (View view) {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

}

