package com.tomrer.klisterdk.tomrer;

import android.graphics.Color;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Christian on 19-May-17.
 */

public class HighlightMesterResult {

    public static boolean highlight(ImageView image, boolean isSelected)  {


        if (isSelected) {
            // Unselect
            image.setColorFilter(Color.argb(0, 0, 0, 0));

            return false;
        } else {
            // Select
            image.setColorFilter(Color.argb(88, 255, 255, 128));
           return true;

        }

    }

    public static boolean unHighlight(ImageView image1, boolean unSelected)  {


        if (unSelected) {
            // Unselect
            image1.setColorFilter(Color.argb(0, 0, 0, 0));

            return false;
        } else {
            // Select

            return false;
        }

    }

    public static boolean choise(Button send , boolean choises){

        if (choises){

            return true;

        }else {

            return false;
        }
    }


}
