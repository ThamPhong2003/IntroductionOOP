import javax.swing.*;
import javax.swing.tree.*;

public class TreeComboBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tree ComboBox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Node 1");
        DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Node 2");
        DefaultMutableTreeNode node3 = new DefaultMutableTreeNode("Node 3");

        DefaultMutableTreeNode node11 = new DefaultMutableTreeNode("Node 1.1");
        DefaultMutableTreeNode node12 = new DefaultMutableTreeNode("Node 1.2");
        DefaultMutableTreeNode node21 = new DefaultMutableTreeNode("Node 2.1");
        DefaultMutableTreeNode node22 = new DefaultMutableTreeNode("Node 2.2");

        node1.add(node11);
        node1.add(node12);
        node2.add(node21);
        node2.add(node22);

        root.add(node1);
        root.add(node2);
        root.add(node3);

        DefaultComboBoxModel<TreeNode> model = new DefaultComboBoxModel<>();
        model.addElement(root);

        JComboBox<TreeNode> treeComboBox = new JComboBox<>(model);
        treeComboBox.setRenderer(new DefaultListCellRenderer() {
            @Override
            public java.awt.Component getListCellRendererComponent(JList<?> list, Object value, int index,
                    boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value instanceof DefaultMutableTreeNode) {
                    setText(((DefaultMutableTreeNode) value).getUserObject().toString());
                }
                return this;
            }
        });

        frame.getContentPane().add(treeComboBox);

        frame.pack();
        frame.setVisible(true);
    }
}
