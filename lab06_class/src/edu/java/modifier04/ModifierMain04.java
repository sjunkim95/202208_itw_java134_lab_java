package edu.java.modifier04;

public class ModifierMain04 {

    public static void main(String[] args) {
        // Member 타입의 객체 생성.
        Member m = new Member("guest", "0000");
        System.out.println(m);
        System.out.println(m.getMemberId());
//        m.memberId = ""; // private 멤버는 다른 클래스에서 직접 사용할 수 없음.
        System.out.println(m.getPassword());
        m.setPassword("!@#$");
        System.out.println(m.getPassword());

    }

}
