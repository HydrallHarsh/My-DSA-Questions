# Write your MySQL query statement below
Select employee_id from Employees
where (manager_id not in (Select employee_id from Employees)) and salary < 30000
Order by employee_id;