import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeComboBoxExample extends JFrame {

    private DefaultMutableTreeNode root;
    private JComboBox<DefaultMutableTreeNode> comboBox;

    public TreeComboBoxExample() {
        this.init();
    }

    public void init() {
        this.setTitle("Tree ComboBox Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);

        // Tạo một nút gốc cho cây
        root = new DefaultMutableTreeNode("Course: IT");

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

        // Tạo đối tượng DefaultComboBoxModel để lưu trữ các nút trong cây
        DefaultComboBoxModel<DefaultMutableTreeNode> comboBoxModel = new DefaultComboBoxModel<>();
        comboBoxModel.addElement(root);

        // Tạo đối tượng JComboBox để hiển thị danh sách cây
        comboBox = new JComboBox<>(comboBoxModel);
        comboBox.setEditable(false);
        comboBox.setMaximumRowCount(10);
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox<DefaultMutableTreeNode> combo = (JComboBox<DefaultMutableTreeNode>) e.getSource();
                DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) combo.getSelectedItem();
                if (selectedNode.getChildCount() > 0) {
                    DefaultComboBoxModel<DefaultMutableTreeNode> model = (DefaultComboBoxModel<DefaultMutableTreeNode>) combo.getModel();
                    model.removeAllElements();
                    model.addElement(root);
                    for (int i = 0; i < selectedNode.getChildCount(); i++) {
                        model.addElement((DefaultMutableTreeNode) selectedNode.getChildAt(i));
                    }
                }
            }
        });

        // Tạo một panel để chứa JComboBox
        JPanel panel = new JPanel();
        panel.add(comboBox);

        // Cài đặt cửa sổ chứa panel và hiển thị
        this.add(panel);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new TreeComboBoxExample();
    }
}
