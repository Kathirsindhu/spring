package StudentException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class StudentExceptionHandler {
	@ExceptionHandler(StudentException.class)
	public ResponseEntity<Object> rr(StudentException s) {
		return new ResponseEntity<Object>(s.getMessage(), HttpStatus.NOT_FOUND);
	}

}
