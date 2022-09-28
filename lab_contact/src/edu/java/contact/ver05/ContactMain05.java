package edu.java.contact.ver05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ContactMain05 {
    private static final String[] COLUMN_NAMES = {"이름", "전화번호"};

    private JFrame frame;
    private JTable table;
    private DefaultTableModel model;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ContactMain05 window = new ContactMain05();
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
    public ContactMain05() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 601, 443);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel buttonPanel = new JPanel();
        frame.getContentPane().add(buttonPanel, BorderLayout.NORTH);
        
        JButton btnCreate = new JButton("새 연락처");
        btnCreate.setFont(new Font("D2Coding", Font.PLAIN, 24));
        buttonPanel.add(btnCreate);
        
        JButton btnUpdate = new JButton("연락처 수정");
        btnUpdate.setFont(new Font("D2Coding", Font.PLAIN, 24));
        buttonPanel.add(btnUpdate);
        
        JButton btnDelete = new JButton("연락처 삭제");
        btnDelete.setFont(new Font("D2Coding", Font.PLAIN, 24));
        buttonPanel.add(btnDelete);
        
        JButton btnSearch = new JButton("검색");
        btnSearch.setFont(new Font("D2Coding", Font.PLAIN, 24));
        buttonPanel.add(btnSearch);
        
        JScrollPane scrollPane = new JScrollPane();
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
        
        table = new JTable();
        model = new DefaultTableModel(null, COLUMN_NAMES);
        table.setModel(model);
        scrollPane.setViewportView(table);
    }

}
