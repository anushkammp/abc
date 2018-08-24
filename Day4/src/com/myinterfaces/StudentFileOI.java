package com.myinterfaces;

import com.pojo.Student;

public interface StudentFileOI 
{
	Student[] readStudents();
	int WriteStudents(Student[] students);
}
