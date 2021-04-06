package com.jh.ch13;
import java.util.Arrays;

public class WildCardExam {

	public static void registerCourse(Course<?> course ) {
		// <?> 로 모든타임의 직업이될듯? worker , student , highstudent..
			System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()) );
		}
	
	public static  void registerCourseStudent( Course<? extends Student> course ) {

		System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()) );
	}
	
	public static  void registerCourseWorker(Course<? super Worker> course ) {
		System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()) );
	}
	
	
	
	public static void main(String[] args) {

			Course<Person> personCourse = new Course<Person>("일반인과정" , 5);
				personCourse.add(new Person ("일반인"));
				personCourse.add(new Worker ("직장인"));
				personCourse.add(new Student ("학생"));
				personCourse.add(new HighStudent ("고등학생"));
				
			Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
				workerCourse.add(new Worker("직장인"));
	
			Course<Student> studentCourse = new Course<Student>("학생과정", 5);
				studentCourse.add(new Student("학생"));
				studentCourse.add(new HighStudent("고등학생"));
				
			Course<HighStudent> hightStudentCourse = new Course<HighStudent>("고등학생 과정", 5);
				hightStudentCourse.add(new HighStudent("직장인"));
			
	
	
			registerCourse(personCourse);
			registerCourse(workerCourse);
			registerCourse(studentCourse);
			registerCourse(hightStudentCourse);

			System.out.println("");
			
			
//			registerCourseStudent(personCourse); 둘다안됌
//			registerCourseStudent(workerCourse);
			registerCourseStudent(studentCourse);
			registerCourseStudent(hightStudentCourse);
			System.out.println("");

			
			
			registerCourseWorker(personCourse); 
			registerCourseWorker(workerCourse);
			
//			registerCourseStudent(studentCourse);
//			registerCourseStudent(hightStudentCourse);
	}

}
