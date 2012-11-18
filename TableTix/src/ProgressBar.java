import processing.core.*;
import vialab.SMT.*;

public class ProgressBar {
	
	 PImage screen1 = Global.applet.loadImage("..//Image//Progress Bar//Screen 1.png");
	 PImage screen2 = Global.applet.loadImage("..//Image//Progress Bar//Screen 2.png");
	 PImage screen3 = Global.applet.loadImage("..//Image//Progress Bar//Screen 3.png");
	 PImage screen4 = Global.applet.loadImage("..//Image//Progress Bar//Screen 4.png");
	 
	 public void SetProgressBar()
	 {
		 RemoveProgressBar();
		 
		 switch (Global.currentScreen) 
		 {
			case 1:
				Global.progressBar = new ImageZone(screen1, 0, 0, 1024, 35);
				break;
			case 2: 
				Global.progressBar = new ImageZone(screen2, 0, 0, 1024, 35);
				break;
			case 3: 
				Global.progressBar = new ImageZone(screen3, 0, 0, 1024, 35);
				break;
			case 4:
				Global.progressBar = new ImageZone(screen4, 0, 0, 1024, 35);
				break;
		}
		 Global.client.add(Global.progressBar);
	 }	
	 
	 public void RemoveProgressBar()
	 {
		 if (Global.progressBar != null)
		 {
			 Global.client.remove(Global.progressBar);
		 }
	 }
}
