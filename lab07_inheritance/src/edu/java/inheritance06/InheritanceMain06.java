package edu.java.inheritance06;

import java.util.Random;
import java.util.Scanner;

public class InheritanceMain06 {

    public static void main(String[] args) {
        // java.lang.Object 클래스: 자바의 최상위 클래스
        // -> 자바의 모든 클래스 Object 클래스의 public 멤버(변수, 메서드)를 상속받아서 사용, 재정의(override)할 수 있음.
        // -> toString(), equals(), hashCode(), ...
        T t = new T();
        System.out.println(t.getClass());
        System.out.println(t.hashCode() + " = " + Integer.toHexString(t.hashCode()));
        // Integer.toHexString(int i): 정수 i를 16진수 문자열로 변환해서 리턴.
        System.out.println(t.toString());
        System.out.println(t);
        // println(Object x) 메서드는 argument로 전달된 객체의 toString() 메서드를 호출하고,
        // 그 객체의 toString() 메서드가 리턴해 주는 문자열들 콘솔창에 출력.
        // -> Ojbect의 toString() 메서드를 하위 클래스에서 override하면 콘솔창 출력을 바꿀 수 있음.
        
        Random rand = new Random();
        System.out.println(rand); // Random 클래스는 Object의 toString() 메서드를 override하지 않았음.
        
        Scanner sc = new Scanner(System.in);
        System.out.println(sc); // Scanner 클래스는 Object의 toString() 메서드를 override하고 있음.
        
        System.out.println("\n----------\n");
        
        // Point 타입 객체 생성
        Point p1 = new Point(); // 기본 생성자
        System.out.println(p1);
        
        // Point 타입 객체 생성
        Point p2 = new Point(0, 0); // argument를 갖는 생성자
        System.out.println(p2);
        
        System.out.println(p1 == p2);
        
    }

}

class T {}

