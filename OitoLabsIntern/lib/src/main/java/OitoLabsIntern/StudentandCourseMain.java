package OitoLabsIntern;


public class StudentandCourseMain {
	public static void main(String arg[]) {
		CourseService courseService=new CourseService();
		StudentService studentService = new StudentService();
		System.out.println(courseService.checkCourseDetails("17CS01", "DBMS"));
		System.out.println(studentService.checkStudentDetails("Kiran", 78, 99914439, "kiranrnaik78@gmail.com"));
		
	}

}
