package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.hrms.business.abstracts.EmployeeLanguageService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccessDataResult;
import kodlamaio.hrms.core.utilities.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployeeLanguageDao;
import kodlamaio.hrms.entities.concretes.EmployeeLanguage;

public class EmployeeLanguageManager implements EmployeeLanguageService {
	
	private final EmployeeLanguageDao employeeLanguageDao;
	
	@Autowired
	public EmployeeLanguageManager(EmployeeLanguageDao employeeLanguageDao) {
		this.employeeLanguageDao=employeeLanguageDao;
	}

	@Override
	public Result add(EmployeeLanguage employeeeLanguage) {
		this.employeeLanguageDao.save(employeeeLanguage);
        return new SuccessResult();
	}

	@Override
	public DataResult<List<EmployeeLanguage>> getAll() {
		return new SuccessDataResult<>(this.employeeLanguageDao.findAll());
	}

	@Override
	public DataResult<List<EmployeeLanguage>> getAllByEmployeeId(int employeeId) {
		return new SuccessDataResult<>(this.employeeLanguageDao.getAllByEmployeeId(employeeId));
	}
	
}
