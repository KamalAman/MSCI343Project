import android.R.integer;
import processing.core.PImage;
import vialab.SMT.ImageZone;
import vialab.SMT.Touch;
import vialab.SMT.Zone;


public class TicketSelect extends ImageZone{
	
	public String ticketType;
	public String ticketPrice;
	public int ticketQty;
	public int y;
	CircleButton circleButton;
	static PImage blueTicket = Global.applet.loadImage("..//Image//Buttons//movie tickets blue.png");
	static PImage greenTicket = Global.applet.loadImage("..//Image//Buttons//movie tickets green.png");
	
	public TicketSelect(String ticketType, String ticketPrice, int y) 
	{
		super("TicketSelect",blueTicket, 37, y, 410, 203);
		this.ticketType = ticketType;
		this.ticketPrice = ticketPrice;	
		this.y = y;
		Global.circleButton = new CircleButton();
	}
	
	public void chkDraw()
	{
		if(Global.currectTicketSelected == this){
			if(this.img != greenTicket)
			{
				if(Global.circleButton.currentTicket != null)
				{
					Global.circleButton.currentTicket.remove(Global.circleButton);
				}
				Global.circleButton.currentTicket = this;
				this.add(Global.circleButton);
				this.img=greenTicket;
			}
		}
		else {
			if(this.img != blueTicket)
			{
				this.img=blueTicket;
			}
		}
		fill(0);
		textSize(32);
		textAlign(CENTER);
		text(ticketType, 30,67,  140, 40);
		text(ticketPrice, 30,103, 140, 40);
		
		stroke(0);
		strokeWeight(1);
		fill(255);
		ellipse(272,101, 58,58); 
		if(ticketType == Global.generalString)
		{
			ticketQty = Global.generalTicketQuantity;
		}
		else if(ticketType == Global.childString)
		{
			ticketQty = Global.childTicketQuantity;
		}
		else if (ticketType == Global.seniorString)
		{
			ticketQty = Global.seniorTicketQuantity;
		}
		fill(0);
		textSize(36);
		textAlign(CENTER);
		text(Integer.toString(ticketQty), 243, 87, 58, 40);
	}
	
	public void chkTouch()
	{
		Global.currectTicketSelected = this;
	}

}
