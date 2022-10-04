-- Sub Query: query 문의 일부로 또 다른 query 문이 사용되는 것.

-- 전체 직원의 급여 평균보다 더 많은 급여를 받는 직원들의 레코드(모든 정보)를 검색.
-- (1) 전체 직원의 급여 평균을 검색:
select avg(sal) from emp;
-- (2) (1)에서 찾은 급여 평균보다 더 많은 급여를 받는 직원을 검색:
select * 
from emp
where sal > 2073;

-- 위의 (1), (2)을 한 문장으로 --> Sub Query
select * from emp
where sal > (
    select avg(sal) from emp
);

-- Ex. ALLEN보다 적은 급여를 받는 직원들의 사번, 이름, 급여를 검색
select empno, ename, sal
from emp
where sal < (
    select sal from emp where ename = 'ALLEN'
);

-- Ex. ALLEN과 같은 직무의 직원들의 사번, 이름, 부서번호, 직무, 급여를 검색
select empno, ename, deptno, job, sal
from emp
where job = (
    select job from emp where ename = 'ALLEN'
);

-- Ex. SALESMAN의 급여 최댓값보다 더 많은 급여를 받는 직원들의 사번, 이름, 급여, 직무를 검색
select empno, ename, sal, job
from emp
where sal > (
    select max(sal) from emp where job = 'SALESMAN'
);

-- Ex. 연봉 = sal * 12 + comm. 만약 comm이 null이면 0으로 계산.
-- WARD의 연봉보다 더 많은 연봉을 받는 직원들의 사번, 이름, 급여, 수당, 연봉을 검색.
-- 연봉 내림차순으로 출력.
select empno, ename, sal, comm, 
    sal * 12 + nvl(comm, 0) as "ANNUAL_SAL"  -- nvl2(comm, comm, 0)
from emp
where sal * 12 + nvl(comm, 0) > (
    select sal * 12 + nvl(comm, 0) 
    from emp
    where ename = 'WARD'
)
order by ANNUAL_SAL desc;

-- Ex. SCOTT과 같은 급여를 받는 직원(들)의 이름과 급여를 검색.
select ename, sal
from emp
where sal = (
    select sal from emp where ename = 'SCOTT'
);

-- Ex. 위 결과에서 SCOTT은 제외하고 검색.
select ename, sal
from emp
where sal = ( select sal from emp where ename = 'SCOTT' )
    and ename != 'SCOTT';

-- Ex. ALLEN보다 늦게 입사한 직원(들)의 이름, 입사날짜를 최근 입사일부터 출력.
select ename, hiredate
from emp
where hiredate > (
    select hiredate from emp where ename = 'ALLEN'
);

-- Ex. 매니저가 KING인 직원(들)의 사번, 이름, 매니저 사번을 검색.
-- (힌트) 매니저 사번이 KING의 사번과 일치하는 레코드를 검색.
select empno, ename, mgr
from emp
where mgr = (
    select empno from emp where ename = 'KING'
);

-- Ex. DALLAS에서 근무하는 직원들의 이름, 급여, 부서번호를 검색.
-- (힌트) dept 테이블에서 위치가 DALLAS인 부서의 부서 번호를 subquery로.
select ename, sal, deptno
from emp
where deptno = (
    select deptno from dept where loc = 'DALLAS'
);

-- 단일행 서브쿼리: 서브쿼리의 결과가 행이 1개 이하인 경우.
-- 다중행 서브쿼리: 서브쿼리의 결과가 2개 이상의 행인 경우.
--   다중행 서브쿼리에서는 한 개의 값과 단순비교(=, !=, >, <, ...)를 할 수 없음!
--   in, any, all과 같은 키워드를 함께 사용해야 함.


