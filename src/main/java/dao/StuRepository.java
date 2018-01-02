package dao;

import org.springframework.data.repository.CrudRepository;

import entity.Student;

public interface StuRepository extends CrudRepository<Student, Integer>{

}
