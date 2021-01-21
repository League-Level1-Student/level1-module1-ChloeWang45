package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		
		String flavor = JOptionPane.showInputDialog("What flavor do you want?");
		Popcorn pop = new Popcorn(flavor);
		Microwave microwave = new Microwave();
		microwave.putInMicrowave(pop);
		String time = JOptionPane.showInputDialog("How long do you want to microwave it in minutes?");
		int t = Integer.parseInt(time);
		microwave.putInMicrowave(pop);
		microwave.setTime(t);
		microwave.startMicrowave();
		pop.eat();
		
	}
}
