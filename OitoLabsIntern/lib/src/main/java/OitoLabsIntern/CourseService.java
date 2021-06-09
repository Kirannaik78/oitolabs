package OitoLabsIntern;
import java.util.regex.Pattern;
import lombok.SneakyThrows;
import lombok.val;
import lombok.NonNull;


public class CourseService {
	 private Course  course= new Course();
	@SneakyThrows
	public void checkCourseId(String courseId) {
		System.out.println(courseId);
		val status= Pattern.matches("[0-9A-Z0-9]{6}",courseId);
		if(!status) {
			throw new CustomException("Invalid CourseId");
		}
		else
			course.setCourseId(courseId);
	}
	@SneakyThrows
	public void checkCourseName(String courseName) {
		if(Pattern.matches(courseName,"\\d")) {
			throw new CustomException("Invalid Name");
		}
		else
			course.setName(courseName);
	}
	@SneakyThrows
	public String checkCourseDetails(@NonNull String courseId,@NonNull String courseName) {
		if(courseId!=null&&courseName!=null)
		{
			checkCourseId(courseId);
			checkCourseName(courseName);
			return course.toString();
		}
		else  {
			throw new CustomException( "missing values");
		}
		
	}
}
