package com.fahimshahrierrasel.funfacts;

import java.security.SecureRandom;

public class Facts {

    String[] foodfacts = {
            "Banana is radio active."
            , "Tomato is a fruit."
            , "Watermelon is actually a vegetable."
            , "In Bangladesh orange is tangerine and tangerine is orange."
            , "200 gm peanuts can fulfil one meal."
            , "Banging your head against a wall burns 150 calories an hour."
    };

    String[] gamefacts = {
            "Football is the only game which is called the game."
            , "Paladins is called the KING OF ALL GAME, when it comes to bug."
            , "Can you really score against Buffon in FIFA?"
            , "Golf is a game for rich people"
            , "Brazil won the WroldCup 5 times."
            , "Kaka won every types of trophies."
    };

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

    public String getRandomFact(String factType){
        String fact = "";
        int randomNumber = new SecureRandom().nextInt(facts.length);
        switch (factType) {
            case "random":
                fact = facts[randomNumber];
                break;
            case "food":
                fact = foodfacts[randomNumber];
                break;
            case "game":
                fact = gamefacts[randomNumber];
                break;
        }
        return fact;
    }

    public String getRandomColor(){
        int randomNumber = new SecureRandom().nextInt(facts.length);
        return backgroundColors[randomNumber];
    }
}
