package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.MyColorModel;

public class MyColorView extends JFrame{
	private MyColorModel myColorModel;
	private JLabel jLabel; 
	
	public MyColorView() {
		this.myColorModel = new MyColorModel();
		this.init();
	}

	private void init() {
		this.setTitle("My Color");
		this.setSize(1000,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Font font_text = new Font("Arial", Font.BOLD, 100);
		jLabel = new JLabel("TEXT, .........");
		jLabel.setFont(font_text);
		
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new GridLayout(2,3));
		
		Font font = new Font("Arial", Font.BOLD, 40);
		
		JButton jButton_text_red = new JButton("Tính cách của Q");
		jButton_text_red.setFont(font);
		jButton_text_red.setForeground(Color.RED);
		
		JButton jButton_text_yellow = new JButton("Quê quán của Q");
		jButton_text_yellow.setFont(font);
		jButton_text_yellow.setForeground(Color.BLUE);
		
		JButton jButton_text_green = new JButton("Q có tuyệt vời khum");
		jButton_text_green.setFont(font);
		jButton_text_green.setForeground(Color.GREEN);
		
		//
		JButton jButton_background_red = new JButton("Q có hư khum");
		jButton_background_red.setFont(font);
        jButton_background_red.setForeground(Color.BLACK);
		jButton_background_red.setBorderPainted(false);
		
		
		JButton jButton_background_yellow = new JButton("Q chăm học không");
		jButton_background_yellow.setFont(font);
        jButton_background_yellow.setForeground(Color.BLUE);

		
		JButton jButton_background_green = new JButton("Muốn nói với Q");
		jButton_background_green.setFont(font);
        jButton_background_green.setForeground(Color.RED);

		jPanel.add(jButton_text_red);
		jPanel.add(jButton_text_yellow);
		jPanel.add(jButton_text_green);
		jPanel.add(jButton_background_red);
		jPanel.add(jButton_background_yellow);
		jPanel.add(jButton_background_green);
		
		this.setLayout(new BorderLayout());
		this.add(jLabel, BorderLayout.NORTH);
		this.add(jPanel, BorderLayout.CENTER);
		this.setVisible(true);
	}

	public void changeTextColor(Color color) {
		this.jLabel.setForeground(color);
	}
	
	public void changeBacgroundColor(Color color) {
		this.jLabel.setBackground(color);
		this.jLabel.setOpaque(true);
	}
}