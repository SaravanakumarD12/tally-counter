package org.test;

import java.awt.*;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TallyCounter extends Frame{
	TextField display;
	Button increment,reset;
	TallyCounter(){
		display = new TextField("0");
		display.setBounds(200,200,100,30);
		
		
		increment = new Button("Increment");
		increment.setBounds(145, 240, 200, 30);
		increment.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int num = Integer.parseInt(display.getText());
				display.setText(String.valueOf(++num));
			}
		});
		
		reset = new Button("Reset");
		reset.setBounds(145, 265, 200, 30);
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				display.setText("0");
			}
		});
		
		add(display);
		add(increment);
		add(reset);
		
		setLayout(null);
		setSize(500,500);
		setTitle("Tally Counter");
		setVisible(true);
	}
	public static void main(String[] args) {
		new TallyCounter();
	}
	
}
