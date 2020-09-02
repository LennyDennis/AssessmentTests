SELECT institution.name AS `INSTITUTION NAME`,course.name AS `COURSE NAME`,COUNT(student.studentid) AS `NUMBER OF STUDENTS`
    FROM institution INNER JOIN course ON institution.institutionid = course.institution
    INNER JOIN student ON course.courseid = student.course GROUP BY course.courseid;