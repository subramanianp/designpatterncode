package com.spring.training.withoutcommand;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame  extends JFrame{
private JButton button1;
private JButton button2;
	public MyFrame()
	{
		setSize(200,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		button1=new JButton("Button1");
		button2=new JButton("Button2");
		MyActionListener listener=new MyActionListener();
		button1.addActionListener(listener);
		button2.addActionListener(listener);
		setLayout(new FlowLayout());
		add(button1);
		add(button2);
	}

	class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==button1){
				JOptionPane.showMessageDialog(null, "Button1 is clicked");
			}
			else if(e.getSource()==button2){
				JOptionPane.showMessageDialog(null, "Button2 is clicked");
			}
		}
		
	}
}
