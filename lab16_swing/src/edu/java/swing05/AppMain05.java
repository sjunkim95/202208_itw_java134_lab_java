package edu.java.swing05;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;

public class AppMain05 {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AppMain05 window = new AppMain05();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public AppMain05() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JLabel lblImage = new JLabel(new ImageIcon("images/flower1.jpg"));
        lblImage.setBounds(12, 10, 640, 640);
        frame.getContentPane().add(lblImage);
        
        JButton btnPrev = new JButton("Prev");
        btnPrev.setFont(new Font("D2Coding", Font.PLAIN, 28));
        btnPrev.setBounds(12, 660, 200, 72);
        frame.getContentPane().add(btnPrev);
        
        JButton btnNext = new JButton("Next");
        btnNext.setFont(new Font("D2Coding", Font.PLAIN, 28));
        btnNext.setBounds(452, 660, 200, 72);
        frame.getContentPane().add(btnNext);
    }

}
