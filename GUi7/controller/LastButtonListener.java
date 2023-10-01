package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.LastButtonView;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LastButtonListener implements ActionListener{

	private LastButtonView lastButtonView;
	
	public LastButtonListener(LastButtonView lastButtonView) {
		this.lastButtonView = lastButtonView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String nguonSuKien = e.getActionCommand();
		if (nguonSuKien.equals("Q là ai")) {
			this.lastButtonView.changeTo_1();
			this.lastButtonView.changeTextColor(Color.RED);

		}else if (nguonSuKien.equals("Q có chăm học khum")) {
			this.lastButtonView.changeTo_2();
			this.lastButtonView.changeTextColor(Color.BLUE);

		}else if (nguonSuKien.equals("Q có hư khum")) {
			this.lastButtonView.changeTo_3();
			this.lastButtonView.changeTextColor(Color.GREEN);

		}else if (nguonSuKien.equals("Muốn nói với q là")) {
			this.lastButtonView.changeTo_4();
			this.lastButtonView.changeTextColor(Color.RED);

		}
	}
}