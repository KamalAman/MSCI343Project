import processing.core.PImage;
import vialab.SMT.ImageZone;


public class leftPanel {
	PImage backgroupImage;
	
	
	public leftPanel()
	{
		backgroupImage = Global.applet.loadImage("..//Image//Back Steel.png");
		ImageZone leftZoneBackground = new ImageZone(backgroupImage,0 , Global.progressBarHeight, Global.leftPanelWidth, Global.panelHeight);
		Global.leftMain.add(leftZoneBackground);
	}
	
	public void chkDraw()
	{
		if(Global.)
	}

}
