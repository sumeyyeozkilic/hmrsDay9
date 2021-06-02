package kodlamaio.hrms.business.concretes;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.EmployeeImageService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccessDataResult;
import kodlamaio.hrms.core.utilities.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployeeImageDao;
import kodlamaio.hrms.entities.concretes.EmployeeImage;

public class EmployeeImageManager implements EmployeeImageService{
	 private final EmployeeImageDao employeeImageDao;
	 private final EmployeeImageService employeeImageService;
	
	 @Autowired
	 public EmployeeImageManager(EmployeeImageDao employeeImageDao, EmployeeImageService employeeImageService) {
		this.employeeImageDao = employeeImageDao;
		this.employeeImageService = employeeImageService;
	}

	@Override
	public Result add(EmployeeImage employeeImage) {
		this.employeeImageDao.save(employeeImage);
        return new SuccessResult();
	}

	@Override
	public Result add(EmployeeImage employeeImage, MultipartFile file) {
		Map<String, String> result = (Map<String, String>) employeeImageService.save(file).getData();
        String url = result.get("url");
        employeeImage.setUrl(url);
        employeeImage.setUploadDate(LocalDate.now());
        return add(employeeImage);
	}

	@Override
	public DataResult<List<EmployeeImage>> getAll() {
		return new SuccessDataResult<>(this.employeeImageDao.findAll());
	}

	@Override
	public DataResult<List<EmployeeImage>> getAllByCandidateId(int employeeId) {
		return new SuccessDataResult<>(this.employeeImageDao.getAllByEmployeeId(employeeId));
	}
}
