package OitoLabsIntern;

import java.util.regex.Pattern;
import lombok.SneakyThrows;
import lombok.var;

public class StudentService {
	Student student= new Student();
	@SneakyThrows
	public void checkEmail(String email) {
		var status=email.matches( "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
		System.out.println(status);
		if(!status) {
			throw new CustomException("Invalid Email");
		}
		student.setEmail(email);
	}
	@SneakyThrows
	public void checkName(String name) {
		if(Pattern.matches(name,"\\d")) {
			throw new CustomException("Invalid Name");
		}
		student.setName(name);
	}
	
	public String checkStudentDetails(String name,int rollNumber,long phoneNumber,String email) {
		student.setPhoneNumber(phoneNumber);
		student.setRollNumber(rollNumber);
		checkName(name);
		checkEmail(email);
		return student.toString();
		
	}
	

}
