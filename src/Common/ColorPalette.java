package Common;

import java.awt.*;
import java.util.Arrays;

/**
 * Creates a Color Palette with 3375 colors. (256/16)*3 colors values.
 * Created by Andreas Andersson & David Isberg on 2016-01-19.
 */
public class ColorPalette {

    RGB[] rgbColors;

    /**
     * Constructor
     */
    public ColorPalette(){
        initPalette();
    }

    /**
     * Initializes the Palette.
     */
    private void initPalette(){
        rgbColors =new RGB[3375];
        int pos=0;

        for( int r=10;r<250;r+=16){
            for( int g=10;g<250;g+=16){
                for( int b=10;b<250;b+=16){
                    RGB rgb=new RGB();
                    rgb.setRed(r);
                    rgb.setGreen(g);
                    rgb.setBlue(b);

                    rgbColors[pos++]=rgb;

                }
            }
        }
    }

    /**
     * Returns Palette.
     * @return RGB[]
     */
    public RGB[] getRGBArray(){
        return rgbColors;
    }

    /**
     * Main method for testing.
     * @param args
     */
    public static void main(String [] args){
        new ColorPalette();
    }

}
