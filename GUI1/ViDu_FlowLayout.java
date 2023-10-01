
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
public class ViDu_FlowLayout extends JFrame {
    public ViDu_FlowLayout(){
            this.setTitle("ViDU");
            this.setSize( 600,400);
            this.setLocationRelativeTo(null);    
            //set layout ;
            /*GridLayout flowLayout_2 = new GridLayout(4,4,15,15);
            this.setLayout(flowLayout_2);
            for ( int i = 1 ; i<=16; i++){
                JButton jButton = new JButton(i+"");
                this.add(jButton);
            }            /*  BUtton
             JButton jb1 = new JButton("Yeu");
             JButton jb2 = new JButton( "em");
             JButton jb3 = new JButton("nhieu");
            // add cac thanh phan
           /*  this.add(jb1);
            this.add(jb2);
            this.add(jb3);*/
            //BoderLayOut ;
            BorderLayout bl1 = new BorderLayout(15,);
            JButton jb1 = new JButton("1"); this.add(jb1, BorderLayout.NORTH);
            JButton jb2 = new JButton("2"); this.add(jb2, BorderLayout.SOUTH);
            JButton jb3 = new JButton("3"); this.add(jb3, BorderLayout.WEST);
            JButton jb4 = new JButton("4"); this.add(jb4, BorderLayout.EAST);
            JButton jb5 = new JButton("5"); this.add(jb5, BorderLayout.CENTER);

            this.setVisible(true);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    public static void main(String[] args) {
        new ViDu_FlowLayout();
    }
}
