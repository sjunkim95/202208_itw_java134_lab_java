package edu.java.jdbc01;

import java.sql.Connection; // 데이터베이스와 연결(접속)을 관리하는 인터페이스.
import java.sql.DriverManager; // SQL 드라이버(라이브러리) 관리자.
import java.sql.SQLException;

import oracle.jdbc.OracleDriver; // ojdbc8.jar 라이브러리에 포함된 클래스.

import static edu.java.ojdbc.OracleJdbc.*; // static으로 선언된 변수/메서드 이름을 import.

/*
 * JDBC(Java Database Connectivity):
 * 자바 프로그램에서 데이터베이스를 연결하고 SQL 문장들을 실행하는 방법.
 * 1. Oracle JDBC 라이브러(ojdbc8-x.x.x.x.jar)를 다운로드하고 자바 프로젝트에 추가.
 *    (1) 라이브러리 다운로드.
 *    (2) 이클립스 자바 프로젝트에 lib 폴더 생성.
 *    (3) lib 폴더에 다운로드한 jar 파일을 복사.
 *    (4) jar 파일을 빌드 패스(build path)에 추가.
 * 2. 오라클 데이터베이스 시스템에 접속하기 위한 정보들(URL, USER, PASSWORD, ...)을 상수로 정의.
 * 3. 프로그램에서 오라클 JDBC 라이브러리를 사용할 수 있도록 메모리에 로드.
 * 4. 오라클 데이터베이스 시스템에 접속(connection).
 * 
 */

public class JdbcMain01 {

    public static void main(String[] args) {
        
        Connection conn = null;
        try {
            // 3. Oracle JDBC 라이브러리 로드.
            DriverManager.registerDriver(new OracleDriver());
            System.out.println("Oracle Driver 등록 성공!");
            
            // 4. 오라클 DB에 접속.
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Oracle DB 접속 성공!");
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 사용했었던 리소스들을 해제(close)
            try {
                conn.close(); // 오라클 DB와 연결 끊기.
                System.out.println("Oracle DB 연결 해제 성공!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
