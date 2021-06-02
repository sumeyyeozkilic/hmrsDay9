package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.hrms.business.abstracts.EmployeeSkillService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccessDataResult;
import kodlamaio.hrms.core.utilities.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployeeSkillDao;
import kodlamaio.hrms.entities.concretes.EmployeeSkill;

public class EmployeeSkillManager implements EmployeeSkillService{

	private final EmployeeSkillDao employeeSkillDao;
	
	@Autowired
	public EmployeeSkillManager(EmployeeSkillDao employeeSkillDao) {
		this.employeeSkillDao = employeeSkillDao;
	}

	@Override
	public Result add(EmployeeSkill employeeSkill) {
		this.employeeSkillDao.save(employeeSkill);
        return new SuccessResult();
	}

	@Override
	public DataResult<List<EmployeeSkill>> getAll() {
		return new SuccessDataResult<>(this.employeeSkillDao.findAll());
	}

	@Override
	public DataResult<List<EmployeeSkill>> getAllByCandidateId(int employeeId) {
		return new SuccessDataResult<>(this.employeeSkillDao.getAllByEmployeeId(employeeId));
	}

}
