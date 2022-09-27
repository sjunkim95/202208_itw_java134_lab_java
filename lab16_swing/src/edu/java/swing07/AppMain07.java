package edu.java.swing07;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AppMain07 {

    private JFrame frame;
    private final ButtonGroup buttonGroup = new ButtonGroup();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AppMain07 window = new AppMain07();
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
    public AppMain07() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 628, 560);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JRadioButton rbPrivate = new JRadioButton("private");
        buttonGroup.add(rbPrivate);
        rbPrivate.setFont(new Font("D2Coding", Font.PLAIN, 28));
        rbPrivate.setBounds(8, 6, 140, 62);
        frame.getContentPane().add(rbPrivate);
        
        JRadioButton rbPackage = new JRadioButton("package");
        buttonGroup.add(rbPackage);
        rbPackage.setFont(new Font("D2Coding", Font.PLAIN, 28));
        rbPackage.setBounds(152, 6, 140, 62);
        frame.getContentPane().add(rbPackage);
        
        JRadioButton rbProtected = new JRadioButton("protected");
        buttonGroup.add(rbProtected);
        rbProtected.setFont(new Font("D2Coding", Font.PLAIN, 28));
        rbProtected.setBounds(296, 6, 163, 62);
        frame.getContentPane().add(rbProtected);
        
        JRadioButton rbPublic = new JRadioButton("public");
        buttonGroup.add(rbPublic);
        rbPublic.setFont(new Font("D2Coding", Font.PLAIN, 28));
        rbPublic.setBounds(463, 6, 140, 62);
        frame.getContentPane().add(rbPublic);
        
        JCheckBox cbAbstract = new JCheckBox("abstract");
        cbAbstract.setFont(new Font("D2Coding", Font.PLAIN, 28));
        cbAbstract.setBounds(8, 70, 140, 62);
        frame.getContentPane().add(cbAbstract);
        
        JCheckBox cbFinal = new JCheckBox("final");
        cbFinal.setFont(new Font("D2Coding", Font.PLAIN, 28));
        cbFinal.setBounds(162, 70, 140, 62);
        frame.getContentPane().add(cbFinal);
        
        JCheckBox cbStatic = new JCheckBox("static");
        cbStatic.setFont(new Font("D2Coding", Font.PLAIN, 28));
        cbStatic.setBounds(306, 70, 140, 62);
        frame.getContentPane().add(cbStatic);
        
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setFont(new Font("D2Coding", Font.PLAIN, 28));
        
        final String[] items = {"naver.com", "kakao.com", "gmail.com", "msn.com"};
        ComboBoxModel<String> model = new DefaultComboBoxModel<>(items);
        comboBox.setModel(model);
        
        comboBox.setBounds(8, 138, 284, 62);
        frame.getContentPane().add(comboBox);
        
        JButton btnShowInfo = new JButton("확인");
        btnShowInfo.setFont(new Font("D2Coding", Font.PLAIN, 28));
        btnShowInfo.setBounds(8, 210, 284, 62);
        frame.getContentPane().add(btnShowInfo);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(18, 282, 570, 229);
        frame.getContentPane().add(scrollPane);
        
        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("D2Coding", Font.PLAIN, 28));
        scrollPane.setViewportView(textArea);
    }
}
