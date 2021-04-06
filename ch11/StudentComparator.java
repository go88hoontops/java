package com.jh.ch11;

import java.util.Comparator;

import com.jh.ch11.CompareExam.Student;

class StudentComparator implements Comparator<Student>{
@Override

	public int compare(Student a, Student b) {

	return Integer.compare(a.sno, b.sno);

//		if(a.sno<b.sno) return -1;
//
//		else if (a.sno == b.sno) return 0; 	//위의코드가 이 세줄과같은효과임.
//		
//		else return 1;

	}
	
}
