import javax.swing.*;  //JApplet part of javax.swing
import java.awt.*;
import java.awt.event.*;
import javax.swing.JApplet.*;

public class AppletClick extends JApplet implements ActionListener
{
	String  car, acc, max, pic;

	String label="Click Me if you like this car";

	JButton clickMe=new JButton(label);
	JPanel panel1=new JPanel();


	public void init()
	{
		//parameters taken from <param name statements in html file

		car=getParameter("superCar");
		acc=getParameter("holdOn");
		max=getParameter("flatOut");
		pic=getParameter("picture");

		Container myContent=getContentPane();

	//	myContent.setBackground(Color.white); //white is default!

		FlowLayout myFlow=new FlowLayout(FlowLayout.LEFT);
		myContent.setLayout(myFlow);

	//	FlowLayout myPanelFlow=new FlowLayout(FlowLayout.LEFT);
	//	panel1.setLayout(myPanelFlow);
	//	panel1.add(clickMe);

		clickMe.addActionListener(this);

		// clickMe.setBackground(Color.yellow);
		// clickMe.setForeground(Color.green);
		// clickMe.setTextColor(Color.black);

		// clickMe.setVisible(true);

		myContent.add(clickMe);

		// myContent.add(panel1);


		setContentPane(myContent);
	}

	public void actionPerformed(ActionEvent event)
	{
		if(event.getActionCommand()==label)
			{
			clickMe.setText("Cool!               ");
			}
			else
			{
			clickMe.setText("You Clicked already   ");
			}
	}  

	public void paint(Graphics artist){
		
		super.paint(artist);

		//artist.setClip(0,50,getSize().width,getSize().height);

	        artist.translate(0,20);

		//artist.fillRect(0,30,getSize().width,getSize().height);
		//artist.setColor(Color.yellow);

		if(car != null && acc != null && max != null)
		{
			artist.drawString(car, 5, 145);
			artist.drawString("0-60 mph -"+acc,135,160);
			artist.drawString("Top Speed -"+max+" mph",5,160);
		}  

		// Image a data type like String
		//
		Image photo=getImage( getCodeBase(), pic);

		if(photo != null)
		{
			artist.drawImage(photo,50,30,this);
		} 
	}


}

// Applets don't have a main function.
// an Applet has to have an init() which is called whent the applet starts
// and init is used like a constructor class that was used in the windows programms
//	APPLET METHODS
//	init() as above
//	paint() as above
//	repaint()  self explained
//	start()  start a process
//	stop()   guess
//	destroy()  restore a state before exit
//	showStatus(String message)   puts a message on the status bar
//	getParameter(String name) get named parameter value
//	getCodeBase(URL url) get location of the web page
//	getImage(URL url)  get an image from this location
//	getAudioClip(URL url)
//	play(URL url) play a sound file at this location	