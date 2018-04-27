package com.fahimshahrierrasel.funfacts;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvFactText;
    ConstraintLayout parentLayout;
    Button btnChangeFact;
    Facts facts;
    String factType;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvFactText = findViewById(R.id.tv_fact_text);
        parentLayout = findViewById(R.id.parent_layout);
        btnChangeFact = findViewById(R.id.btn_change_fact);

        factType = "random";
        facts = new Facts();

        tvFactText.setText(facts.getRandomFact(factType));
        parentLayout.setBackgroundColor(Color.parseColor(facts.getRandomColor()));

        btnChangeFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeFunFactsAndColor();
            }
        });

        btnChangeFact.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                changeFunFactsOnly();
                return true;
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.fact_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.random_fact:
                factType = "random";
                if(getSupportActionBar() != null)
                    getSupportActionBar().setTitle("Random Facts");
                break;
            case R.id.food_fact:
                factType = "food";
                if(getSupportActionBar() != null)
                    getSupportActionBar().setTitle("Food Facts");
                break;
            case R.id.game_fact:
                factType = "game";
                if(getSupportActionBar() != null)
                    getSupportActionBar().setTitle("Game Facts");
                break;
            default:
                factType = "random";
                if(getSupportActionBar() != null)
                    getSupportActionBar().setTitle("Random Facts");
                break;
        }
        changeFunFactsOnly();
        return super.onOptionsItemSelected(item);
    }

    public void changeFunFactsAndColor() {
        tvFactText.setText(facts.getRandomFact(factType));
        parentLayout.setBackgroundColor(Color.parseColor(facts.getRandomColor()));
    }
    public void changeFunFactsOnly() {
        tvFactText.setText(facts.getRandomFact(factType));
    }
}
