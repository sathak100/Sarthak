package com.ARDE.MMD.IMMS.Entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "IMMS_TASK")
@Data
public class TaskEntity {

	@Id
	@Column(name = "TASK_ID")
	public Integer taskId;
	
	@Column(name = "TITLE")
	public String title;
	
	@Column(name = "DESCRIPTION")
	public String description;
	
	@Column(name = "CREATE_BY")
	public String createBy;
	
	@Column(name = "START_DATE")
	public LocalDate startDate;
	
	@Column(name = "END_DATE")
	public LocalDate endDate;
}
