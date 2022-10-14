SELECT animal_type, IFNULL(NAME, 'No name') AS NAME, sex_upon_intake
FROM animal_ins ORDER BY animal_id