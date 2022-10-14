SELECT NAME, COUNT(NAME) AS 'COUNT' 
FROM animal_ins 
GROUP BY NAME 
HAVING COUNT(NAME) > 1 
ORDER BY NAME