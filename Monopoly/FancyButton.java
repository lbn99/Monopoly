import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class FancyButton 
	extends JButton 			//FancyButton is-a JButton
	implements ActionListener	//FancyButton performs an action when a button is clicked
{
	private JLabel diceA; //a pointer to a TextArea that this button can modify when clicked
	private JLabel diceB;
	private ImageIcon a1;
	private ImageIcon a2;
	private ImageIcon a3;
	private ImageIcon a4;
	private ImageIcon a5;
	private ImageIcon a6;
	
    public FancyButton(String label, JLabel a, JLabel b) 
   {
    	super(label);	//Give the label to the JButton constructor to deal with
    	
    	//make this button listen to itself when it is clicked
    	addActionListener(this);
    	
    	//initialize the area instance variable 
    	diceA = a;
    	diceB = b;
    	a1 = new ImageIcon("../dice1.jpg");
    	a2 = new ImageIcon("../dice2.jpg");
    	a3 = new ImageIcon("../dice3.jpg");
    	a4 = new ImageIcon("../dice4.jpg");
    	a5 = new ImageIcon("../dice5.jpg");
    	a6 = new ImageIcon("../dice6.jpg");
    }
    
    //This is called when anything that *this* is listening to triggers an action.
    //	ie: when a button is clicked, anything that is "listening" to that button will have its actionPerformed method called
    //		or when a checkbox is checked, etc...
    public void actionPerformed(ActionEvent e)
    {
    	Random rand = new Random();
    	int roll = rand.nextInt(6) + 1;
    	if(roll == 1)
    		diceA.setIcon(a1);
    	if(roll == 2)
    		diceA.setIcon(a2);
    	if(roll == 3)
    		diceA.setIcon(a3);
    	if(roll == 4)
    		diceA.setIcon(a4);
    	if(roll == 5)
    		diceA.setIcon(a5);
    	if(roll == 6)
    		diceA.setIcon(a6);
    	int roll2 = rand.nextInt(6) + 1;
    	if(roll2 == 1)
    		diceB.setIcon(a1);
    	if(roll2 == 2)
    		diceB.setIcon(a2);
    	if(roll2 == 3)
    		diceB.setIcon(a3);
    	if(roll2 == 4)
    		diceB.setIcon(a4);
    	if(roll2 == 5)
    		diceB.setIcon(a5);
    	if(roll2 == 6)
    		diceB.setIcon(a6);
    }
}