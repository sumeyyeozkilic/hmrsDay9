package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.EmployeeLink;

public interface EmployeeLinkService {
	Result add(EmployeeLink employeeLink);
    DataResult<List<EmployeeLink>> getAll();
    DataResult<List<EmployeeLink>> getAllByEmployeeId(int employeeeId);
}
