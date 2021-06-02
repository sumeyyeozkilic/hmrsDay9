package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.EmployeeLink;

public interface EmployeeLinkDao extends JpaRepository<EmployeeLink, Integer>{
	List<EmployeeLink> getAllByEmployeeId(int employeeId);
}
