package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.entities.concretes.Employees;
import kodlamaio.hrms.entities.dtos.CvDto;

public interface EmployeesService {
	DataResult<CvDto> getResumeByEmployeeeId(int employeeId);
    DataResult<Employees> getById(int id);
}
