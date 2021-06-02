package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employee_image")
public class EmployeeImage {
	
	@Id
	@Column(name="id")
	private int id;
	
	@ManyToOne()
	@JsonIgnore()
	@JoinColumn(name="employee_id")
	private Employees employee;
	
	@Column(name="upload_date")
	private LocalDate uploadDate;
	
	@Column(name="url")
	private String url;
}
