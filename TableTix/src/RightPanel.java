import android.R.bool;
import android.R.integer;
import vialab.SMT.ImageZone;
import vialab.SMT.Zone;


public class RightPanel extends Zone 
{
	Zone getConcessions;
	Zone skipToCheckout;  //NavButton
	public RightPanel()
	{
	   super("RightPanel", Global.leftPanelWidth , Global.progressBarHeight,  1024 - Global.leftPanelWidth, Global.panelHeight);
	}
	
	public void chkDraw()
	{
		fill(221, 231, 245);
		rect(0, 0, width, height);
		
		if(Global.currentScreen == 2)
		{
			fill(0);
			rect(483, 0, 3, height);
			if(getConcessions == null)
			{
				getConcessions = new Zone("NavButton", 500, 195, 208, 80);
				skipToCheckout = new Zone("NavButton", 500, 470, 208, 80);
				this.add(getConcessions);
				this.add(skipToCheckout);
			}
		}
		else
		{
			if(getConcessions != null)
			{
				this.remove(getConcessions);
				this.remove(skipToCheckout);
				getConcessions = null;
				skipToCheckout = null;
			}
		}
	}
	
	public void chkTouchNavButton(Zone z)
	{
		if(z == getConcessions)
		{
		}
		else if(z == skipToCheckout)
		{
			Global.currentScreen = 4;
		}
	}
	public void chkDrawTouchNavButton(Zone z)
	{
		stroke(0);
		fill(16,159,220);
		strokeWeight(2);
		rect(0,0, width, height, 5);
	}
	
	
}
