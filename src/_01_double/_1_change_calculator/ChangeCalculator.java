package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {


String xyzabc = JOptionPane.showInputDialog("how many nickels do you have");  
int ez = Integer.parseInt(xyzabc);
double x  = 0.05;
JOptionPane.showMessageDialog(null, ez*x);

String xyzbc = JOptionPane.showInputDialog("how many dimes do you have");  
int eez = Integer.parseInt(xyzbc);
double a  = 0.1;
JOptionPane.showMessageDialog(null, eez*a);

String xzabc = JOptionPane.showInputDialog("how many quarters do you have");  
int ebz = Integer.parseInt(xzabc);
double b  = 0.25;
JOptionPane.showMessageDialog(null, ebz*b);
double doublee = ez*x+eez*a+ebz*b;
JOptionPane.showMessageDialog(null, doublee);
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

