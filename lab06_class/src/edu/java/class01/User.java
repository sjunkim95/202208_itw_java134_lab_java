package edu.java.class01;

// 클래스: 데이터 + 기능 + 생성자 ==> 데이터 타입
public class User {
    // 객체가 가지는 속성들(데이터)
    String userId;
    String password;
    int age;

    // 생성자(constructor)
    // 생성자의 이름은 클래스의 이름과 동일. 생성자는 리턴 타입을 사용하지 않음!
    
    // 기본 생성자(default constructor) - argument를 갖지 않는 생성자
    // 모든 속성들을 그 타입의 기본값으로 초기화함.
    // 숫자 타입 기본값: 0, boolean 타입 기본값: false, 참조 타입 기본값: null
    public User() {
        // Do nothing.
    }
    
    // argument를 갖는 생성자
    public User(String userId, String password, int age) {
        this.userId = userId;
        this.password = password;
        this.age = age;
    }
    
    // 생성자 오버로딩(overloading): 파라미터가 다른 생성자를 여러개 정의하는 것.
    
}
