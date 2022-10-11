package edu.java.ojdbc.view;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class BlogDetailFrame extends JFrame {
    
    private Component parent;
    private Integer blogNo;

    private JPanel contentPane;
    private JTextField textBlogNo;
    private JTextField textTitle;
    private JTextField textAuthor;
    private JTextField textCreatedDate;
    private JTextField textModifiedDate;

    /**
     * Launch the application.
     */
    public static void newBlogDetailFrame(Component parent, Integer blogNo) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    BlogDetailFrame frame = new BlogDetailFrame(parent, blogNo);
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
    public BlogDetailFrame(Component parent, Integer blogNo) {
        this.parent = parent; // 부모 컴포넌트 객체 저장.
        this.blogNo = blogNo; // 상세보기/수정할 블로그 글 번호.
        
        initialize(); // UI 컴포넌트 생성, 초기화.
    }
    
    public void initialize() {
        setTitle("블로그 상세 보기");
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        int x = parent.getX(); // 부모 컴포넌트 x 좌표
        int y = parent.getY(); // 부모 컴포넌트 y 좌표
        setBounds(x, y, 400, 800);
        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblBlogNo = new JLabel("번호");
        lblBlogNo.setFont(new Font("D2Coding", Font.BOLD | Font.ITALIC, 24));
        lblBlogNo.setBounds(12, 10, 360, 40);
        contentPane.add(lblBlogNo);
        
        textBlogNo = new JTextField();
        textBlogNo.setText(blogNo.toString());
        textBlogNo.setEditable(false);
        textBlogNo.setFont(new Font("D2Coding", Font.PLAIN, 24));
        textBlogNo.setBounds(12, 60, 360, 40);
        contentPane.add(textBlogNo);
        textBlogNo.setColumns(10);
        
        JLabel lblTitle = new JLabel("제목");
        lblTitle.setFont(new Font("D2Coding", Font.BOLD | Font.ITALIC, 24));
        lblTitle.setBounds(12, 110, 360, 40);
        contentPane.add(lblTitle);
        
        textTitle = new JTextField();
        textTitle.setFont(new Font("D2Coding", Font.PLAIN, 24));
        textTitle.setColumns(10);
        textTitle.setBounds(12, 160, 360, 40);
        contentPane.add(textTitle);
        
        JLabel lblContent = new JLabel("내용");
        lblContent.setFont(new Font("D2Coding", Font.BOLD | Font.ITALIC, 24));
        lblContent.setBounds(12, 210, 360, 40);
        contentPane.add(lblContent);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(12, 260, 360, 120);
        contentPane.add(scrollPane);
        
        JTextArea textContent = new JTextArea();
        textContent.setFont(new Font("D2Coding", Font.PLAIN, 24));
        scrollPane.setViewportView(textContent);
        
        JLabel lblAuthor = new JLabel("작성자");
        lblAuthor.setFont(new Font("D2Coding", Font.BOLD | Font.ITALIC, 24));
        lblAuthor.setBounds(12, 390, 360, 40);
        contentPane.add(lblAuthor);
        
        textAuthor = new JTextField();
        textAuthor.setFont(new Font("D2Coding", Font.PLAIN, 24));
        textAuthor.setEditable(false);
        textAuthor.setColumns(10);
        textAuthor.setBounds(12, 440, 360, 40);
        contentPane.add(textAuthor);
        
        JLabel lblCreatedDate = new JLabel("작성 시간");
        lblCreatedDate.setFont(new Font("D2Coding", Font.BOLD | Font.ITALIC, 24));
        lblCreatedDate.setBounds(12, 490, 360, 40);
        contentPane.add(lblCreatedDate);
        
        textCreatedDate = new JTextField();
        textCreatedDate.setFont(new Font("D2Coding", Font.PLAIN, 24));
        textCreatedDate.setEditable(false);
        textCreatedDate.setColumns(10);
        textCreatedDate.setBounds(12, 540, 360, 40);
        contentPane.add(textCreatedDate);
        
        JLabel lblModifiedDate = new JLabel("최종 업데이트 시간");
        lblModifiedDate.setFont(new Font("D2Coding", Font.BOLD | Font.ITALIC, 24));
        lblModifiedDate.setBounds(12, 590, 360, 40);
        contentPane.add(lblModifiedDate);
        
        textModifiedDate = new JTextField();
        textModifiedDate.setFont(new Font("D2Coding", Font.PLAIN, 24));
        textModifiedDate.setEditable(false);
        textModifiedDate.setColumns(10);
        textModifiedDate.setBounds(12, 640, 360, 40);
        contentPane.add(textModifiedDate);
        
        JButton btnUpdate = new JButton("수정 완료");
        btnUpdate.setFont(new Font("D2Coding", Font.PLAIN, 24));
        btnUpdate.setBounds(12, 690, 360, 40);
        contentPane.add(btnUpdate);
    }

}
