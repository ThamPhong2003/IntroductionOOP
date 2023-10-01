package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.LastButtonListener;
import model.LastButtonModel;
import model.MyColorModel;

public class LastButtonView extends JFrame{
	private LastButtonModel lastButtonModel;
	private JLabel jLabel;
	private MyColorModel myColorModel;

	public LastButtonView() {
		this.lastButtonModel = new LastButtonModel();
		this.myColorModel = new MyColorModel();
		this.init();
	}
	private void init() {
		this.setTitle("Last Button");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800,600);
		
		JPanel jpanel_Center = new JPanel();
		jpanel_Center.setLayout(new GridLayout(2,2));
		
		// Tao listener
		LastButtonListener lastButtonListener = new LastButtonListener(this);
		
		// Tao font chu
		Font font = new Font("Arial", Font.BOLD, 40);
		
		JButton jButton_1 = new JButton("Q là ai");
		// Gan font chu
		jButton_1.setFont(font);
		jButton_1.setForeground(Color.RED);
		jButton_1.addActionListener(lastButtonListener);
		JButton jButton_2 = new JButton("Q có chăm học khum");
		jButton_2.setFont(font);
		jButton_2.setForeground(Color.BLUE);
		jButton_2.addActionListener(lastButtonListener);
		JButton jButton_3 = new JButton("Q có hư khum");
		jButton_3.setFont(font);
		jButton_3.addActionListener(lastButtonListener);
		jButton_3.setForeground(Color.GREEN);

		JButton jButton_4 = new JButton("Muốn nói với q là");
		jButton_4.setFont(font);
		jButton_4.addActionListener(lastButtonListener);
		jButton_4.setForeground(Color.ORANGE);

		
		jpanel_Center.add(jButton_1);
		jpanel_Center.add(jButton_2);
		jpanel_Center.add(jButton_3);
		jpanel_Center.add(jButton_4);
		
		JPanel jpanel_Footer = new JPanel();
		jLabel = new JLabel("------");
		jLabel.setFont(font);
		jpanel_Footer.add(jLabel);
		
		this.setLayout(new BorderLayout());
		
		this.add(jpanel_Center, BorderLayout.CENTER);
		this.add(jpanel_Footer, BorderLayout.SOUTH);
		this.setVisible(true);
	}
	
	public void changeTo_1() {
		this.lastButtonModel.setValue_1();
		jLabel.setText("Q là một người kì lạ");

	}
	public void changeTo_2() {
		this.lastButtonModel.setValue_2();
		jLabel.setText("Q chăm học tiktok, săn sale");

	}
	public void changeTo_3() {
		this.lastButtonModel.setValue_3();
		jLabel.setText("Q hư là rõ");
	}
	public void changeTo_4() {
		this.lastButtonModel.setValue_4();
		jLabel.setText("Mình đi chơi đi =)))");
	}
	public void changeTextColor(Color color) {
		this.jLabel.setForeground(color);
	}
}