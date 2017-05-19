package com.tomrer.klisterdk.tomrer;

import android.graphics.Color;
import android.widget.ImageView;

/**
 * Created by Christian on 19-May-17.
 */

public class HighlightMesterResult {

    public static boolean highlight(ImageView image, boolean isSelected) {


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


}
