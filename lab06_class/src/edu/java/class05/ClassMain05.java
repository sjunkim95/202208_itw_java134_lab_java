package edu.java.class05;

public class ClassMain05 {

    public static void main(String[] args) {
        // Score 타입의 객체 생성, 메서드들을 테스트.
        Score score1 = new Score();
        System.out.println("score1 = " + score1);
//        System.out.println("score1 korean = " + score1.korean);
//        System.out.println("score1 english = " + score1.english);
//        System.out.println("score1 math = " + score1.math);
        
        score1.printScore();
//        int total = score1.getTotal();
//        System.out.println("총점: " + total);
        System.out.println("총점: " + score1.getTotal());
        System.out.println("평균: " + score1.getAverage());

        // Student 타입의 객체 생성, 메서드를 테스트.
        
    }

}
