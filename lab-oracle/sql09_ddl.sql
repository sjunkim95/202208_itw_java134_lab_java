/*
 * SQL 종류:
 * 1. DQL(Data Query Language): 데이터 질의 언어. select 문장.
 * 2. DDL(Data Definition Language): 데이터 정의 언어.
 *    - create, alter, truncate, drop
 *    - 테이블, 사용자 계정을 생성, 변경, 삭제하는 SQL 문장.
 * 3. DML(Data Manipulation Language): 데이터 조작 언어.
 *    - insert, update, delete
 *    - 테이블에 행(row)을 추가, 변경, 삭제하는 SQL 문장.
 * 4. TCL(Transaction Control Language): 트랜잭션 관리(제어) 언어.
 *    -- commit(변경 내용을 DB에 영구 저장), rollback(직전 commit까지 상태로 되돌리기)
 */
 
 /*
  * 테이블 생성:
  * create table 테이블이름 (
  *     컬럼이름  데이터타입  [제약조건, 기본값],
  *     ...
  * );
  */

/*
 * 테이블 이름: students
 * 컬럼 이름/데이터 타입:
 *   - sid: 학생 아이디. 숫자(number, 4자리 정수).
 *   - sname: 학생 이름. 문자열(varchar2, 10 글자까지 저장 가능한 문자열).
 *   - birthday: 생일. 날짜(date).
 */
create table students (
    sid         number(4),
    sname       varchar2(10 char),
    birthday    date
);

desc students; -- 생성된 테이블의 구조(컬럼, Null 가능 여부, 데이터 타입) 확인.

select * from students;












