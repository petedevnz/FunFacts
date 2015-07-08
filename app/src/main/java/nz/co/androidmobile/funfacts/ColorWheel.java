package nz.co.androidmobile.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by petet on 6/07/2015.
 */
public class ColorWheel {

    // Member variable (properties about the object)
    public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7",  // light gray
            "#F44336",
            "#E91E63",
            "#9C27B0",
            "#673AB7",
            "#3F51B5",
            "#2196F3",
            "#00BCD4",
            "#009688",
            "#03A9F4",
            "#4CAF50",
            "#8BC34A",
            "#CDDC39"
    };

    // Method (abilities: things the object can do)
    public int getColor() {

        String color = "";
        // Randomly select a fact
        Random randomGenerator = new Random(); // Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(mColors.length);

        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }
}