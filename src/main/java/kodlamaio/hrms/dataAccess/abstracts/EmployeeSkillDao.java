package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.EmployeeSkill;

public interface EmployeeSkillDao extends JpaRepository<EmployeeSkill, Integer>{
	List<EmployeeSkill> getAllByEmployeeId(int employeeId);
}
