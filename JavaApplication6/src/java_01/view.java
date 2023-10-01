package java_01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.JSeparator;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

import controller.Listenner;

import javax.swing.JMenuItem;
import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.JEditorPane;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;

public class view extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
 
	public view() {
		Listenner lc = new Listenner(this);
                setSize(1000,1000);
		setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 544);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(70, 130, 180));
		panel.setBounds(10, 10, 635, 47);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(20, 67, 613, 114);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("IT");
		lblNewLabel.setBounds(21, 0, 45, 37);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(Color.WHITE);
		panel_1.add(lblNewLabel);
                
		JLabel jlabelSetUp = new JLabel("Set Up");
                jlabelSetUp.setBounds(500, 15, 43, 43);
                jlabelSetUp.setFont(new Font("Tahoma", Font.PLAIN, 18));
                jlabelSetUp.setBorder(null);
                jlabelSetUp.setBackground(Color.red);
                panel_1.add(jlabelSetUp);
                
		JButton btnThiThu_2_2 = new JButton("TURN EDIT ON");
		btnThiThu_2_2.addActionListener(lc);
		btnThiThu_2_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnThiThu_2_2.setBorder(null);
		btnThiThu_2_2.setBackground(new Color(70, 130, 180));
		btnThiThu_2_2.setBounds(331, 61, 249, 43);
		panel_1.add(btnThiThu_2_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1_1.setBounds(20, 191, 613, 317);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JButton btnThiThu_2 = new JButton("Thi thu\r\n");
		btnThiThu_2.setIcon(new ImageIcon(view.class.getResource("/java_01/korganizer-icon.png")));
		btnThiThu_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnThiThu_2.setBorder(null);
		btnThiThu_2.setBackground(Color.WHITE);
		btnThiThu_2.setBounds(2, 18, 267, 42);
		panel_1_1.add(btnThiThu_2);
		
		JButton btnThiThu_2_1 = new JButton("Thi thu\r\n");
		btnThiThu_2_1.setIcon(new ImageIcon(view.class.getResource("/java_01/korganizer-icon.png")));
		btnThiThu_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnThiThu_2_1.setBorder(null);
		btnThiThu_2_1.setBackground(Color.WHITE);
		btnThiThu_2_1.setBounds(2, 66, 267, 42);
		panel_1_1.add(btnThiThu_2_1);
		
		JButton btnThiThu_2_1_1 = new JButton("Thi thu\r\n");
		btnThiThu_2_1_1.setIcon(new ImageIcon(view.class.getResource("/java_01/korganizer-icon.png")));
		btnThiThu_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnThiThu_2_1_1.setBorder(null);
		btnThiThu_2_1_1.setBackground(Color.WHITE);
		btnThiThu_2_1_1.setBounds(2, 118, 267, 42);
		panel_1_1.add(btnThiThu_2_1_1);
		
		JButton btnThiThu_2_1_2 = new JButton("Thi thu\r\n");
		btnThiThu_2_1_2.setIcon(new ImageIcon(view.class.getResource("/java_01/korganizer-icon.png")));
		btnThiThu_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnThiThu_2_1_2.setBorder(null);
		btnThiThu_2_1_2.setBackground(Color.WHITE);
		btnThiThu_2_1_2.setBounds(2, 170, 267, 42);
		panel_1_1.add(btnThiThu_2_1_2);
		
		JButton btnThiThu_2_1_3 = new JButton("Thi thu\r\n");
		btnThiThu_2_1_3.setIcon(new ImageIcon(view.class.getResource("/java_01/korganizer-icon.png")));
		btnThiThu_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnThiThu_2_1_3.setBorder(null);
		btnThiThu_2_1_3.setBackground(Color.WHITE);
		btnThiThu_2_1_3.setBounds(2, 222, 267, 42);
		panel_1_1.add(btnThiThu_2_1_3);
            ///////////////
            JPanel pn_panel = new javax.swing.JPanel();
            JLabel jlabel2_1 = new javax.swing.JLabel();
            JLabel jLabel2_2 = new javax.swing.JLabel();
            JLabel jLabel2_3 = new javax.swing.JLabel();
            JLabel jLabel2_4 = new javax.swing.JLabel();
            JLabel jLabel2_5 = new javax.swing.JLabel();
            pn_panel.setName(""); // NOI18N

        jlabel2_1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlabel2_1.setForeground(new java.awt.Color(51, 153, 255));
        jlabel2_1.setText("Question");

        jLabel2_2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2_2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2_2.setText("Categories");

        jLabel2_3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2_3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2_3.setText("Import");

        jLabel2_4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2_4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2_4.setText("Export");

        jLabel2_5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2_5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2_5.setText("Question Bank");
          javax.swing.GroupLayout pn_panelLayout = new javax.swing.GroupLayout(pn_panel);
        pn_panel.setLayout(pn_panelLayout);
        pn_panelLayout.setHorizontalGroup(
            pn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_panelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(377, 377, 377)
                .addGroup(pn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_panelLayout.createSequentialGroup()
                        .addComponent(jLabel2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pn_panelLayout.createSequentialGroup()
                        .addGroup(pn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlabel2_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(162, 162, 162))))
        );
         pn_panelLayout.setVerticalGroup(
            pn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_panelLayout.createSequentialGroup()
                .addGroup(pn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_panelLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_panelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlabel2_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addComponent(jLabel2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pn_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pn_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 429, Short.MAX_VALUE))
        );
        jlabelSetUp.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabelSetMouseClick ( evt);
        }

                    private void jlabelSetMouseClick(MouseEvent evt) {
                        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                    }
        });
        private void jlabelSetUpMouseClicked () {                                     
                openMenu();        // TODO add your handling code here:
    }                 
                                      
     
		
        ImageIcon icon = new ImageIcon("icon_1.png");
        URL url = view.class.getResource("icon_1.png");
		Image img = Toolkit.getDefaultToolkit().createImage(url);

    private void openMenu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
	}
}
