import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeExample extends JFrame {
    
    public TreeExample() {
        this.init();
    }

    public void init (){
        this.setTitle("Tree Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);

        // Tạo một nút gốc cho cây
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Course: IT");

        // Tạo các nút con cho nút gốc
        DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Top for IT");
        DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("C câu hỏi dễ");
        DefaultMutableTreeNode node3 = new DefaultMutableTreeNode("C khó");
        DefaultMutableTreeNode node4 = new DefaultMutableTreeNode("Công nghệ GK2 lớp 7");
        DefaultMutableTreeNode node5 = new DefaultMutableTreeNode("Default for IT");
        DefaultMutableTreeNode node6 = new DefaultMutableTreeNode("Dễ");
        DefaultMutableTreeNode node6_1 = new DefaultMutableTreeNode("2022.1");
        DefaultMutableTreeNode node6_2 = new DefaultMutableTreeNode("trước đến 2022.2");
        root.add(node1);
        node1.add(node2);
        node1.add(node3);
        node1.add(node4);
        node1.add(node5);
        node5.add(node6);
        node6.add(node6_1);
        node6.add(node6_2);

        // Tạo một cây mới từ nút gốc
        JTree tree = new JTree(root);

        // Tạo một panel để chứa cây và đặt kích thước
        JPanel panel = new JPanel();
        panel.setPreferredSize(new java.awt.Dimension(300, 300));

        // Tạo JScrollPane với cây và chế độ hiển thị dọc
        JScrollPane scrollPane = new JScrollPane(tree, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        // Thêm JScrollPane vào panel
        panel.add(scrollPane);

        // Cài đặt cửa sổ chứa panel và hiển thị
        this.setContentPane(panel);
        this.setVisible(true);
    }
}
