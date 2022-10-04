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

-- Ex. ALLEN과 같은 직책의 직원들의 사번, 이름, 부서번호, 직책, 급여를 검색

-- Ex. SALESMAN의 급여 최댓값보다 더 많은 급여를 받는 직원들의 사번, 이름, 급여, 직책을 검색

-- Ex. 연봉 = sal * 12 + comm. 만약 comm이 null이면 0으로 계산.
-- WARD의 연봉보다 더 많은 연봉을 받는 직원들의 사번, 이름, 급여, 수당, 연봉을 검색.
-- 연봉 내림차순으로 출력.
