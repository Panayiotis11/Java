package oop;

import java.awt.Color;

import java.awt.FlowLayout;

import javax.swing.JFrame;

import uk.ac.leedsbeckett.oop.LBUGraphics;

public class MainClass extends LBUGraphics

{
	private String command;
	public static void main(String[] args)
        {
                new MainClass(); //create instance of class that extends LBUGraphics (could be separate class without main), gets out of static context
        }

        public MainClass()
        {
                JFrame MainFrame = new JFrame();            //create a frame to display the turtle panel on
                MainFrame.setLayout(new FlowLayout());     //not strictly necessary
                MainFrame.add(this);                       //"this" is this object that extends turtle graphics so we are adding a turtle graphics panel to the frame
                MainFrame.setSize(850,450);                //set the frame to a size we can see
                MainFrame.setVisible(true);                //now display it
                                                    
                processCommand(command);
                
                command = "";
                
                
                                                                                    //call the LBUGraphics about method to display version information.
        }
        

        public void processCommand(String command)              //this method must be provided because LBUGraphics will call it when it's JTextField is used
        {
                //String parameter is the text typed into the LBUGraphics JTextfield
                //lands here if return was pressed or "OK" JButton clicked
                //TO DO
        	
        	if (command == null)   //This will ensure that if command is null, the method will exit early and not try to call any methods on it.
        		return;
        	
            try {
                String[] split = command.split(" ");
                if (split.length > 1) { //This will check to see if there is more than 1 input if its false it will run the rest of the code below
                    int value = Integer.parseInt(split[1]);

                    int value2 = value * -1;

                    if (split[0].equals("forward")) {
                        forward(value);
                    } else if (split[0].equals("backward")) {
                        forward(value2);
                    }
                }
            } catch (NumberFormatException e) {  //if the user enters a string in the split[1] position it will result in an error handler message
                System.out.println("Invalid input");
            }

            if (command.equals("about") || command.equals("")) {
                about();
            } else if (command.equals("penup")) {
                penUp();
            } else if (command.equals("pendown")) {
                penDown();
            } else if (command.equals("turnleft")) {
                turnLeft();
            } else if (command.equals("turnright")) {
                turnRight();
            } else if (command.equals("black")) {
                setPenColour(Color.black);
            } else if (command.equals("green")) {
                setPenColour(Color.green);
            } else if (command.equals("red")) {
                setPenColour(Color.red);
            } else if (command.equals("white")) {
                setPenColour(Color.white);
            } else if (command.equals("reset")) {
                reset();
            } else if (command.equals("clear")) {
                clear();
            } else {
                System.out.println("I don't understand");
            }
        }
        
        
}




