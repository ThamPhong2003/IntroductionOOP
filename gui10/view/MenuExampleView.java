package view;
import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuExampleView extends JFrame {
    public MenuExampleView(){
        this.setTitle("Menuuuu");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        //Tao thanh Menu
        JMenuBar jMenuBar = new JMenuBar();
        //Tao ô File
        JMenu jMenu_file = new JMenu("Gi do");
        JMenuItem jMenuItem_NhuQUynh = new JMenuItem("Nhu Quynh") ;
        JMenuItem jMenu_ThamPhong = new JMenuItem("Tham Phong");
        jMenu_file.add(jMenuItem_NhuQUynh);
        jMenu_file.add(jMenu_ThamPhong);
        // taoj o exit
        JMenu jMenu_Exit = new JMenu("Khong co gi dau");
        JMenuItem jMenuItem_Exit = new JMenuItem("Exit");
        JMenuItem jMenuItem_NotExit = new JMenuItem("Khong Exit dau");
        jMenu_Exit.add(jMenuItem_Exit);
        jMenu_Exit.addSeparator();
        jMenu_Exit.add(jMenuItem_NotExit);
        //Add cac o vao taskbar;
        jMenuBar.add(jMenu_file);
        jMenuBar.add(jMenu_Exit);
        this.setLayout(new BorderLayout());
        this.setJMenuBar(jMenuBar);
        this.setVisible(true);
    }
}