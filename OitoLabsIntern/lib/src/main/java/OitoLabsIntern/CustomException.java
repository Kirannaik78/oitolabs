package OitoLabsIntern;
import lombok.ToString;

import lombok.AllArgsConstructor;


@SuppressWarnings("serial")
@AllArgsConstructor
@ToString
public class CustomException extends Exception{
	private String message ;
	
}
