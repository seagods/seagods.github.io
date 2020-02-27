import javax.swing.*;  //JApplet part of javax.swing
import java.awt.*;

public class AppletHello extends JApplet
{
	String message;
	public void init()
	{
		message="Hello from Java";
	}
	public void paint(Graphics artist)
	{
		artist.drawString(message, 20,30);
	}
}

// Applets don't hava a main function.
// an Applet has to have an init() which is called whent the applet starts
// and init is used like a constructor class that was used in the windows programms