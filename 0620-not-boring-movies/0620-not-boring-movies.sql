Select * from Cinema
where id % 2 != 0 and description != "boring"
ORDER BY Rating DESC;