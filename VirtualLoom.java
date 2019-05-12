/*David Lee and Justin Freemantle
October 11th/2017
Ms. Krasteva
This program will display a beautiful flower virtual bead loom design. It uses overloaded methods, for loops to create the display*/

import java.awt.*;
import hsa.Console;

public class VirtualLoom
{
    Console c;

    Color w = Color.white;
    Color g = Color.gray;
    Color p = Color.pink;
    Color l = new Color (51, 255, 51);
    Color d = new Color (0, 51, 25);
    Color y = Color.yellow;
    Color r = Color.red;

    int k = 0;
    int j = 0;
    public VirtualLoom ()
    {
	c = new Console ("Virtual Bead Loom");
    }


    public void title ()
    {
	c.print (' ', 35);
	c.print ("Virtual Bead Loom");
    }


    public void intro ()
    {
	c.println ();
	c.println ();
	c.print (' ', 2);
	c.print ("This program will display our design of a bead loom, press a key to see it! :)");
	char input = c.getChar ();
    }


    private void draw (int block, Color color)
    {
	for (int q = 1 ; q <= block ; q++)
	{

	    c.setColor (color);
	    c.fillOval (215 + 10 * k, 125 + j, 10, 10);
	    k++;
	    
	    
	    try
	    {
		Thread.sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	    
	}
    }


    public void draw (int block, Color color, boolean line)
    {
	for (int q = 1 ; q <= block ; q++)
	{
	    c.setColor (color);
	    c.fillOval (215 + 10 * k, 125 + j, 10, 10);
	    k++;

	    try
	    {
		Thread.sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	}
	j += 10;
	k = 0;

    }


    public void display ()
    {
	c.clear ();

	draw (7, w);
	draw (4, g);
	draw (3, w);
	draw (4, g);
	draw (7, w, true);
	draw (1, w);
	draw (4, g);
	draw (1, w);
	draw (1, g);
	draw (4, w);
	draw (3, g);
	draw (4, w);
	draw (1, g);
	draw (1, w);
	draw (4, g);
	draw (1, w, true);        
	draw (1, w);
	draw (1, g);
	draw (3, l);
	draw (1, g);
	draw (1, w);
	draw (3, p);
	draw (5, w);
	draw (3, p);
	draw (1, w);
	draw (1, g);
	draw (3, l);
	draw (1, g);
	draw (1, w, true);    
	draw (1, w);
	draw (1, g);
	draw (3, l);
	draw (1, g);
	draw (1, w);
	draw (11, p);
	draw (1, w);
	draw (1, g);
	draw (3, l);
	draw (1, g);
	draw (1, w, true);        
	draw (1, w);
	draw (1, g);
	draw (2, l);
	draw (1, d);
	draw (1, g);
	draw (1, w);
	draw (11, p);
	draw (1, w);
	draw (1, g);
	draw (1, d);
	draw (2, l);
	draw (1, g);
	draw (1, w, true);        
	draw (2, w);
	draw (4, g);
	draw (1, r);
	draw (11, p);
	draw (1, r);
	draw (4, g);
	draw (2, w, true);        
	draw (1, w);
	draw (1, g);
	draw (3, w);
	draw (1, r);
	draw (1, g);
	draw (1, r);
	draw (9, p);
	draw (1, r);
	draw (1, g);
	draw (1, r);
	draw (3, w);
	draw (1, g);
	draw (1, w, true);       
	draw (1, g);
	draw (1, w);
	draw (4, p);
	draw (1, r);
	draw (1, g);
	draw (1, r);
	draw (3, p);
	draw (1, r);
	draw (3, p);
	draw (1, r);
	draw (1, g);
	draw (1, r);
	draw (4, p);
	draw (1, w);
	draw (1, g, true);        
	draw (1, g);       
	draw (1, w);
	draw (5, p);
	draw (1, r);
	draw (1, g);
	draw (1, r);
	draw (1, p);
	draw (3, r);
	draw (1, p);
	draw (1, r);
	draw (1, g);
	draw (1, r);
	draw (5, p);
	draw (1, w);
	draw (1, g, true);        
	draw (1, g);
	draw (1, w);
	draw (6, p);
	draw (1, r);
	draw (1, g);
	draw (5, r);
	draw (1, g);
	draw (1, r);
	draw (6, p);
	draw (1, w);
	draw (1, g, true);        
	draw (1, g);
	draw (2, w);
	draw (6, p);
	draw (1, r);
	draw (2, g);
	draw (1, y);
	draw (2, g);
	draw (1, r);
	draw (6, p);
	draw (2, w);
	draw (1, g, true);  
	draw (1, w);
	draw (1, g);
	draw (1, w);
	draw (5, p);
	draw (2, r);
	draw (1, g);
	draw (3, y);
	draw (1, g);
	draw (2, r);
	draw (5, p);
	draw (1, w);
	draw (1, g);
	draw (1, w, true);
	draw (1, w);
	draw (1, g);
	draw (1, w);
	draw (4, p);
	draw (3, r);
	draw (5, y);
	draw (3, r);
	draw (4, p);
	draw (1, w);
	draw (1, g);
	draw (1, w, true);
	draw (1, w);
	draw (1, g);
	draw (1, w);
	draw (5, p);
	draw (2, r);
	draw (1, g);
	draw (3, y);
	draw (1, g);
	draw (2, r);
	draw (5, p);
	draw (1, w);
	draw (1, g);
	draw (1, w, true);
	draw (1, g);
	draw (2, w);
	draw (6, p);
	draw (1, r);
	draw (2, g);
	draw (1, y);
	draw (2, g);
	draw (1, r);
	draw (6, p);
	draw (2, w);
	draw (1, g, true);
	draw (1, g);
	draw (1, w);
	draw (6, p);
	draw (1, r);
	draw (1, g);
	draw (5, r);
	draw (1, g);
	draw (1, r);
	draw (6, p);
	draw (1, w);
	draw (1, g, true);
	draw (1, g);
	draw (1, w);
	draw (5, p);
	draw (1, r);
	draw (1, g);
	draw (1, r);
	draw (1, p);
	draw (3, r);
	draw (1, p);
	draw (1, r);
	draw (1, g);
	draw (1, r);
	draw (5, p);
	draw (1, w);
	draw (1, g, true);
	draw (1, g);
	draw (1, w);
	draw (4, p);
	draw (1, r);
	draw (1, g);
	draw (1, r);
	draw (3, p);
	draw (1, r);
	draw (3, p);
	draw (1, r);
	draw (1, g);
	draw (1, r);
	draw (4, p);
	draw (1, w);
	draw (1, g, true);
	draw (1, w);
	draw (1, g);
	draw (3, w);
	draw (1, r);
	draw (1, g);
	draw (1, r);
	draw (9, p);
	draw (1, r);
	draw (1, g);
	draw (1, r);
	draw (3, w);
	draw (1, g);
	draw (1, w, true);
	draw (2, w);
	draw (4, g);
	draw (1, r);
	draw (11, p);
	draw (1, r);
	draw (4, g);
	draw (2, w, true);
	draw (1, w);
	draw (1, g);
	draw (2, l);
	draw (1, d);
	draw (1, g);
	draw (1, w);
	draw (11, p);
	draw (1, w);
	draw (1, g);
	draw (1, d);
	draw (2, l);
	draw (1, g);
	draw (1, w, true);
	draw (1, w);                    
	draw (1, g);
	draw (3, l);
	draw (1, g);
	draw (1, w);
	draw (11, p);
	draw (1, w);
	draw (1, g);
	draw (3, l);
	draw (1, g);
	draw (1, w, true);
	draw (1, w);
	draw (1, g);
	draw (3, l);
	draw (1, g);
	draw (1, w);
	draw (3, p);
	draw (5, w);
	draw (3, p);
	draw (1, w);
	draw (1, g);
	draw (3, l);
	draw (1, g);
	draw (1, w, true);
	draw (1, w);
	draw (4, g);
	draw (1, w);
	draw (1, g);
	draw (4, w);
	draw (3, g);
	draw (4, w);
	draw (1, g);
	draw (1, w);
	draw (4, g);
	draw (1, w, true);
	draw (7, w);
	draw (4, g);
	draw (3, w);
	draw (4, g);
	draw (7, w, true);
    }


    public static void main (String[] args)
    {
	VirtualLoom v = new VirtualLoom ();
	v.title ();
	v.intro ();
	v.display ();
    }
}


