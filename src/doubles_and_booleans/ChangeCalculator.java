package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nickel = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
		double nickel2 = Integer.parseInt(nickel);
		// Ask the user how many dimes they have, and convert their answer
		String dime = JOptionPane.showInputDialog("How many dimes do you have?");
		double dime2 = Integer.parseInt(dime);
		// Ask the user how many quarters they have, and convert their answer
		String quarter = JOptionPane.showInputDialog("How many quarters do you have");
		double quarter2 = Integer.parseInt(quarter);
		// Calculate how much money the user has and save it in a double variable
		double money = 0;
		nickel2 = nickel2 * .05;
		dime2 = dime2 * .10;
		quarter2 = quarter2 * .25;
		money = money + nickel2 + dime2 + quarter2;
		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, "You have $" + money + " dollars");
	}
}
