
import processing.core.*;
import vialab.SMT.*;
import java.awt.*;
import java.util.*;

public class Global 
{
	//get current time
	int hour, minute;
	//GregorianCalendar currDate = new GregorianCalendar();
	//hour = currDate.get(Calendar.HOUR);
	//minute = currDate.get(Calendar.MINUTE);
	
	//ImageZone progressBar = new ImageZone();
	Zone leftMain = new Zone();
	Zone rightMain = new Zone();
	
	//set font sizes
	Font movieTitleFont = new Font("Century Gothic", Font.PLAIN, 24);
	Font movieSummaryFont = new Font("Century Gothic", Font.PLAIN, 24);
	Font orderSummaryFont = new Font("Century Gothic", Font.PLAIN, 24);
		
	PImage currentMoviePosterImage;;
	String currentMovieTitle; 
	//create list of movie times
	
	int generalTicketQuantity;
	int childTicketQuantity;
	int seniorTicketQuantity;
	double generalTicketPrice = 10.50;
	double childTicketPrice = 7.99; 
	double seniorTicketPrice = 7.99;
	double generalTicketSubTotal;
	double childTicketSubTotal;
	double seniorTicketSubTotal;
	int OrderTotal;
	
	boolean popupVisible;
	
	int screenHeight = 768;
	int screenWidth = 1024;
	
	int progressBarHeight = 35;
	int panelHeight = screenHeight - progressBarHeight;
	int leftPanelWidth = 296;
	int rightPanelWidth = screenWidth - leftPanelWidth;
}
