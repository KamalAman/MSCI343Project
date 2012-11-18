
import processing.core.*;
import vialab.SMT.*;

public class Main extends PApplet 
{



	  public void setup() 
	  {
		Global.client = new TouchClient(this, TouchSource.MOUSE);
	    size(1024,768, P3D);
	    //Global.client.add(Global.leftMain);
	    //Global.client.add(Global.rightMain);
	    //Global.client.add(Global.progressBar);
	    Global.welcomingScreenImage = loadImage("..//Image//TableTix_Part1.png");
	  }

	  public void draw() 
	  {
		 
		Zone rightPanel = new Zone();
	    int lastDrawnScreen = 0; 
	    int currentScreen = 0;
	    
	   
	    /*if(lastDrawnScreen != currentScreen)
	    {
	    	//deactivate last screen
	    }
	    switch (currentScreen) {
		case 1:
			//movie selection screen
			break;
		case 2:
			//ticket selection screen
			break;
		case 3:
			//Concession Screen
			break;
		case 4:
			//Check out screen
			break;
		case 5:
			//Ticket Printing Screen
			//pause for 5 seconds and witch currentScreen to 0
			break;		
		default:
			Global.fullScreenZone = new ImageZone("TouchToStart",  Global.welcomingScreenImage, 0, 0, 1024,768);
			Global.client.add(Global.fullScreenZone);
			//Welcome screen
			//check if variables are cleared, clear them if they are not
			break;
		}
	    	*/
	  }
	  
	  private void resetGlobalVariables()
	  {
		  
	  }
	  
	}