package view;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.CounterModel;

public class CounterView extends JFrame {
    private JButton jButton_up;
    private JButton jButton_down;
    private JButton jButton_reset;
    private JLabel jLabel_value;
    private CounterModel counterModel;
public CounterView (){
    this.init();
    this.setVisible(true);
}
public void init (){
    this.setTitle("Tang giam am luong");
    this.setSize(300, 300);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    ActionListener ac = new CounterListener(this);

    jButton_up = new JButton("UP");
    jButton_up.addActionListener(ac);
    
    jButton_down = new JButton("Down");
    jButton_up.addActionListener(ac);
    
    jButton_reset = new JButton("Reset");
    jButton_up.addActionListener(ac);

    jLabel_value = new JLabel(this.counterModel.getValue()+"", JLabel.CENTER);
    JPanel jPanel = new JPanel();
    jPanel.setLayout( new BorderLayout());
    jPanel.add(jButton_up, BorderLayout.WEST);
    jPanel.add(jButton_down, BorderLayout.EAST);
    jPanel.add(jButton_reset, BorderLayout.SOUTH);
    //
    this.setLayout(new BorderLayout());
    this.add(jPanel, BorderLayout.CENTER);
}
}