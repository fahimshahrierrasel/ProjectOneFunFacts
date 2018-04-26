package com.fahimshahrierrasel.funfacts;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvFactText;
    ConstraintLayout parentLayout;
    Button btnChangeFact;

    String[] facts = {
            "If you somehow found a way to extract all of the gold from the bubbling core of our lovely little planet, you would be able to cover all of the land in a layer of gold up to your knees."
            , "The average person spends 6 months of their lifetime waiting on a red light to turn green."
            , "A U.S. dollar bill can be folded approximately 4,000 times in the same place before it will tear."
            , "A sneeze travels about 100 miles per hour."
            , "A broken clock is right two times every day."
            , "Banging your head against a wall burns 150 calories an hour."
    };
    String[] backgroundColors = {
            "#F44336",
            "#E91E63",
            "#9C27B0",
            "#673AB7",
            "#009688",
            "#FFEB3B"
    };

    int counter = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvFactText = findViewById(R.id.tv_fact_text);
        parentLayout = findViewById(R.id.parent_layout);
        btnChangeFact = findViewById(R.id.btn_change_fact);

        tvFactText.setText(facts[0]);
        parentLayout.setBackgroundColor(Color.parseColor(backgroundColors[0]));

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

    public void changeFunFactsAndColor() {
        if (counter == facts.length)
            counter = 0;
        tvFactText.setText(facts[counter]);
        parentLayout.setBackgroundColor(Color.parseColor(backgroundColors[counter]));
        counter++;
    }
    public void changeFunFactsOnly() {
        if (counter == facts.length)
            counter = 0;
        tvFactText.setText(facts[counter]);
        counter++;
    }
}
