package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.EmployeeExperience;

public interface EmployeeExperienceDao extends JpaRepository<EmployeeExperience, Integer>{
	 List<EmployeeExperience> getAllByEmployeeIdOrderByLeaveDateDesc(int employeeId);
}
