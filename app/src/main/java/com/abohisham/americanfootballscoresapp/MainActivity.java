package com.abohisham.americanfootballscoresapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTA = 0;
    int scoreTB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void teamAtouchdown(View view) {
        scoreTA += 6;
        UpdateTeamAscore(scoreTA);
    }

    public void teamAfieldgoal(View view) {
        scoreTA += 3;
        UpdateTeamAscore(scoreTA);
    }

    public void teamAsafety(View view) {
        scoreTB += 2;
        UpdateTeamBscore(scoreTB);
    }

    private void UpdateTeamAscore(int val) {
        TextView v = findViewById(R.id.teamAscore_text_view);
        v.setText(String.valueOf(val));
    }

    public void teamBtouchdown(View view) {
        scoreTB += 6;
        UpdateTeamBscore(scoreTB);
    }


    public void teamBfieldgoal(View view) {
        scoreTB += 3;
        UpdateTeamBscore(scoreTB);
    }

    public void teamBsafety(View view) {
        scoreTA += 2;
        UpdateTeamAscore(scoreTA);
    }

    private void UpdateTeamBscore(int val) {
        TextView v = findViewById(R.id.teamBscore_text_view);
        v.setText(String.valueOf(val));
    }

    public void Reset(View view) {
        scoreTA = 0;
        scoreTB = 0;
        UpdateTeamAscore(scoreTA);
        UpdateTeamBscore(scoreTB);
    }
}
