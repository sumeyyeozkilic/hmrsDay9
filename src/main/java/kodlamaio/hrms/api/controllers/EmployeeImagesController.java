package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.EmployeeImageService;
import kodlamaio.hrms.entities.concretes.EmployeeImage;
import kodlamaio.hrms.entities.concretes.Employees;

public class EmployeeImagesController {
	@RestController
	@RequestMapping("/api/employeeimages")
	public class CandidateImagesController {

	    private final EmployeeImageService employeeImageService;

	    @Autowired
	    public CandidateImagesController(EmployeeImageService employeeImageService) {
	        this.employeeImageService = employeeImageService;
	    }

	    @PostMapping(value = "/add")
	    public ResponseEntity<?> add(@RequestBody MultipartFile file,@RequestParam int employeeId) {
	        EmployeeImage employeeImage = new EmployeeImage();
	        Employees employees = new Employees();
	        employees.setId(employeeId);
	        employeeImage.setEmployees(employees);
	        return ResponseEntity.ok(this.employeeImageService.add(employeeImage,file));
	    }


	    @GetMapping("/getall")
	    public ResponseEntity<?> getAll(){
	        return ResponseEntity.ok(this.employeeImageService.getAll());
	    }
	}
}
