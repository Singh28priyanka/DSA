# Write your MySQL query statement below
Select max(Salary)As secondhighestsalary
from employee 
where  salary < (Select max(Salary) from employee);
