-- 오라클 함수(function)
-- (1) 단일 행 함수:
--     행(row)이 하나씩 함수의 argument로 전달되고, 행 마다 하나씩 결과가 리턴되는 함수.
-- (2) 다중 행 함수(그룹 함수):
--     여러 개의 행(row)이 한꺼번에 함수의 argument로 전달되서, 하나의 결과가 리턴되는 함수.
--     (예) 통계 관련 함수들: count, sum, avg, max, min, variance(분산), stddev(표준편차)
-- 단일 행 함수과 그룹 함수는 동시에 select 할 수 없음!

-- 단일 행 함수의 예:
-- 문자열을 소문자로 바꾸기
select ename, lower(ename) 
from emp;

-- 날짜 타입 데이터를 원하는 문자열 포맷으로 출력하기
select hiredate, to_char(hiredate, 'YYYY-MM-DD')
from emp;

-- nvl(컬럼, value): 컬럼이 null이면 value를 리턴하고, null이 아니면 원래 값을 리턴.
-- nvl2(컬럼, value1, value2): 컬럼이 null이 아니면 value1을 리턴하고, null이면 value2를 리턴.
select comm, nvl(comm, -1), nvl2(comm, comm, -1)
from emp;
