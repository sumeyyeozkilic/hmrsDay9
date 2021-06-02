package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import kodlamaio.hrms.business.abstracts.EmployeeLanguageService;

public class EmployeeLanguagesController {
	private final EmployeeLanguageService employeeLanguageService;

	@Autowired
	public EmployeeLanguagesController(EmployeeLanguageService employeeLanguageService) {
		this.employeeLanguageService = employeeLanguageService;
		


	    @GetMapping("/getall")
	    public ResponseEntity<?> getAll(){
	        return ResponseEntity.ok(this.employeeLanguageService.getAll());
	    }
	}
}
