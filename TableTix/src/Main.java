
import java.util.ArrayList;
import java.util.Timer;

import android.R.integer;
import processing.core.*;
import vialab.SMT.*;

public class Main extends PApplet 
{
	  int loaded = 0;
	  Zone loadingZone;
	  long printingScreenTime;
	  //Set preLoad to true if you want to have the system render its content before it starts functioning
	  Boolean preLoad = true;

	  public void setup() 
	  {	
	    size(1024,768, P3D);
	    Global.client = new TouchClient(this, TouchSource.MOUSE);
	    
	    Global.applet = this;
	    Global.fontCent = Global.applet.createFont("Century Gothic", 60,true);
	    textFont( Global.fontCent);
	    Global.pBar = new ProgressBar();
	    Global.leftMain = new LeftPanel();
	    Global.rightMain = new RightPanel();
	    SetMovieInfo theMovies = new SetMovieInfo();
	    Global.welcomingScreenImage = loadImage("..//Image//TableTix_Part1.png");
	    Global.loadingScreenImage = loadImage("..//Image//Loading Screen.png");
	    Global.backButtonImage = Global.applet.loadImage("..//Image/Buttons//navigation.png");
	    Global.printingImage = Global.applet.loadImage("..//Image//TableTix w Seating_Part15.png");
	  }

	  public void draw() 
	  { 
		 if(loaded == 0 && preLoad)
		 {
			 loadingZone = new ImageZone("loading",  Global.loadingScreenImage, 0, 0, 1024,768);
			
			 Global.client.add(Global.leftMain);
			 Global.client.add(Global.rightMain);
			 Global.client.add(loadingZone);
			 for(int i = 0; i < Global.movies.length; ++i)
			 {
				   Global.rightMain.add(Global.movies[i]);
				  
			 }
			 Global.client.putZoneOnTop(loadingZone);
			 ++loaded;
		 }
		 else if(loaded <= 12 && preLoad)
		 {
			 Global.currentMovie = Global.movies[loaded-1];
			 ++loaded;
			 
		 }
		 else if(loaded == 13 && preLoad)
		 {

			 Global.currentMovie = null;
			 for(int i = 0; i < Global.movies.length; ++i)
			 {
				   Global.rightMain.remove(Global.movies[i]);
				  
			 }
			 Global.client.remove(Global.leftMain);
			 Global.client.remove(Global.rightMain);
			 Global.client.remove(loadingZone);
			 ++loaded;
		 }
		 else {
	
		    switch (Global.currentScreen) {
			case 1:
				if(Global.lastDrawnScreen != Global.currentScreen)
			    {
					 
					 Global.client.add(Global.leftMain);
					 Global.client.add(Global.rightMain);

					for(int i = 0; i < Global.movies.length; ++i)
					{
					    Global.rightMain.add(Global.movies[i]);
					}

					 Global.pBar.SetProgressBar();
					 Global.showTimeZone = new ShowTimeZone();
					 Global.leftMain.add(Global.showTimeZone);
			    }
				 if(Global.popupVisible && Global.warningZone == null)
				 {
					 Global.warningZone = new WarningZone();
					 Global.client.add(Global.warningZone);
					 Global.client.putZoneOnTop(Global.warningZone);
				 }
				 else if(!Global.popupVisible && Global.warningZone != null)
				 {
					 Global.client.remove(Global.warningZone);
					 Global.warningZone = null;
				 }
				
				break;
			case 2:
				if(Global.lastDrawnScreen != Global.currentScreen)
			    {
					Global.pBar.SetProgressBar();
					Global.showTimeZone = new ShowTimeZone();
					Global.leftMain.add(Global.showTimeZone);
					Global.backButtonZone = new ButtonZone("BackButton",5, 615, 275, 95);
					Global.client.add(Global.backButtonZone);
			    }
				
				//ticket selection screen
				break;
			case 3:
				if(Global.lastDrawnScreen != Global.currentScreen)
			    {
					Global.pBar.SetProgressBar();
			    }
				
				//Concession Screen
				break;
			case 4:
				if(Global.lastDrawnScreen != Global.currentScreen)
			    {
					Global.pBar.SetProgressBar();
			    }
				
				//Check out screen
				break;
			case 5:
				if(Global.lastDrawnScreen != Global.currentScreen)
			    {
					Global.pBar.RemoveProgressBar();
			    
					Global.fullScreenZone = new ImageZone("PrintingScreen",Global.printingImage, 0,0, width,height);
					Global.client.add(Global.fullScreenZone);
					Global.client.putZoneOnTop(Global.fullScreenZone);
					printingScreenTime = System.currentTimeMillis();
			    }
				
				//Ticket Printing Screen
				//pause for 5 seconds and witch currentScreen to 0
				break;		
			default:
				if(Global.lastDrawnScreen != Global.currentScreen)
			    {
					
					Global.fullScreenZone = new ImageZone("TouchToStart",  Global.welcomingScreenImage, 0, 0, 1024,768);
					Global.client.add(Global.fullScreenZone);
					Global.pBar.RemoveProgressBar();
			    }
				//Welcome screen
				//check if variables are cleared, clear them if they are not
				break;
			}
		    if(Global.lastDrawnScreen != Global.currentScreen)
		    {
		    	//deactivate last screen
		    	if(Global.lastDrawnScreen == 0)
		    	{
		    		Global.client.remove(Global.fullScreenZone);
		    	}
		    	if(Global.lastDrawnScreen == 1)
		    	{
		    		Global.client.remove(Global.warningZone);
		    		Global.leftMain.remove(Global.showTimeZone);
					for(int i = 0; i < Global.movies.length; ++i)
					{
						   Global.rightMain.remove(Global.movies[i]);
						  
					}
		    		
		    	}
		    	if(Global.lastDrawnScreen == 2 && Global.currentScreen == 1)
		    	{
		    		Global.client.remove(Global.backButtonZone);
		    	}
		    	if(Global.currentScreen == 5)
		    	{
		    		Global.client.remove(Global.backButtonZone);
		    		Global.backButtonZone = null;
		    		
		    	}
		    	Global.lastDrawnScreen = Global.currentScreen;
		    }    	
		 }
	  }
	  
