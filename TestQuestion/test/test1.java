package test;

import javax.swing.SwingUtilities;

import view.QuizView;

public class test1 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new QuizView("questions.txt");
            }
        });
    }
    
}
