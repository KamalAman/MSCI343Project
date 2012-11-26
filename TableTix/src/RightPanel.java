import java.util.ArrayList;

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
	PImage mastercardImage = Global.applet.loadImage("..//Image//Buttons//mastercard unpressed.png");
	PImage visaImage = Global.applet.loadImage("..//Image//Buttons//visa unpressed.png");
	PImage debitcardImage = Global.applet.loadImage("..//Image//Buttons//debit unpressed.png");
	ImageZone mastercard;
	ImageZone visa;
	ImageZone debit;
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
			
			fill(0);
			textSize(36);
			textAlign(CENTER);
			text("Please Select A Payment Method", 0,350, width, 60);
			rect(75, 378, width - 150, 1);
			rect(35, 383, width - 70, 1);
			
			if(mastercard == null)
			{
				mastercard =  new ImageZone("Payment", mastercardImage,400, 410, 300,115 );
				visa =  new ImageZone("Payment", visaImage,62, 410, 300,115 );
				debit =  new ImageZone("Payment", debitcardImage,62, 540, 300,115 );
				this.add(mastercard);
				this.add(visa);
				this.add(debit);
			}
		}
		
		if(mastercard != null && Global.currentScreen != 4)
		{
			this.remove(mastercard);
			this.remove(visa);
			this.remove(debit);
			mastercard =  null;
			visa =  null;
			debit = null;

		}
	}
	
	private void drawOrderSummay()
	{
		fill(0);
		textSize(36);
		textAlign(CENTER);
		text("Order Summay", 0,20, width, 60);
		rect(75, 48, width - 150, 1);
		rect(35, 53, width - 70, 1);
		textSize(24);
		textAlign(LEFT);
		text(Global.currentMovie.title + " - " +Global.currentShowTime, 55 ,88,  width - 150, 30);
		Global.orderSummaryString = new String();
		Global.orderSummaryLineCostString = new String();
		for(int i = 3; i < Global.orderSummary.size(); ++i)
		{
			Global.orderSummaryString += Global.orderSummary.get(i) + "\r\n";
			Global.orderSummaryLineCostString += Global.orderSummaryLineCost.get(i) + "\r\n";
		}
		textSize(20);
		textAlign(LEFT);
		text(Global.orderSummaryString, 55, 133, 190, 500);
		textAlign(RIGHT);
		text(Global.orderSummaryLineCostString, 75, 133, width - 150,500);
		image(Global.backgroupImage, 0, 290, width, 28);
		textAlign(LEFT);
		textSize(24);
		fill(255);
		text("Total:", 55, 293, 60, 26);
		textAlign(RIGHT);
		text(String.format("%.2f", Global.OrderTotal), 75, 293, width - 150, 26);
		
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
