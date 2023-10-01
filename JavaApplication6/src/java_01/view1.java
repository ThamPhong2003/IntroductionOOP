package java_01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class view1 extends JFrame {
	public view1() {
		this.unit();
		this.setVisible(true);
	}
	public void unit() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 212);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 665, 178);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Question Bank");
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(33, 31, 215, 45);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Question");
		btnNewButton.setForeground(SystemColor.textHighlight);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(409, 38, 85, 21);
		panel.add(btnNewButton);
		
		JButton btnCetegories = new JButton("Cetegories");
		btnCetegories.setForeground(SystemColor.textHighlight);
		btnCetegories.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCetegories.setBackground(Color.WHITE);
		btnCetegories.setBorder(null);
		btnCetegories.setBounds(409, 69, 85, 21);
		panel.add(btnCetegories);
		
		JButton btnImport = new JButton("Import");
		btnImport.setForeground(SystemColor.textHighlight);
		btnImport.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnImport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnImport.setBackground(Color.WHITE);
		btnImport.setBorder(null);
		btnImport.setBounds(409, 100, 85, 21);
		panel.add(btnImport);
		
		JButton btnExport = new JButton("Export");
		btnExport.setForeground(SystemColor.textHighlight);
		btnExport.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExport.setBackground(Color.WHITE);
		btnExport.setBorder(null);
		btnExport.setBounds(409, 131, 85, 21);
		panel.add(btnExport);
	}

}
