package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.EmployeeImage;

public interface EmployeeImageDao extends JpaRepository<EmployeeImage, Integer>{
	 List<EmployeeImage> getAllByEmployeeId(int employeeId);
}
