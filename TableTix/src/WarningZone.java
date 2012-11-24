
import processing.core.*;
import vialab.SMT.*;

import java.awt.*;
import java.util.*;


public class WarningZone extends Zone{

	 Zone acceptZone;
	 Zone declineZone;
	 WarningZone()
	 {
		 super("WarningZone",0,0, Global.screenWidth, Global.screenHeight);
		 declineZone = new Zone("WarningButton", 331, 487, 180, 40);
		 acceptZone = new Zone("WarningButton", 557, 487, 180, 40);
		 this.add(declineZone);
		 this.add(acceptZone);

		 //acceptZone = new Zone("accept", )
	 }
	 
	 public void chkDraw()
	 {
		 fill(0,0,0,240);
		 rect(0, 0, width, height);
		 fill(58,128,226);
		 stroke(255);
		 strokeWeight(8);
		 rect(250, 220, width - 440, height- 420, 10);
		 fill(255);
		 textAlign(CENTER);
		 textSize(55);
		 text("Warning", 250, 250, width - 420, 60);
		 textAlign(CENTER);
		 textSize(32);
		 text(Global.currentMovie.mpaaWarningMessage, 270, 330, width - 480, 200);
	 }
	 
	 public void chkDrawWarningButton(Zone z)
	 {
		 if(z == acceptZone)
		 {
			 fill(99, 228, 21);
			 stroke(255);
			 strokeWeight(2);
			 rect(0,0,z.width, z.height, 5);
			 fill(0);
			 textSize(24);
			 textAlign(CENTER);
			 text("Accept", 0, 9,z.width, z.height);
		 }
		 else 
		 {
			 fill(255, 212, 1);
			 stroke(255);
			 strokeWeight(2);
			 rect(0,0,z.width, z.height, 5);
			 fill(0);
			 textSize(24);
			 textAlign(CENTER);
			 text("Decline", 0, 9,z.width, z.height);
		 }
	 }
	 
	 public void chkTouchWarningButton(Zone z)
	 {
		 Global.popupVisible = false;
		 if(z == acceptZone)
		 {
			 Global.currentScreen = 2;
		 }
	 }
}
