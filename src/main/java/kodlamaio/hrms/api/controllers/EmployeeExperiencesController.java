package kodlamaio.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import kodlamaio.hrms.business.abstracts.EmployeeExperienceService;
import kodlamaio.hrms.entities.concretes.EmployeeExperience;

public class EmployeeExperiencesController {
	 private EmployeeExperienceService employeeExperienceService;

	    @Autowired
	    public EmployeeExperiencesController(EmployeeExperienceService candidateExperienceService) {
	        this.employeeExperienceService = candidateExperienceService;
	    }

	    @PostMapping("/add")
	    public ResponseEntity<?> add(@RequestBody @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) EmployeeExperience employeeExperience){
	        return ResponseEntity.ok(this.employeeExperienceService.add(employeeExperience));
	    }


	    @GetMapping("/getall")
	    public ResponseEntity<?> getAll(){
	        return ResponseEntity.ok(this.employeeExperienceService.getAll());
	    }

	    @GetMapping("/getallbycandidateidorderbyleavedate")
	    public ResponseEntity<?> getAllOrderByLeaveDate(@RequestParam int employeeId){
	        return ResponseEntity.ok(this.employeeExperienceService.getAllByEmployeeIdOrderByLeaveDate(employeeId));
	    }
}
