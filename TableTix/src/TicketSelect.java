import android.R.integer;
import processing.core.PImage;
import vialab.SMT.ImageZone;
import vialab.SMT.Zone;


public class TicketSelect extends ImageZone{
	
	public String ticketType;
	public String ticketPrice;
	public int ticketQty;
	public int y;
	static PImage blueTicket = Global.applet.loadImage("..//Image//Button//movie tickets blue.png");
	static PImage greenTicket = Global.applet.loadImage("..//Image//Button//movie tickets green.png");
	public TicketSelect(String ticketType, String ticketPrice, int y) 
	{
		super(blueTicket, 37, y, 410, 203);
		this.ticketType = ticketType;
		this.ticketPrice = ticketPrice;	
		this.y = y;
	}
	
	public void chkDraw()
	{
		if(Global.currectTicketSelected == this){
			if(this.img != greenTicket)
			{
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
		text(ticketType, 30,58,  140, 40);
		text(ticketPrice, 30,100, 140, 40);
		
		stroke(0);
		strokeWeight(1);
		fill(255);
		ellipse(243,69, 58,58); 
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
		text(Integer.toString(ticketQty), 243, 75, 58, 40);
	}
	
	public void chkTouch()
	{
		Global.currectTicketSelected = this;
	}

}
