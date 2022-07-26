package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class Badtestscores {

	public Badtestscores() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
String x = JOptionPane.showInputDialog("how bad are your test scores");
int c = Integer.parseInt(x);

if(c==100) {
	JOptionPane.showInputDialog("just skip a few grades, that is an amazing test score, best of the best!!!");
}
else if(c>=90) {
	JOptionPane.showInputDialog("wow!your good at that subject");
} else if(c>=80) {
		JOptionPane.showInputDialog("not good, but not bad either");
	}
else if(c>=0) {
	JOptionPane.showInputDialog("oh sorry man, hope that was just a bad test");
}
}
}

