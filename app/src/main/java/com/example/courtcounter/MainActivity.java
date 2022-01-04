package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }
    int score1 = 0;
    public void addThreeForTeamA(View v)
    {
        score1 = score1 + 3;
        displayForTeamA(score1);
    }
    public void addTwoForTeamA(View v)
    {
        score1 = score1 +2;
        displayForTeamA(score1);
    }
    public void addOneForTeamA(View v)
    {
        score1 = score1 +1;
        displayForTeamA(score1);
    }
    int score2 = 0;
    public void addThreeForTeamB(View v)
    {
        score2 = score2 + 3;
        displayForTeamB(score2);
    }
    public void addTwoForTeamB(View v)
    {
        score2 = score2 +2;
        displayForTeamB(score2);
    }
    public void addOneForTeamB(View v)
    {
        score2 = score2 +1;
        displayForTeamB(score2);
    }
    public void Reset(View v)
    {
        displayForTeamA(0);
        displayForTeamB(0);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
            * Displays the given score for Team B.
            */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */

}