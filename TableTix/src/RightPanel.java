<<<<<<< Updated upstream
import processing.core.PImage;
import android.R.bool;
import android.R.integer;
import vialab.SMT.ImageZone;
import vialab.SMT.Zone;


public class RightPanel extends Zone 
{
	ImageZone getConcessions;
	ImageZone skipToCheckout;  //NavButton
	PImage buttonIdle = Global.applet.loadImage("..//Image//Buttons//navigation.png");
	PImage greyedOut = Global.applet.loadImage("..//Image//Buttons//greyed out.png");
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
				getConcessions = new ImageZone("NavButton", greyedOut, 500, 195, 208, 80);
				skipToCheckout = new ImageZone("NavButton", greyedOut, 500, 470, 208, 80);
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
		if(Global.currentScreen == 4)
		{
			drawOrderSummay();
		}
	}
	
	private void drawOrderSummary()
	{
		fill(0);
		textSize(36);
		textAlign(CENTER);
		text("Order Summary", 20,0, width, 60);
	}
	
	public void chkTouchNavButton(ImageZone z)
	{
		if(z == getConcessions)
		{
		}
		else if(z == skipToCheckout)
		{
			Global.currentScreen = 4;
		}
	}
	public void chkDrawNavButton(ImageZone z)
	{
		if(Global.generalTicketQuantity == 0 && Global.childTicketQuantity == 0 && Global.seniorTicketQuantity == 0)
		{
			if(z.img != greyedOut)
			{
				z.img = greyedOut;
			}
		}
		else 
		{
			if(z.img != buttonIdle)
			{
				z.img = buttonIdle;
			}
		}
		
		textSize(24);
		fill(255);
		textAlign(CENTER);
		if(z == getConcessions)
		{
			text("Get Concessions", 10, 15, z.width - 20, z.height - 20);
		}
		else if(z == skipToCheckout)
		{
			text("Skip to Checkout", 10, 15, z.width - 20, z.height - 20);
		}
	}
	
	
}
=======
import processing.core.PImage;
import android.R.bool;
import android.R.integer;
import vialab.SMT.ImageZone;
import vialab.SMT.Zone;


public class RightPanel extends Zone 
{
	ImageZone getConcessions;
	ImageZone skipToCheckout;  //NavButton
	PImage buttonIdle = Global.applet.loadImage("..//Image//Buttons//navigation.png");
	PImage greyedOut = Global.applet.loadImage("..//Image//Buttons//greyed out.png");
	TicketSelect generalTicketSelect;
	TicketSelect childTicketSelect;
	TicketSelect seniorTicketSelect;
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
				getConcessions = new ImageZone("NavButton", greyedOut, 500, 195, 208, 80);
				skipToCheckout = new ImageZone("NavButton", greyedOut, 500, 470, 208, 80);
				this.add(getConcessions);
				this.add(skipToCheckout);
			}
		   if(generalTicketSelect == null)
		   {
			   generalTicketSelect = new TicketSelect(Global.generalString, "$" + Global.generalTicketPrice, 55);
			   childTicketSelect = new TicketSelect(Global.childString, "$" + Global.childTicketPrice, 268);
			   seniorTicketSelect = new TicketSelect(Global.seniorString, "$" + Global.seniorTicketPrice, 481);
			   this.add(seniorTicketSelect);
			   this.add(childTicketSelect);
			   this.add(generalTicketSelect);
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
			   if(generalTicketSelect != null)
			   {
				  
				   this.remove(seniorTicketSelect);
				   this.remove(childTicketSelect);
				   this.remove(generalTicketSelect);
				   generalTicketSelect = null;
				   childTicketSelect = null;
				   seniorTicketSelect = null;
				   Global.currectTicketSelected = null;
			   }
		}
		if(Global.currentScreen == 4)
		{
			drawOrderSummay();
		}
	}
	
	private void drawOrderSummay()
	{
		fill(0);
		textSize(36);
		textAlign(CENTER);
		text("Order Summay", 20,0, width, 60);
	}
	
	public void chkTouchNavButton(ImageZone z)
	{
		if(z == getConcessions)
		{
		}
		else if(z == skipToCheckout)
		{
			Global.currentScreen = 4;
		}
	}
	public void chkDrawNavButton(ImageZone z)
	{
		if(Global.generalTicketQuantity == 0 && Global.childTicketQuantity == 0 && Global.seniorTicketQuantity == 0)
		{
			if(z.img != greyedOut)
			{
				z.img = greyedOut;
			}
		}
		else 
		{
			if(z.img != buttonIdle)
			{
				z.img = buttonIdle;
			}
		}
		
		textSize(24);
		fill(255);
		textAlign(CENTER);
		if(z == getConcessions)
		{
			text("Get Concessions", 10, 15, z.width - 20, z.height - 20);
		}
		else if(z == skipToCheckout)
		{
			text("Skip to Checkout", 10, 15, z.width - 20, z.height - 20);
		}
	}
	
	
}
>>>>>>> Stashed changes