	  public void touchTouchToStart(Zone z)
	  {
	      Global.currentScreen = 1;
	  }
	   
	  
	  public void drawRightPanel(RightPanel z)
	  {
		  z.chkDraw();
	  }
	  
	  public void drawBackButton(Zone z)
	  {
		  fill(16,159,220);
		  stroke(0);
		  strokeWeight(2);
		  rect(0, 0, z.width, z.height, 15);
		  fill(255);
		  textSize(28);
		  textAlign(CENTER);
		  text("Return to previous screen", 5, 20, z.width, 75);
	  }
	  public void drawMovies(Movie z)
	  {
		 z.chkdraw();
	  }

	  public void drawCircleButton(CircleButton z)
	  {
		  z.chkDraw();
	  }
	  public void pressBackButton(ButtonZone z)
	  {
		  if(Global.currentScreen == 4)
		  {
			  Global.currentScreen = 2;
		  }
		  else 
		  {
			  --Global.currentScreen;
		  }
		  
	  }
	  
	  public void touchCircleNumber(Zone z)
	  {
		  Global.circleButton.chkTouchCircleNumber(z);
	  }
	  
	  public void drawCircleNumber(Zone z)
	  {
		  /*fill(0,0,0,100);
		  rect(0, 0, z.width, z.height);*/
	  }
	  public void drawNavButton(ImageZone z)
	  {
		 Global.rightMain.chkDrawNavButton(z);
	  }
	
	  public void drawWarningZone(WarningZone z)
	  {
		  z.chkDraw();
	  }
	  public void drawPrintingScreen(ImageZone z)
	  {
		  if(System.currentTimeMillis() - printingScreenTime >= 5000)
		  {
			  Global.Reset();
			  Global.currentScreen = 0;
			  Global.client.remove(z);
		  }
	  }
	  
	  public void drawShowTimeButton(ShowTimeButtons z)
	  {
		  z.chkDraw();
	  }
	  public void drawTicketSelect(TicketSelect z)
		 {
			 z.chkDraw();
		 }
	  public void drawPayment(ImageZone z)
	  {
	  }
	  public void drawWarningButton(Zone z)
	  {
		  Global.warningZone.chkDrawWarningButton(z);
	  }
	  
	  public void drawShowTimeZone(ShowTimeZone z)
	  {
			 z.chkDraw();
	  }
	  
	  public void touchMovies(Movie z)
	  {	
		  Global.currentMovie = z;
	  }

	  public void touchPayment(ImageZone z)
	  {
		  Global.currentScreen = 5;
	  }
	  public void touchNavButton(ImageZone z)
	  {
		 Global.rightMain.chkTouchNavButton(z);
	  }
	  
	 public void touchTicketSelect(TicketSelect z)
	 {
		 z.chkTouch();
	 }
	 
	 public void touchLeftMain(LeftPanel z)
	 {
		 
	 }
	 
	  public void touchShowTimeButton(ShowTimeButtons z)
	  {
		  if(Global.currentMovie != null)
		  {
			  if(Global.currentScreen == 1)
			  {
				  Global.popupVisible = true;
			  }
			  Global.currentShowTime = z.showTime;
		  }
	  }
	  
	  public void touchWarningButton(Zone z)
	  {
		  Global.warningZone.chkTouchWarningButton(z);
	  }
	  public static void main(String args[]) {
		    PApplet.main(new String[] { "--present", "Main" });
		  }
	}