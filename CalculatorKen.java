/*
	Ken Errico
	GUI Lab
	12/11/16
	Calculator
*/

//imports all java packages that are used throughout this class
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.SwingUtilities;



/*
	window adapter is an adapter class that that recognizes window events and 
	provides built in methods for the calculator class and its corresponding methods
	and objects to use
*/
public class CalculatorKen extends WindowAdapter
{
	JFrame myFrame;
	JPanel myPanel;
	
	/*
		boolean chooses which array to apply inputs to in order to keep seperated until math
		is performed and it is then sent to the third array to become a new total
	*/
	boolean oneOrTwo = true;
	
	/*
		these booleans are for operation buttons that become true when pressed but need to be reset later on
		otherwise they would only be able to be pressed one time and would then become and stay true
	*/
	boolean addition = false;
	boolean subtraction = false;
	boolean division = false;
	boolean multiplication = false;
	boolean divideByZero = false;
	
	/*
		Arrays where numbers are stored, the first and second both take inputs from the user
		while the third is where the new number (the answer) is stored
	*/
	public ArrayList<Integer> numIn = new ArrayList<Integer>();
	public ArrayList<Integer> numIn2 = new ArrayList<Integer>();
	public ArrayList<Integer> totalInputs = new ArrayList<Integer>();
	
	//declares all 16 buttons in shorthand to save space
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	JTextField txt;
	
