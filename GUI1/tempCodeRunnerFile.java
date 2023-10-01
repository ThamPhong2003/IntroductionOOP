
import java.awt.*;
import java.lang.Package;
import javax.swing.JButton;
import javax.swing.JFrame;
public class ViDu_FlowLayout extends JFrame {
    public ViDu_FlowLayout(){
            this.setTitle("ViDU");
            this.setSize(600, 400);
            this.setLocationRelativeTo(null);    
            //set layout ;
            FlowLayout flowLayout = new FlowLayout();
            FlowLayout flowLayout2 = new FlowLayout(FlowLayout.CENTER, 10 ,10 )
            this.setLayout(flowLayout2);
            // BUtton
             JButton jb1 = new JButton("Yeu");
             JButton jb2 = new JButton( "em");
             JButton jb3 = new JButton("nhieu");
            // add cac thanh phan
            this.add(jb1);
            this.add(jb2);
            this.add(jb3);
            this.setVisible(true);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    public static void main(String[] args) {
        new ViDu_FlowLayout();
    }
}
