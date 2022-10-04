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
