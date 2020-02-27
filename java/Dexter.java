import javax.swing.*;
import java.awt.*;
import java.applet.AudioClip;  //need for audio
import java.net.*;		// need fot URL statements
import java.awt.event.*;	// need to respond to buttons


public class Dexter extends JApplet implements ActionListener
{
	JButton dextButton;
	JButton didiButton;
	JButton shutUp;

	JPanel mainPanel=new JPanel();
	JLabel mainLabel=new JLabel();

	//URL dextSays;
	//URL didiSays;
	//URL shutit;

	AudioClip dexterVoice;
	AudioClip didiVoice;
	AudioClip shutUpVoice;

	public void init()
	{

		//Image dexter = getImage(getCodeBase(),"dexterrh.gif");
		//Image didi = getImage(getCodeBase(),"didileap.gif");

		Image dexter = getImage(getClass().getResource("dexterrh.gif") );
		Image didi = getImage(getClass().getResource("didileap.gif"));

		ImageIcon dex=new ImageIcon(dexter);
		ImageIcon di=new ImageIcon(didi);

		dextButton=new JButton("Click on Dexter", dex);
		didiButton=new JButton("Click on DeeDee", di);
		shutUp=new JButton("Click here to shut them up!");

		dextButton.addActionListener(this);
		didiButton.addActionListener(this);
		shutUp.addActionListener(this);

		//try
		//{


		//dextSays=new URL("file:Dextertm.wav");
		//didiSays=new URL("file:HiDexter.wav");
		//shutit=new URL("file:ShutUp.wav");

		//dexterVoice=JApplet.newAudioClip(dextSays);
		//didiVoice=JApplet.newAudioClip(didiSays);
		//shutUpVoice=JApplet.newAudioClip(shutit);
		//}
		//catch(MalformedURLException error){}


		dexterVoice=getAudioClip(getClass().getResource("Dextertm.wav"));
		didiVoice=getAudioClip(getClass().getResource("HiDexter.wav") );
		shutUpVoice=getAudioClip(getClass().getResource("Shutup.wav"));


		Container myContent=getContentPane();
		myContent.setBackground(Color.white); 
		FlowLayout myFlow=new FlowLayout(FlowLayout.LEFT);
		myContent.setLayout(myFlow);

		FlowLayout panelFlow=new FlowLayout();

		mainPanel.add(didiButton);
		mainPanel.add(dextButton);

		myContent.add(shutUp);

		myContent.add(mainPanel);


		setContentPane(myContent);

	}
	public void actionPerformed(ActionEvent event)
	{

		//System.out.println(" Dexter  !");

		if(event.getSource()==dextButton)
			{
			//dexterVoice.play();
			dexterVoice.loop();
			}
		if(event.getSource()==didiButton)
			{
			//didiVoice.play();
			didiVoice.loop();
			}
		if(event.getSource()==shutUp)
			{
			shutUpVoice.play();
			didiVoice.stop();
			dexterVoice.stop();
			}


	}  

}