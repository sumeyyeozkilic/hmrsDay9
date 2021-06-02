package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.hrms.business.abstracts.EmployeeLinkService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccessDataResult;
import kodlamaio.hrms.core.utilities.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployeeLinkDao;
import kodlamaio.hrms.entities.concretes.EmployeeLink;

public class EmployeeLinkManager implements EmployeeLinkService{

	private final EmployeeLinkDao employeeLinkDao;
	
	@Autowired
	public EmployeeLinkManager(EmployeeLinkDao employeeLinkDao) {
		this.employeeLinkDao = employeeLinkDao;
	}

	@Override
	public Result add(EmployeeLink employeeLink) {
		this.employeeLinkDao.save(employeeLink);
        return new SuccessResult();
	}

	@Override
	public DataResult<List<EmployeeLink>> getAll() {
		return new SuccessDataResult<>(this.employeeLinkDao.findAll());
	}

	@Override
	public DataResult<List<EmployeeLink>> getAllByEmployeeId(int employeeeId) {
		return new SuccessDataResult<>(this.employeeLinkDao.getAllByEmployeeId(employeeeId));
	}

}
