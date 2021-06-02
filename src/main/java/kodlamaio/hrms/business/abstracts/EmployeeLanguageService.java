package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.EmployeeLanguage;

public interface EmployeeLanguageService {
	    Result add(EmployeeLanguage employeeeLanguage);
	    DataResult<List<EmployeeLanguage>> getAll();
	    DataResult<List<EmployeeLanguage>> getAllByEmployeeId(int employeeId);
}
