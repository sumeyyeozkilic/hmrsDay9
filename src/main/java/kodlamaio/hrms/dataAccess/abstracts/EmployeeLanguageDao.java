package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.EmployeeLanguage;

public interface EmployeeLanguageDao extends JpaRepository<EmployeeLanguage, Integer>{
	List<EmployeeLanguage> getAllByEmployeeId(int employeeId);
}
