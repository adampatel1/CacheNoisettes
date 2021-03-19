import javax.swing.*;

import java.awt.*;

public class Program {
    /**
    * 
     *This is the main method.
    */
    public static void main (String[] args)
    { 
        /**
        * s is an instance of the class Squirrel.
        * c is an instance of the class CacheNoisettes.
        */
        Squirrel s = new Squirrel ();
        CacheNoisettes c = new CacheNoisettes();
        /**
        * the setIcon method is used to add images to the screen.
        */
        c.setIcon(1, 2, s.RedSquirrel2);
        c.setIcon(1, 1, s.RedSquirrel1Nut);
        c.setIcon(2, 1, s.Flower);
        c.setIcon(2, 2, s.GreySquirrel1Nut);
        c.setIcon(3, 2, s.GreySquirrel2);
        /**
        * The getClass method is used to get the class of CacheNoisettes.
        */
        c.getClass();
       
        
       
    }
}
