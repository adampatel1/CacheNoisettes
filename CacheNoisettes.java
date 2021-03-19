import javax.swing.*;
import java.awt.*;
/**
 * This class provides a simple window in which CacheNoisettes game is displayed. 
 * @author Adam Patel
 */

public class CacheNoisettes
{ 

    private JFrame a = new JFrame(); // Create a blank window
    private JPanel panel =new JPanel();// Create a panel
    private Picture empty1 = new Picture("Empty.png",0); // the is an image of empty brown picture.
    private Picture hole1 = new Picture("Hole.png",0); // this is an image of hole.
    private JButton button1[][] = new JButton[4][4];// Create a 2D array of 16 buttons.
    
    
     /**
	 * Constructor.Create a view of a CacheNoisettes.
    * 
    **/
    public CacheNoisettes() 
     {  
       // Size of playarea
        GridLayout layout = new GridLayout(4,4);// Create a grid layout with 4 rows and 4 columns
        panel.setLayout(layout);// Use layout on panel
        
        a.setSize(300,300);// Change window size
        a.setTitle("Cache Noisettes");// Change window title
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// terminate application
        a.setVisible(true);// Make it visible
        
         for(int i = 0;i< 4; i++)// This is a double for loop creating a 4*4 grid of buttons.
         { 
            for(int j = 0;j< 4; j++)
            {
               
               button1[i][j]  = new JButton(empty1); // This is adding an image to each button.   
               panel.add(button1[i][j]);// this is adding the buttin the panel.
                  
                  if ((i == 0 && j == 2)){// This is an if condition for when to set the button's image to a hole.
                     button1[i][j].setIcon(hole1);
                  }   
                  if ((i == 1 && j == 0)){
                     button1[i][j].setIcon(this.hole1);
                  }      
                  if ((i == 2 && j == 1)){
                     button1[i][j].setIcon(this.hole1);
                  }  
                  if ((i == 3 && j == 3)){
                     button1[i][j].setIcon(this.hole1);
                 }    
            }
         }        
        
         a.setContentPane(panel); //Use panel on window
      }


    
   
   
   /**
	 * Update the size of the CacheNoisetters.
	 *
	 * @param x the x cordinate  of the window..
	 * @param y the y cordinate of the window.
    * @param p the new picture of the window.
	 */
   
    public void setIcon(int x,int y, Picture p)
   {
      button1[x][y].setIcon(p);
   }
  
 	
	
	
	
 
}


   
   
