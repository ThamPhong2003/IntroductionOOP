package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;

public class SignUp extends JFrame {
    private SignUp signUp;
    
    public class SignUp() {
        this.signUp = new SignUp();
		this.init();
}
    public void init (String title){

        this.setTitle("My Color");
		this.setSize(1000,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Tao container
        Container con=this.getContentPane();
        //
        JLabel lbUser=new JLabel("Username: ");
        JLabel lbPassword=new JLabel("Password: ");
      JTextField txtUser=new JTextField();
        JPasswordField txtPassword=new JPasswordField();

    JLabel lbAccess=new JLabel("Access right: ");
    JComboBox cbAccess=new JComboBox();

    JButton btnSave=new JButton("Save");
    JButton btnCancel=new JButton("Cancel");

    // Luu danh sach nguoi dung
    ArrayList listUser=new ArrayList();
        // Tao panel 1 chua username, pass, access
        JPanel panel1=new JPanel();
        panel1.setLayout(new GridLayout(3, 2));
        panel1.add(lbUser);
        panel1.add(txtUser);
        panel1.add(lbPassword);
        panel1.add(txtPassword);

        // Tao danh sach quyen truy cap
        cbAccess.addItem("Admin");
        cbAccess.addItem("Teacher");
        cbAccess.addItem("Student");

        panel1.add(lbAccess);
        panel1.add(cbAccess);

        // Tao panel 2 chua buttun save, access
        JPanel panel2=new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.add(btnSave);
        panel2.add(btnCancel);

        // Dat phuong thuc trang thai
  

        // Dat panel 1 o vung trung tam
        con.add(panel1);

        // Dat panel 2 vao vung South
        con.add(panel2, "South");

        this.pack();
        this.setVisible(true);
    }
}
