package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.EmployeeEducation;

public interface EmployeeEducationService {
	Result add(EmployeeEducation employeeeEducation);
    DataResult<List<EmployeeEducation>> getAll();
    DataResult<List<EmployeeEducation>> getAllByEmployeeIdOrderByGraduationYear(int employeeId);
}
