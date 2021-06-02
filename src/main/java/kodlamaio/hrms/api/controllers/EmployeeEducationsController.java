package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployeeEducationService;
import kodlamaio.hrms.entities.concretes.EmployeeEducation;

@RestController
@RequestMapping("/api/employeeeducations")
public class EmployeeEducationsController {
	private final EmployeeEducationService employeeEducationService;

	@Autowired
	public EmployeeEducationsController(EmployeeEducationService employeeEducationService) {
		this.employeeEducationService = employeeEducationService;
	}
	
	@PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody EmployeeEducation employeeEducation){
        return ResponseEntity.ok(this.employeeEducationService.add(employeeEducation));
    }


    @GetMapping("/getall")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(this.employeeEducationService.getAll());
    }

    @GetMapping("/getallbycandidateidorderbygraduationyear")
    public ResponseEntity<?> getAllByCandidateIdOrderByGraduationYear(@RequestParam int employeeId){
        return ResponseEntity.ok(this.employeeEducationService.getAllByEmployeeIdOrderByGraduationYear(employeeId));
    }
	
	
}
