package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.EmployeeExperience;

public interface EmployeeExperienceService {
	Result add(EmployeeExperience employeeExperience);
    DataResult<List<EmployeeExperience>> getAll();
    DataResult<List<EmployeeExperience>> getAllByEmployeeIdOrderByLeaveDate(int employeeId);
}
