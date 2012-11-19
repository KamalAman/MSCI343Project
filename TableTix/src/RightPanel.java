import vialab.SMT.Zone;


public class RightPanel extends Zone {
	
	public RightPanel()
	{
	   super("RightPanel", Global.leftPanelWidth , Global.progressBarHeight,  1024 - Global.leftPanelWidth, Global.panelHeight);
	}
	
	@Override
	public void draw()
	{
		   fill(150);
		   Global.applet.rect(Global.leftPanelWidth, Global.progressBarHeight, height, width);
	}

}
