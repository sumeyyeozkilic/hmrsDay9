package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.EmployeeEducation;

public interface EmployeeEducationDao extends JpaRepository<EmployeeEducation, Integer>{
	List<EmployeeEducation> getAllByEmployeeIdOrderByGraduationYear(int employeeId);
}
