package kodlamaio.hrms.entities.dtos;

import java.util.List;

import kodlamaio.hrms.entities.concretes.EmployeeEducation;
import kodlamaio.hrms.entities.concretes.EmployeeExperience;
import kodlamaio.hrms.entities.concretes.EmployeeImage;
import kodlamaio.hrms.entities.concretes.EmployeeLanguage;
import kodlamaio.hrms.entities.concretes.EmployeeLink;
import kodlamaio.hrms.entities.concretes.EmployeeSkill;
import kodlamaio.hrms.entities.concretes.Employees;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CvDto {
	private Employees employees;
	private List<EmployeeEducation> employeeEducations;
	private List<EmployeeExperience> employeeExperiences;
	private List<EmployeeLanguage> employeeLanguages;
	private List<EmployeeSkill> employeeSkills;
	private List<EmployeeImage> employeeImages;
	private List<EmployeeLink> employeeLinks;
}
