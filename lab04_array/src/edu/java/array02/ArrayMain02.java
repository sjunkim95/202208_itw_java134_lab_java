package edu.java.array02;

public class ArrayMain02 {

    public static void main(String[] args) {
        // 문자열 3개를 저장할 수 있는 배열(subjects)을 선언.
        String[] subjects = new String[3];
        
        // 배열에 문자열들을 저장.
        subjects[0] = "Java";
        subjects[1] = "SQL";
        subjects[2] = "HTML";
        
        // 배열에 저장된 문자열들을 순서대로 한 줄에 출력.
        // 1) for 문
        for (int i = 0; i < subjects.length; i++) {
            System.out.print(subjects[i] + " ");
        }
        System.out.println();
        
        // 2) for-each 문
        for (String s : subjects) {
            System.out.print(s + ", ");
        }
        System.out.println();

        System.out.println("-----");
        String[] names = {"김다훈", "이존규", "최은정", "김준오"};
        for (String n : names) {
            System.out.println(n);
        }
        
        System.out.println("-----");
        // boolean 5개를 저장할 수 있는 배열(boolArray)을 선언.
        boolean[] boolArray = new boolean[5];
        
        // for 문을 사용해서 짝수 인덱스에는 true, 홀수 인덱스에는 false를 저장.
        for (int i = 0; i < boolArray.length; i++) {
            if (i % 2 == 0) {
                boolArray[i] = true;
            } else {
                boolArray[i] = false;
            }
        }
        
        // for-each 문을 사용해서 배열의 내용을 출력.
        for (boolean b : boolArray) {
            System.out.println(b);
        }
        
    }

}
