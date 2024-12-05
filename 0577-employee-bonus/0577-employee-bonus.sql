SELECT Employee.name, Bonus.bonus 
FROM Employee Left Join Bonus 
ON Employee.empId = Bonus.empId 
WHERE Bonus.bonus < 1000 or bonus is null;
