package com.ARDE.MMD.IMMS.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ARDE.MMD.IMMS.Entity.TaskEntity;

import jakarta.transaction.Transactional;

@Repository
public interface TaskDao extends JpaRepository<TaskEntity, Integer> {

	@Modifying
	@Transactional

	// Query 1
	@Query(value = "INSERT INTO IMMS_TASK(TASK_ID , TITLE , DESCRIPTION , CREATE_BY , START_DATE , END_DATE)"
			+ " VALUES(:taskId , :title , :description , :createBy , :startDate , :endDate)", nativeQuery = true)
	void saveTask1(Integer taskId, String title, String description, String createBy, String startDate, String endDate);

	// Query 2

	@Query(value = "INSERT INTO IMMS_TASK(TASK_ID , TITLE , DESCRIPTION , CREATE_BY , START_DATE , END_DATE)"
			+ " VALUES(:taskId , :title , :description , :createBy , :startDate , :endDate)", nativeQuery = true)
	void savetask2(Integer taskId, String title, String description, String createBy, String startDate, String endDate);

	// Query 3

	@Modifying
	@Transactional
	@Query(value = "INSERT INTO IMMS_TASK(TASK_ID, TITLE, DESCRIPTION, CREATE_BY, START_DATE, END_DATE) "
			+ "VALUES(:taskId, :title, :description, :createBy, :startDate, :endDate)", nativeQuery = true)
	void savetask3(Integer taskId, String title, String description, String createBy, String startDate, String endDate);

}