	/*
		this is the custom method that creates the 16 buttons that are located on the frame of
		the calculator, each button has been changed to Garamond font and sized corresponding to
		the button it is written on and if the font is too large it will only display as three dots, I found that out 
		the hard way... the sizes of the buttons have been set using x, y, coordinates and the colors 
		have been changed, even if the green is kinda ugly I think its growing on me, the buttons each use 
		action listener to specify what should be done when the user performs operations, the action event occurs
		when the user enters input, this sends a message to all the relevant components that something is happening
	*/
	public void buttons()
	{
		myFrame = new JFrame("[CalculatorKen]");
		myPanel = new JPanel();
		myPanel.setBackground(Color.black);
		
		
		//creates main text field and aligns to the right
		txt = new JTextField("",40);
		txt.setBounds(05,05,215,40);
		txt.setHorizontalAlignment(JTextField.RIGHT);
		txt.setFont(new Font("Garamond",Font.BOLD,15));
		
		b1 = new JButton(" 7 ");
		b1.setBounds(05,50,50,50);
		b1.setBackground(Color.GREEN);
		b1.setForeground(Color.BLACK);
		b1.setFont(new Font("Garamond", Font.BOLD, 15));
		b1.addActionListener(new CalcFunctions());

		b2 = new JButton(" 8 ");
		b2.setBounds(60,50,50,50);
		b2.setBackground(Color.GREEN);
		b2.setForeground(Color.BLACK);
		b2.setFont(new Font("Garamond", Font.BOLD, 15));
		b2.addActionListener(new CalcFunctions());

		b3 = new JButton(" 9 ");
		b3.setBounds(115,50,50,50);
		b3.setBackground(Color.GREEN);
		b3.setForeground(Color.BLACK);
		b3.setFont(new Font("Garamond", Font.BOLD, 15));
		b3.addActionListener(new CalcFunctions());

		b4 = new JButton(" / ");
		b4.setBounds(170,50,50,50);
		b4.setBackground(Color.GREEN);
		b4.setForeground(Color.BLACK);
		b4.setFont(new Font("Garamond", Font.BOLD, 12));
		b4.addActionListener(new CalcFunctions());

		b5 = new JButton(" 4 ");
		b5.setBounds(05,105,50,50);
		b5.setBackground(Color.GREEN);
		b5.setForeground(Color.BLACK);
		b5.setFont(new Font("Garamond", Font.BOLD, 15));
		b5.addActionListener(new CalcFunctions());

		b6 = new JButton(" 5 ");
		b6.setBounds(60,105,50,50);
		b6.setBackground(Color.GREEN);
		b6.setForeground(Color.BLACK);
		b6.setFont(new Font("Garamond", Font.BOLD, 15));
		b6.addActionListener(new CalcFunctions());

		b7 = new JButton(" 6 ");
		b7.setBounds(115,105,50,50);
		b7.setBackground(Color.GREEN);
		b7.setForeground(Color.BLACK);
		b7.setFont(new Font("Garamond", Font.BOLD, 15));
		b7.addActionListener(new CalcFunctions());

		b8 = new JButton(" X ");
		b8.setBounds(170,105,50,50);
		b8.setBackground(Color.GREEN);
		b8.setForeground(Color.BLACK);
		b8.setFont(new Font("Garamond", Font.BOLD, 12));
		b8.addActionListener(new CalcFunctions());

		b9 = new JButton(" 1 ");
		b9.setBounds(05,160,50,50);
		b9.setBackground(Color.GREEN);
		b9.setForeground(Color.BLACK);
		b9.setFont(new Font("Garamond", Font.BOLD, 15));
		b9.addActionListener(new CalcFunctions());
		
		b10 = new JButton(" 2 ");
		b10.setBounds(60,160,50,50);
		b10.setBackground(Color.GREEN);
		b10.setForeground(Color.BLACK);
		b10.setFont(new Font("Garamond", Font.BOLD, 15));
		b10.addActionListener(new CalcFunctions());
		
		b11 = new JButton(" 3 ");
		b11.setBounds(115,160,50,50);
		b11.setBackground(Color.GREEN);
		b11.setForeground(Color.BLACK);
		b11.setFont(new Font("Garamond", Font.BOLD, 15));
		b11.addActionListener(new CalcFunctions());

		b12 = new JButton(" - ");
		b12.setBounds(170,160,50,50);
		b12.setBackground(Color.GREEN);
		b12.setForeground(Color.BLACK);
		b12.setFont(new Font("Garamond", Font.BOLD, 15));
		b12.addActionListener(new CalcFunctions());
		
		b13 = new JButton(" 0 ");
		b13.setBounds(05,215,50,50);
		b13.setBackground(Color.GREEN);
		b13.setForeground(Color.BLACK);
		b13.setFont(new Font("Garamond", Font.BOLD, 15));
		b13.addActionListener(new CalcFunctions());

		b14 = new JButton(" = ");
		b14.setBounds(60,215,50,50);
		b14.setBackground(Color.GREEN);
		b14.setForeground(Color.BLACK);
		b14.setFont(new Font("Garamond", Font.BOLD, 12));
		b14.addActionListener(new CalcFunctions());

		b15 = new JButton(" C ");
		b15.setBounds(115,215,50,50);
		b15.setBackground(Color.GREEN);
		b15.setForeground(Color.BLACK);
		b15.setFont(new Font("Garamond", Font.BOLD, 12));
		b15.addActionListener(new CalcFunctions());

		b16 = new JButton(" + ");
		b16.setBounds(170,215,50,50);
		b16.setBackground(Color.GREEN);
		b16.setForeground(Color.BLACK);
		b16.setFont(new Font("Garamond", Font.BOLD, 12));
		b16.addActionListener(new CalcFunctions());

		//calls to create and add the actual button from the object to the frame
		myFrame.add(myPanel);
		myPanel.setLayout(null);
		myPanel.add(b1);
		myPanel.add(b2);
		myPanel.add(b3);
		myPanel.add(b4);
		myPanel.add(b5);
		myPanel.add(b6);
		myPanel.add(b7);
		myPanel.add(b8);
		myPanel.add(b9);
		myPanel.add(b10);
		myPanel.add(b11);
		myPanel.add(b12);
		myPanel.add(b13);
		myPanel.add(b14);
		myPanel.add(b15);
		myPanel.add(b16);
		myPanel.add(txt);
		
		//method that is found in WindowAdapter recieves window events as user enters input
		myFrame.addWindowListener(this);
		
		//x and y coordinates that size the frame
		myFrame.setPreferredSize(new Dimension(230, 300));

		
		//keeps fixed size of frame
		myFrame.setResizable(false);
		myFrame.pack();
		myFrame.setVisible(true);
	}
	
	
	//"closing" as opposed to closed, system.exit terminates program
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
	
