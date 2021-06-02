package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployeeLinkService;
import kodlamaio.hrms.entities.concretes.EmployeeLink;

@RestController
@RequestMapping("/api/employeelinks")
public class EmployeeLinksController {
	private final EmployeeLinkService employeeLinkService;

	@Autowired
	public EmployeeLinksController(EmployeeLinkService employeeLinkService) {
		this.employeeLinkService = employeeLinkService;
	}
	
	 @PostMapping("/add")
	    public ResponseEntity<?> add(@RequestBody EmployeeLink employeeLink){
	        return ResponseEntity.ok(this.employeeLinkService.add(employeeLink));
	    }


	    @GetMapping("/getall")
	    public ResponseEntity<?> getAll(){
	        return ResponseEntity.ok(this.employeeLinkService.getAll());
	    }
}
