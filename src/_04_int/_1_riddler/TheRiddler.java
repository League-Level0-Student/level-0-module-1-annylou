package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String one = JOptionPane.showInputDialog("what tastes better than it smells");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(one.equals("a tongue")) {
	score+=1;
	JOptionPane.showMessageDialog(null, "correct");
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "wrong, the answer is a tongue");
}
		// 6. Add some more riddles
String two = JOptionPane.showInputDialog("which month do people sleep the least");
if(two.equals("february")) {
	score+=1;
	JOptionPane.showMessageDialog(null, "correct");
}
else {
	JOptionPane.showMessageDialog(null, "wrong, the answer is february");
}

String three = JOptionPane.showInputDialog("drop me from the tallest building, I'll be fine, drop me into water, I die; what am I?");
if(three.equals("paper")) {
	score+=1;
	JOptionPane.showMessageDialog(null, "correct");
}
else {
	JOptionPane.showMessageDialog(null, "wrong, the answer is paper");
}

String four = JOptionPane.showInputDialog("what has a head and a tail but no body");
if(four.equals("a coin")) {
	score+=1;
	JOptionPane.showMessageDialog(null, "correct");
}
else {
	JOptionPane.showMessageDialog(null, "wrong, the answer is a coin");
}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "your score is " +score);
	}
}