	/*
		new class that works in conjunction with action listener in each of the buttons, 
		action listener knows that something must be done and the decisions are made in here
		according to if and else statements
	*/
	public class CalcFunctions implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
			//gets label from button
			String label = ae.getActionCommand();
			
				if(label == " 0 ")
				{
					int zero = 0;
					
					//is true until pressed, if not pressed it stays true and is then added to the first array
					if(oneOrTwo == true)
					{
						numIn.add(0,0);

						//This removes the brackets and commas when printing out the arrays
						numIn.toString().replace("\\[", "(").replace("\\]", ")");
						txt.setText("" + numIn.get(0));
					}
					//adds to second array
					else if(oneOrTwo == false)
					{
						//If the second number inputed is 0, the boolean is set to true.
						divideByZero = true;
						numIn2.add(0,0);
						numIn2.toString().replace("\\[", "(").replace("\\]", ")");
						txt.setText("" + numIn2.get(0));
					}
				}
				
				if(label == " 1 ")
				{
					if(oneOrTwo == true)
					{
						numIn.add(0,1);
						numIn.toString().replace("\\[", "(").replace("\\]", ")");
						txt.setText("" + numIn.get(0));
					}
					else if(oneOrTwo == false)
					{
						numIn2.add(0,1);
						numIn2.toString().replace("\\[", "(").replace("\\]", ")");
						txt.setText("" + numIn2.get(0));
					}
				}

				else if(label== " 2 ")
				{
					if(oneOrTwo == true)
					{
						numIn.add(0,2);
						numIn.toString().replace("\\[", "(").replace("\\]", ")");
						txt.setText("" + numIn.get(0));
					}

					else if(oneOrTwo == false)
					{
						numIn2.add(0,2);
						numIn2.toString().replace("\\[", "(").replace("\\]", ")");
						txt.setText("" + numIn2.get(0));
					}
				}

				else if(label== " 3 ")
				{
					if(oneOrTwo == true)
					{
						numIn.add(0,3);
						numIn.toString().replace("\\[", "(").replace("\\]", ")");
						txt.setText("" + numIn.get(0));
					}

					else if(oneOrTwo == false)
					{
						numIn2.add(0,3);
						numIn2.toString().replace("\\[", "(").replace("\\]", ")");
						txt.setText("" + numIn2.get(0));
					}
				}

				else if(label== " 4 ")
				{
					if(oneOrTwo == true)
					{
						numIn.add(0,4);
						numIn.toString().replace("\\[", "(").replace("\\]", ")");
						txt.setText("" + numIn.get(0));
					}

					else if(oneOrTwo == false)
					{
						numIn2.add(0,4);
						numIn2.toString().replace("\\[", "(").replace("\\]", ")");
						txt.setText("" + numIn2.get(0));
					}
				}

				else if(label== " 5 ")
				{
					if(oneOrTwo == true)
					{
						numIn.add(0,5);
						numIn.toString().replace("\\[", "(").replace("\\]", ")");
						txt.setText("" + numIn.get(0));
					}

					else if(oneOrTwo == false)
					{
						numIn2.add(0,5);
						numIn2.toString().replace("\\[", "(").replace("\\]", ")");
						txt.setText("" + numIn2.get(0));
					}
				}

				else if(label== " 6 ")
				{
					if(oneOrTwo == true)
					{
						numIn.add(0,6);
						numIn.toString().replace("\\[", "(").replace("\\]", ")");
						txt.setText("" + numIn.get(0));
					}

					else if(oneOrTwo == false)
					{
						numIn2.add(0,6);
						numIn2.toString().replace("\\[", "(").replace("\\]", ")");
						txt.setText("" + numIn2.get(0));
					}
				}

