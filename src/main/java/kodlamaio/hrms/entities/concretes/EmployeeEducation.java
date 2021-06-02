package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employee_education")
public class EmployeeEducation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="school_name")
	@NotNull
	@NotBlank
	private String schoolName;
	
	@Column(name="department_name")
	@NotNull
	@NotBlank
	private String departmentName;
	
	@Column(name="start_year")
	@NotNull
	@NotBlank
	private int startYear;
	
	@Column(name="graduation_year")
	private int graduationYear;
	
	@ManyToOne()
	@JsonIgnore()
	@JoinColumn(name="employee_id")
	private Employees employees;
	
	
}
