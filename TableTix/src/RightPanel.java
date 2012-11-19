import android.R.bool;
import android.R.integer;
import vialab.SMT.ImageZone;
import vialab.SMT.Zone;


public class RightPanel extends Zone {
	
	Boolean moviesAreDisplayedBoolean = false;
	public RightPanel()
	{
	   super("RightPanel", Global.leftPanelWidth , Global.progressBarHeight,  1024 - Global.leftPanelWidth, Global.panelHeight);
	}
	
}
