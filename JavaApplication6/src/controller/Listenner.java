package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java_01.view;
import java_01.view1;

public class Listenner implements ActionListener {
	private view newView;
	private view1 newView1;
	
	

	public Listenner(view newView) {
		this.newView = newView;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("TURN EDIT ON")) {
			System.out.println("MINH");
			newView1 = new view1();
		}
		
		
	}

}
