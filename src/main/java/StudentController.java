import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import service.impl.StuService;

@RestController
@SpringBootApplication
public class StudentController {
	@Autowired
StuService service;
@RequestMapping("/saveStu")
public String saveStudent(){
	service.saveStudent();
	return "1";
	
}
@RequestMapping("/deleteStu")
public String DeleteStudent(){
	service.deleteStudent();
	return "2";
	
}
@RequestMapping("/updateStu")
public String UpdateStudent(){
	service.updateStudent();
	return "4";
	
}
@RequestMapping("/queryStu")
public String QueryStudent(){
	service.querysStudent();
	return "3";
	
	}
}
