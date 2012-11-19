
import processing.core.*;
import vialab.SMT.*;

import java.awt.*;
import java.util.*;

public class Global 
{
	//get current time
	public static int hour = 14;
	public static int minute = 45;
	//GregorianCalendar currDate = new GregorianCalendar();
	//hour = currDate.get(Calendar.HOUR);
	//minute = currDate.get(Calendar.MINUTE);
	public static TouchClient client;
	public static Zone fullScreenZone;
	public static Zone leftMain;
	public static Zone rightMain;
	public static ImageZone progressBar;
	public static PApplet applet;
	//Images
	public static PImage welcomingScreenImage;
	
	//set font sizes
	Font movieTitleFont = new Font("Century Gothic", Font.PLAIN, 24);
	Font movieSummaryFont = new Font("Century Gothic", Font.PLAIN, 24);
	Font orderSummaryFont = new Font("Century Gothic", Font.PLAIN, 24);
		
	public PImage currentMoviePosterImage;
	public static String currentMovieTitle;
	//create list of movie times
	
	public static ProgressBar pBar;
	public static leftPanel lPanel;
	public static ArrayList<Movie> movies = new ArrayList<Movie>();
	
	
	public int generalTicketQuantity;
	public int childTicketQuantity;
	public int seniorTicketQuantity;
	public double generalTicketPrice = 10.50;
	public double childTicketPrice = 7.99; 
	public double seniorTicketPrice = 7.99;
	public double generalTicketSubTotal;
	public double childTicketSubTotal;
	public double seniorTicketSubTotal;
	public int OrderTotal;
	
	public boolean popupVisible;
	
	public static int screenHeight = 768;
	public static int screenWidth = 1024;
	
	public static int progressBarHeight = 35;
	public static int panelHeight = screenHeight - progressBarHeight;
	public static int leftPanelWidth = 296;
	public static int rightPanelWidth = screenWidth - leftPanelWidth;
	
    public static int lastDrawnScreen = -1; 
    public static int currentScreen = 0;
    
    public void Reset()
    {
    	//reset ticket prices
    	generalTicketPrice = 0.0;
    	childTicketPrice = 0.0;
    	seniorTicketPrice = 0.0;
    	
    	//reset ticket quantities
    	generalTicketQuantity = 0;
    	childTicketQuantity = 0;
    	seniorTicketQuantity = 0;
    	
    	//reset current movie information
    	currentMovieTitle = "";
    	currentMoviePosterImage = null;
    	
    }
    
	  public void touchleftMain(Zone z)
	  {
		  
	  }
	  
	 public void drawleftMain(Zone Z)
	{
	}
}
