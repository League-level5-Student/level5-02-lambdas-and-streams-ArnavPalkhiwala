package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener((ActionEvent e) ->{
			Random r = new Random();
			int n1 = r.nextInt(1000);
			int n2 = r.nextInt(1000);
			int sum = n1 + n2;
			System.out.println(n1 + " + " + n2 + " = " + sum);
		});
		
		randNumber.addActionListener((ActionEvent e) ->{
			Random r = new Random();
			int randNum = r.nextInt(1000);
			System.out.println("The random number is " + randNum);
		});
		
		tellAJoke.addActionListener((ActionEvent e) ->{
			
			System.out.println("This is my joke");
			
		});
		
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
