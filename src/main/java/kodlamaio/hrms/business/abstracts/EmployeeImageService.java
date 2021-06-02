package kodlamaio.hrms.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.EmployeeImage;

public interface EmployeeImageService {
	Result add(EmployeeImage employeeImage);
    Result add(EmployeeImage employeeImage, MultipartFile file);
    DataResult<List<EmployeeImage>> getAll();
    DataResult<List<EmployeeImage>> getAllByCandidateId(int employeeId);
}
