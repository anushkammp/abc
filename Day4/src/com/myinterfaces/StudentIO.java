package com.myinterfaces;

import com.pojo.Student;

public interface StudentIO 
{
	Student[] ReadFromUser();
	void writeToUser(Student[] students);
}
