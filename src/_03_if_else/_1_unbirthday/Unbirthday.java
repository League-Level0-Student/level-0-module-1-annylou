package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("what is your birthday? mm/dd");
	if (input.equals("12/14")) {
		JOptionPane.showMessageDialog(null, "happy birthday");
	}
		else {
			JOptionPane.showMessageDialog(null, "happy unbirthday");
		}
	}


}