				else if(label == " 7 ")
				{
					if(oneOrTwo == true)
					{
						numIn.add(0,7);
						numIn.toString().replace("\\[", "(").replace("\\]", ")");
						txt.setText("" + numIn.get(0));
					}

					else if(oneOrTwo == false)
					{
						numIn2.add(0,7);
						numIn2.toString().replace("\\[", "(").replace("\\]", ")");
						txt.setText("" + numIn2.get(0));
					}
				}

				else if(label == " 8 ")
				{
					if(oneOrTwo == true)
					{
						numIn.add(0,8);
						numIn.toString().replace("\\[", "(").replace("\\]", ")");
						txt.setText("" + numIn.get(0));
					}

					else if(oneOrTwo == false)
					{
						numIn2.add(0,8);
						numIn2.toString().replace("\\[", "(").replace("\\]", ")");
						txt.setText("" + numIn2.get(0));
					}
				}

				else if(label == " 9 ")
				{
					if(oneOrTwo == true)
					{
						numIn.add(0,9);
						numIn.toString().replace("\\[", "(").replace("\\]", ")");
						txt.setText("" + numIn.get(0));
					}

					else if(oneOrTwo == false)
					{
						numIn2.add(0,9);
						numIn2.toString().replace("\\[", "(").replace("\\]", ")");
						txt.setText("" + numIn2.get(0));
					}
				}
				
				/*
					these are the operator button functions that work with the booleans declared in the beginning
					Once the operator is pressed, the calculator adds the next Int to the second ArrayList.
				*/
				else if(label == " + ")
				{
					addition = true;
					oneOrTwo = false;
					txt.setText(" + ");
				}

				else if(label == " - ")
				{
					subtraction = true;
					oneOrTwo = false;
					txt.setText(" - ");
				}

				else if(label == " / ")
				{
					division = true;
					oneOrTwo = false;
					txt.setText(" / ");
				}

				else if(label == " X ")
				{
					multiplication = true;
					oneOrTwo = false;
					txt.setText(" X ");
				}
				
				//resets all arrays to 0
				else if(label == " C ")
				{
					numIn.clear();
					numIn2.clear();					
					oneOrTwo = true;
					txt.setText("0");
				}

				else if(label == " = ")
				{
					int sum = 0;
					int total = 0;
					int total2 = 0;

					//Gets Sum of all the numbers in the first Array
					for(int i: numIn)
					{
						sum += i;
						 //First Total
						total += sum;
					}
					// Sums up the total of the second array
					int sum2 = 0;
					for(int i2: numIn2)
					{
						sum2 += i2;
						//Second Total
						total2 += sum2; 
					}

					// thetotal holds the sum of both Arrays
					int theTotal = total + total2;

					if(addition == true)
					{
						theTotal = total + total2;
					}

					else if(subtraction == true)
					{
						 theTotal = total - total2;
					}

					else if(multiplication == true)
					{
						 theTotal = total * total2;
					}

					else if(division == true)
					{
						if(numIn2.get(0) == 0)
						{
							txt.setText("Don't Do That Sucka!!! ");
						}
						else
						{
							theTotal = total / total2;
						}
					}

					if(divideByZero == true)
					{
						System.out.print("Don't Do That Either Sucka!!! ");
					}

					else if(divideByZero == false)
					{
						txt.setText("" + theTotal);
					}

					/*
						this is where the booleans get reset after being used, otherwise once they have been
						pushed once they would be permanently set to true, rendering them a one time use
						doing this starts the process over from the beginning 
					*/
					addition = false;
					subtraction = false;
					multiplication = false;
					division = false;
					divideByZero = false;
				}
			}
		}
	
	//main method creates a new calc and calls the method to create the buttons on the frame
	public static void main(String args[])
	{
		CalculatorKen myCalc = new CalculatorKen();
		myCalc.buttons();
	}
}
















































