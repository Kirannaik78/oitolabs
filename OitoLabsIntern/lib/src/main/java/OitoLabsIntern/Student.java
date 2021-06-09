package OitoLabsIntern;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.Getter;

@Getter(AccessLevel.PROTECTED)
@Setter(AccessLevel.PROTECTED)
@NoArgsConstructor(access =AccessLevel.PACKAGE)
@AllArgsConstructor
@EqualsAndHashCode(of = {"email"})
@ToString(exclude= {"phoneNumber"})
public class Student {
	private  String name;
	private  int rollNumber;
	private long phoneNumber;
	private  String email;
	
	protected void setEmail(String email) {
		this.email=email;
		
	}

}
