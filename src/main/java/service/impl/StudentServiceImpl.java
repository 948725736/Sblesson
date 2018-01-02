package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.StuRepository;
import entity.Student;
@Service
public class StudentServiceImpl implements StuService {
	@Autowired
	StuRepository stuRepository;
	/* (non-Javadoc)
	 * @see service.impl.StuService#saveStudent()
	 */
	@Override
	public  void saveStudent() {
		Student student=new Student();
		student.setSname("ab");
		stuRepository.save(student);
	}
/* (non-Javadoc)
 * @see service.impl.StuService#deleteStudent()
 */
@Override
public  void deleteStudent() {
	
	stuRepository.delete(12);
	
	}
/* (non-Javadoc)
 * @see service.impl.StuService#updateStudent()
 */
@Override
public  void updateStudent() {
	Student student=new Student();
	student.setSname("ab");
	student.setSid(1);
	stuRepository.save(student);
}
/* (non-Javadoc)
 * @see service.impl.StuService#querysStudent()
 */
@Override
public  void querysStudent() {
	Student find=stuRepository.findOne(3);
}
}
