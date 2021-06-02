package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employee_experience")
public class EmployeeExperience {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="company_name")
    @NotNull
    @NotBlank
    private String companyName;
	
	@Column(name="position")
    @NotNull
    @NotBlank
    private String position;
	
	@Column(name="date_of_start")
    @NotNull
    @NotBlank
    private LocalDate dateOfStart;
	
	@Column(name="date_of_leave")
    private LocalDate dateOfLeave;
	
	@ManyToOne()
	@JsonIgnore()
	@JoinColumn(name="employee_id")
    private Employees employees;
	
}
