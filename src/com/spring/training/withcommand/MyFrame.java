package com.spring.training.withcommand;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame  extends JFrame{
private JButton button1;
private JButton button2;
private JButton undoButton;
	public MyFrame()
	{
		setSize(200,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		button1=new JButton("Button1");
		button2=new JButton("Button2");
		undoButton=new JButton("Undo");
		MyActionListener listener=new MyActionListener();
		button1.addActionListener(listener);
		button2.addActionListener(listener);
		undoButton.addActionListener(listener);
		setLayout(new FlowLayout());
		add(button1);
		add(button2);
		add(undoButton);
	}


	class MyActionListener implements ActionListener{
		private Properties props;
		private List<Command> commands=new ArrayList<>();
		
		
		
		
		public MyActionListener() {
			super();
			// TODO Auto-generated constructor stub
			try {
				FileInputStream fin=new FileInputStream("command.properties");
				props=new Properties();
				props.load(fin);
				fin.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	@Override
		public void actionPerformed(ActionEvent e) {
			String action=e.getActionCommand();
			if(action.equals("Undo")){
				Command cmd=commands.get(commands.size()-1);
				cmd.undo();
				commands.remove(cmd);
			}
			else{
			String className=props.getProperty(action);
			try {
				Class clz=Class.forName(className);
				Command cmd=(Command)clz.newInstance();
				cmd.execute();
				commands.add(cmd);
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		}
		
	}
}
