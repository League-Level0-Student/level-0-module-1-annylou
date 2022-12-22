package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String one = JOptionPane.showInputDialog("what tastes better than it smells");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(one.equals("a tongue")) {
	score+=1;
	JOptionPane.showMessageDialog(null, "correct");
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "wrong. the answer is a tongue");
}
		// 6. Add some more riddles
String two = JOptionPane.showInputDialog("");
if(two.equals("1")) {
	score+=1;
	JOptionPane.showMessageDialog(null, "correct");
}
else {
	JOptionPane.showMessageDialog(null, "wrong. the answer is ");
}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, score);
	}
}

