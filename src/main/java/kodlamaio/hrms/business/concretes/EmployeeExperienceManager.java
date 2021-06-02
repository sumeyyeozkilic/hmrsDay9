package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.hrms.business.abstracts.EmployeeExperienceService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccessDataResult;
import kodlamaio.hrms.core.utilities.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployeeExperienceDao;
import kodlamaio.hrms.entities.concretes.EmployeeExperience;

public class EmployeeExperienceManager implements EmployeeExperienceService{

	 private final EmployeeExperienceDao employeeExperienceDao;
	
	@Autowired 
	public EmployeeExperienceManager(EmployeeExperienceDao employeeExperienceDao) {
		this.employeeExperienceDao = employeeExperienceDao;
	}

	@Override
	public Result add(EmployeeExperience employeeExperience) {
		 this.employeeExperienceDao.save(employeeExperience);
	        return new SuccessResult();
	}

	@Override
	public DataResult<List<EmployeeExperience>> getAll() {
		return new SuccessDataResult<>(this.employeeExperienceDao.findAll());
	}

	@Override
	public DataResult<List<EmployeeExperience>> getAllByEmployeeIdOrderByLeaveDate(int employeeId) {
		return new SuccessDataResult<>(this.employeeExperienceDao.getAllByEmployeeIdOrderByLeaveDateDesc(employeeId));
	}

}
