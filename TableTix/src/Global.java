
import processing.core.*;
import vialab.SMT.*;

import java.awt.*;
import java.util.*;

public class Global 
{
	//get current time
	public int hour, minute;
	//GregorianCalendar currDate = new GregorianCalendar();
	//hour = currDate.get(Calendar.HOUR);
	//minute = currDate.get(Calendar.MINUTE);
	public static TouchClient client;
	public static Zone fullScreenZone = new Zone();
	public static Zone leftMain = new Zone();
	public static Zone rightMain = new Zone();
	public static ImageZone progressBar;
	public static PApplet applet;
	//Images
	public static PImage welcomingScreenImage;
	
	//set font sizes
	Font movieTitleFont = new Font("Century Gothic", Font.PLAIN, 24);
	Font movieSummaryFont = new Font("Century Gothic", Font.PLAIN, 24);
	Font orderSummaryFont = new Font("Century Gothic", Font.PLAIN, 24);
		
	public PImage currentMoviePosterImage;;
	public String currentMovieTitle; 
	//create list of movie times
	
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
	
	public int screenHeight = 768;
	public int screenWidth = 1024;
	
	public int progressBarHeight = 35;
	public int panelHeight = screenHeight - progressBarHeight;
	public int leftPanelWidth = 296;
	public int rightPanelWidth = screenWidth - leftPanelWidth;
	
    public static int lastDrawnScreen = -1; 
    public static int currentScreen = 0;
}
