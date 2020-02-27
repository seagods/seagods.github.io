import javax.swing.*;  //JApplet part of javax.swing
import java.awt.*;
import java.awt.event.*;

public class AC extends JApplet implements ActionListener
{
	String  car, acc, max, pic;
	String label="Click Me if you like this car";

	JButton clickMe=new JButton(label);

	public void init()
	{
		//parameters taken from <param name statements in html file

		car=getParameter("superCar");
		acc=getParameter("holdOn");
		max=getParameter("flatOut");
		pic=getParameter("picture");

		Container myContent=getContentPane();
		FlowLayout myFlow=new FlowLayout(FlowLayout.LEFT);
		myContent.setLayout(myFlow);
		clickMe.addActionListener(this);
		myContent.add(clickMe);
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
	        artist.translate(0,20);

		if(car != null && acc != null && max != null)
		{
			artist.drawString(car, 5, 145);
			artist.drawString("0-60 mph -"+acc,135,160);
			artist.drawString("Top Speed -"+max+" mph",5,160);
		}  

		Image photo=getImage( getCodeBase(), pic);

		if(photo != null)
		{
			artist.drawImage(photo,50,30,this);
		} 
	}


}

