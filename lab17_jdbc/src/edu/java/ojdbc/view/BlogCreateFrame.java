package edu.java.ojdbc.view;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.java.ojdbc.controller.BlogDaoImpl;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BlogCreateFrame extends JFrame {

    private Component parent; // 부모 컴포넌트를 저장하기 위한 필드.
    private BlogDaoImpl dao; // DB 테이블 insert 기능을 가지고 있는 객체.
    
    private JPanel contentPane;
    private JTextField textTitle;
    private JTextField textAuthor;
    private JTextArea textContent;

    /**
     * Launch the application.
     */
    public static void newBlogCreateFrame(Component parent) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    BlogCreateFrame frame = new BlogCreateFrame(parent);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public BlogCreateFrame(Component parent) {
        this.parent = parent;
        this.dao = BlogDaoImpl.getInstance();
        
        initialize(); // UI 컴포넌트들(JLabel, JTextField, JTextAreat, ...)이 생성, 초기화.
    }
    
    public void initialize() {
        setTitle("새 블로그 글 작성"); // JFrame의 타이틀
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // JFrame의 닫기 버튼 동작 - 현재 창 닫기
        
        int x = parent.getX(); // 부모 창의 x 좌표
        int y = parent.getY(); // 부모 창의 y 좌표
        setBounds(x, y, 400, 600);
        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblTitle = new JLabel("제목");
        lblTitle.setFont(new Font("D2Coding", Font.BOLD | Font.ITALIC, 24));
        lblTitle.setBounds(12, 10, 360, 40);
        contentPane.add(lblTitle);
        
        textTitle = new JTextField();
        textTitle.setFont(new Font("D2Coding", Font.PLAIN, 24));
        textTitle.setBounds(12, 58, 360, 40);
        contentPane.add(textTitle);
        textTitle.setColumns(10);
        
        JLabel lblContent = new JLabel("내용");
        lblContent.setFont(new Font("D2Coding", Font.BOLD | Font.ITALIC, 24));
        lblContent.setBounds(12, 108, 360, 40);
        contentPane.add(lblContent);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(12, 158, 360, 120);
        contentPane.add(scrollPane);
        
        textContent = new JTextArea();
        scrollPane.setViewportView(textContent);
        
        JLabel lblAuthor = new JLabel("작성자");
        lblAuthor.setFont(new Font("D2Coding", Font.BOLD | Font.ITALIC, 24));
        lblAuthor.setBounds(12, 288, 360, 40);
        contentPane.add(lblAuthor);
        
        textAuthor = new JTextField();
        textAuthor.setFont(new Font("D2Coding", Font.PLAIN, 24));
        textAuthor.setColumns(10);
        textAuthor.setBounds(12, 338, 360, 40);
        contentPane.add(textAuthor);
        
        JButton btnCreate = new JButton("작성 완료");
        btnCreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createNewBlogPost();
            }
        });
        btnCreate.setFont(new Font("D2Coding", Font.PLAIN, 24));
        btnCreate.setBounds(12, 388, 360, 40);
        contentPane.add(btnCreate);
    }
    
    private void createNewBlogPost() {
        // TODO
    }
    
}
