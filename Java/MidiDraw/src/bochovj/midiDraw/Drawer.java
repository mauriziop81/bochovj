package bochovj.midiDraw;
import processing.core.PApplet;


public class Drawer {
    
    public static void main(String args[]) throws Exception {
	//Video capturing must be initialized outside the Applet
	//Or it won't ever get permissions in Windows Vista
	DrawerApplet.videograbber = new VideoGrabber();
	try{
	    DrawerApplet.videograbber.startCapture();
	}
	catch(Exception ex)
	{
	    System.out.println("Could not open capture device, yuou won't be able to use it");
	}
	
	
	//Starts the applet in full screen
	PApplet.main(new String[] { "--present", "bochovj.midiDraw.DrawerApplet" });
    }

}
