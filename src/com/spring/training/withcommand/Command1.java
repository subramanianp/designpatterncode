package com.spring.training.withcommand;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

public class Command1 implements Command {
private List<String> list=new ArrayList<>();
private Date timestamp;
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		//JOptionPane.showMessageDialog(null, "Button1 is pressed");
		timestamp=new Date();
		list.add("command1 at  "+timestamp);
		System.out.println(list);
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		list.remove("command1 at  "+timestamp);
		System.out.println(list);
	}

}
