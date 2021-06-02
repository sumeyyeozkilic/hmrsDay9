package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployeeSkillService;
import kodlamaio.hrms.entities.concretes.EmployeeSkill;

@RestController
@RequestMapping("/api/employeeskills")
public class EmployeeSkillsController {
	private EmployeeSkillService employeeSkillService;
    
	@Autowired
	public EmployeeSkillsController(EmployeeSkillService employeeSkillService) {
		this.employeeSkillService = employeeSkillService;
	}
	
	@PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody EmployeeSkill employeeSkill){
        return ResponseEntity.ok(this.employeeSkillService.add(employeeSkill));
    }


    @GetMapping("/getall")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(this.employeeSkillService.getAll());
    }
	
}
