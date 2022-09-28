package edu.java.swing10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class AppMain10 {
    private static final String[] COLUMN_NAMES = {"국어", "영어", "수학", "총점", "평균"};

    private JFrame frame;
    private JTextField textKorean;
    private JTextField textEnglish;
    private JTextField textMath;
    private JTable table;
    private DefaultTableModel model;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AppMain10 window = new AppMain10();
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
    public AppMain10() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 460, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JLabel lblKorean = new JLabel("국어");
        lblKorean.setHorizontalAlignment(SwingConstants.CENTER);
        lblKorean.setFont(new Font("D2Coding", Font.PLAIN, 24));
        lblKorean.setBounds(12, 10, 100, 48);
        frame.getContentPane().add(lblKorean);
        
        JLabel lblEnglish = new JLabel("영어");
        lblEnglish.setHorizontalAlignment(SwingConstants.CENTER);
        lblEnglish.setFont(new Font("D2Coding", Font.PLAIN, 24));
        lblEnglish.setBounds(12, 68, 100, 48);
        frame.getContentPane().add(lblEnglish);
        
        JLabel lblMath = new JLabel("수학");
        lblMath.setHorizontalAlignment(SwingConstants.CENTER);
        lblMath.setFont(new Font("D2Coding", Font.PLAIN, 24));
        lblMath.setBounds(12, 126, 100, 48);
        frame.getContentPane().add(lblMath);
        
        textKorean = new JTextField();
        textKorean.setFont(new Font("D2Coding", Font.PLAIN, 24));
        textKorean.setBounds(124, 10, 160, 48);
        frame.getContentPane().add(textKorean);
        textKorean.setColumns(10);
        
        textEnglish = new JTextField();
        textEnglish.setFont(new Font("D2Coding", Font.PLAIN, 24));
        textEnglish.setColumns(10);
        textEnglish.setBounds(124, 68, 160, 48);
        frame.getContentPane().add(textEnglish);
        
        textMath = new JTextField();
        textMath.setFont(new Font("D2Coding", Font.PLAIN, 24));
        textMath.setColumns(10);
        textMath.setBounds(124, 126, 160, 48);
        frame.getContentPane().add(textMath);
        
        JButton btnInput = new JButton("입력");
        btnInput.setFont(new Font("D2Coding", Font.PLAIN, 24));
        btnInput.setBounds(12, 184, 100, 48);
        frame.getContentPane().add(btnInput);
        
        JButton btnDelete = new JButton("삭제");
        btnDelete.setFont(new Font("D2Coding", Font.PLAIN, 24));
        btnDelete.setBounds(124, 184, 100, 48);
        frame.getContentPane().add(btnDelete);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(12, 242, 420, 189);
        frame.getContentPane().add(scrollPane);
        
        table = new JTable();
        
        model = new DefaultTableModel(null, COLUMN_NAMES);
        
        table.setModel(model);
        
        scrollPane.setViewportView(table);
    }
}
