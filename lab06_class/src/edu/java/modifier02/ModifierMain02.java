package edu.java.modifier02;

import edu.java.modifier01.AccessTest;

public class ModifierMain02 {

    public static void main(String[] args) {
        // Ctrl+Shift+O: import 문장 최적화.
        // edu.java.modifier01.AccessTest 객체 생성.
        AccessTest test = new AccessTest(1, 2, 3, 4);
        // test.c = 100;
        // private, (package), protected 멤버 변수들은 보이지 않음. 직접 접근 불가능.
        test.printMembers();

    }

}
