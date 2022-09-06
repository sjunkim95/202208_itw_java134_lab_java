package edu.java.mvc.view;

import java.util.Scanner;

import edu.java.mvc.controller.MemberDaoImpl;
import edu.java.mvc.model.Member;

// MVC(Model-View-Controller) 아키텍쳐를 사용한 회원 관리 프로그램
// 1. Model: 애플리케이션의 데이터를 설계한 클래스. Member.
//    VO(Value Object), DTO(Data Transfer Object)
// 2. View: 애플리케이션의 UI(User Interface)를 담당하는 클래스. MemberMain.
// 3. Controller: 애플리케이션의 특정 로직, 기능을 담당하는 클래스.
//    DAO(Data Access Object)
//    - MemberDao 인터페이스.
//    - MemberDaoImpl 클래스 -> Single 패턴 적용.

// View
public class MemberMain {
    
    private Scanner scanner = new Scanner(System.in);
    private MemberDaoImpl dao = MemberDaoImpl.getInstance();

    public static void main(String[] args) {
        System.out.println("*** 회원 관리 프로그램 ***");
        
        MemberMain app = new MemberMain();
        // -> MemberMain 객체의 non-static 멤버들을 사용하기 위해서.
        
        boolean run = true;
        while (run) {
            // 메뉴 보여주기
            int n = app.chooseMenu();
            Menu menu = Menu.getValue(n);
            switch (menu) {
            case QUIT:
                run = false;
                break;
            case CREATE:
                app.createNewMember();
                break;
            default:
                System.out.println("잘못된 메뉴 선택 - 메뉴를 다시 선택하세요.");
            }
        }
        
        System.out.println("*** 프로그램 종료 ***");
    } // end main
    
    private void createNewMember() {
        System.out.println("----- 회원가입 -----");
        System.out.print("아이디 입력>> ");
        String id = scanner.nextLine();
        System.out.print("비밀번호 입력>> ");
        String password = scanner.nextLine();
        
        Member m = new Member(id, password);
        // Member 타입 객체를 배열 저장 -> Controller 객체를 이용.
        int result = dao.create(m);
        if (result == 1) {
            System.out.println("회원 정보 생성/저장 성공");
        } else {
            System.out.println("회원 정보 생성/저장 실패");
        }
    }
    
    private int chooseMenu() {
        System.out.println();
        System.out.println("---------------------------------------------------------");
        System.out.println("[0]종료 [1]회원가입 [2]전체검색 [3]인덱스검색 [4]업데이트");
        System.out.println("---------------------------------------------------------");
        System.out.print("선택> ");
        
        int n = Integer.parseInt(scanner.nextLine());
        
        return n;
    }
    
}
