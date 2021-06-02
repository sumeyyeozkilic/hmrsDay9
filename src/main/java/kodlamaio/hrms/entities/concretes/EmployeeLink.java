package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name="employee_links")
public class EmployeeLink {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="link")
	private String link;
	
	@ManyToOne()
	@JsonIgnore()
	@JoinColumn(name="employee_id")
	private Employees employees;
	
	@ManyToOne()
	@JsonIgnore()
	@JoinColumn(name="link_id")
	private LinkType linkType;
}
