package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.hrms.business.abstracts.EmployeeEducationService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccessDataResult;
import kodlamaio.hrms.core.utilities.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployeeEducationDao;
import kodlamaio.hrms.entities.concretes.EmployeeEducation;

public class EmployeeEducationManager implements EmployeeEducationService{

	 private final EmployeeEducationDao employeeEducationDao;
	 
	@Autowired
	public EmployeeEducationManager(EmployeeEducationDao employeeEducationDao) {
		this.employeeEducationDao = employeeEducationDao;
	}

	@Override
	public Result add(EmployeeEducation employeeeEducation) {
		this.employeeEducationDao.save(employeeeEducation);
        return new SuccessResult();
	}

	@Override
	public DataResult<List<EmployeeEducation>> getAll() {
		return new SuccessDataResult<>(this.employeeEducationDao.findAll());
	}

	@Override
	public DataResult<List<EmployeeEducation>> getAllByEmployeeIdOrderByGraduationYear(int employeeId) {
		return new SuccessDataResult<>(this.employeeEducationDao.getAllByEmployeeIdOrderByGraduationYear(employeeId));
	}

}
