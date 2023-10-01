package View;
import javax.swing.*;
import Model.counter;
import java.awt.*;
import java.net.http.WebSocket.Listener;

public class view extends JFrame{
    private counter counter ;
    private JButton jbup;
    private JButton jbdown;
    private JLabel jLabel_Value;
    public view (){
        this.counter = new counter();
        this.init();
    }
    public void init (){
        this.setTitle("Counter");
        this.setLocationRelativeTo(null);
        this.setSize(300,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //
        jbup = new JButton("Up");
        jbdown = new JButton("Down");
        jLabel_Value = new JLabel(this.counter.getValue()+"", JLabel.CENTER);
        //
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add(jbup, BorderLayout.WEST);
        jPanel.add(jbdown, BorderLayout.EAST);
        jPanel.add(jLabel_Value, BorderLayout.CENTER);
        this.setLayout(new BorderLayout());
        this.add(jPanel, BorderLayout.CENTER);

    }

}
