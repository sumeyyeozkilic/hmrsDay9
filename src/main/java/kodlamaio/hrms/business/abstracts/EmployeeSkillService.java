package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.EmployeeSkill;

public interface EmployeeSkillService {
	Result add(EmployeeSkill employeeSkill);
    DataResult<List<EmployeeSkill>> getAll();
    DataResult<List<EmployeeSkill>> getAllByCandidateId(int employeeId);
}
