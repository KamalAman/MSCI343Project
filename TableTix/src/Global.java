
import processing.core.*;
import vialab.SMT.*;
import java.awt.*;
import java.util.*;
public class Global 
{
	public static Zone TestNextZone;
	public static ButtonZone backButtonZone;
	 public static PImage backButtonImage;
	 public static PImage backgroupImage;
	 public static PImage printingImage;
	 public static CircleButton circleButton;
	//get current time
	public static int hour = 1;
	public static int minute = 10;
	//GregorianCalendar currDate = new GregorianCalendar();
	//hour = currDate.get(Calendar.HOUR);
	//minute = currDate.get(Calendar.MINUTE);
	public static TouchClient client;
	public static Zone fullScreenZone;
	public static Zone leftMain;
	public static RightPanel rightMain;
	public static ImageZone progressBar;
	public static PApplet applet;
	//Images
	public static PImage welcomingScreenImage;
	public static PImage loadingScreenImage;
	
	public static String currentShowTime;	
	public static Movie currentMovie;
	//create list of movie times
	
	public static ProgressBar pBar;
	public static Movie[] movies = new Movie[12];
	
	
	public static int generalTicketQuantity;
	public static int childTicketQuantity;
	public static int seniorTicketQuantity;
	public static double generalTicketPrice = 10.50;
	public static double childTicketPrice = 7.99; 
	public static double seniorTicketPrice = 7.99;
	public static double generalTicketSubTotal;
	public static double childTicketSubTotal;
	public static double seniorTicketSubTotal;
	public static double OrderTotal;
	public static PFont fontCent;
	public static boolean popupVisible;
	public static WarningZone warningZone;
	public static ShowTimeZone showTimeZone;
	
	public static int screenHeight = 768;
	public static int screenWidth = 1024;
	
	public static int progressBarHeight = 35;
	public static int panelHeight = screenHeight - progressBarHeight;
	public static int leftPanelWidth = 296;
	public static int rightPanelWidth = screenWidth - leftPanelWidth;
	public static ArrayList<String> orderSummary;
	public static ArrayList<String> orderSummaryLineCost;
	public static String orderSummaryString;
	public static String orderSummaryLineCostString;
    public static int lastDrawnScreen = -1; 
    public static int currentScreen = 0;
    
    public static String generalString = "General";
    public static String childString = "Child";
    public static String seniorString = "Senior";
    public static TicketSelect currectTicketSelected = null;
    public static void Reset()
    {
    	
    	//reset ticket quantities
    	generalTicketQuantity = 0;
    	childTicketQuantity = 0;
    	seniorTicketQuantity = 0;
    	
    	//reset current movie
    	currentMovie = null;
    	
    }
    
}
