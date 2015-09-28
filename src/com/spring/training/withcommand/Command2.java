package com.spring.training.withcommand;

import java.util.Date;

import javax.swing.JFrame;

public class Command2 implements Command {

	private JFrame jframe;
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
	//	JOptionPane.showMessageDialog(null, "Button2 is pressed");
		jframe=new JFrame(new Date().toString());
		jframe.setLocation(200, 300);
		jframe.setSize(100, 50);
		jframe.setVisible(true);
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		jframe.setVisible(false);
	}

}
