package edu.java.list04;

public class User {
    private String userId;
    private String password;
    
    // 생성자: (1) 기본 생성자, (2) argument 2개를 갖는 생성자
    public User() {}

    public User(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }
    
    // getters/setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format("User(userId=%s, password=%s)", userId, password);
    }
}
