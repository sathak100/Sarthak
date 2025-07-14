package com.ARDE.MMD.IMMS.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ARDE.MMD.IMMS.Entity.TaskEntity;
import com.ARDE.MMD.IMMS.Service.TaskService;
//import com.ARDE.MMD.IMMS.Utility.StringResponse;

@RestController
@RequestMapping("/all")
public class TaskController {

	@Autowired
	private TaskService taskService;

	@GetMapping("/task")
	public List<TaskEntity> getAllTask() {
		return taskService.getAllTask();
	}
//
//	@PostMapping("/Task1")
//	public StringResponse saveTask1(
//			@RequestParam Integer taskId, 
//			@RequestParam String title,
//			@RequestParam String description, 
//			@RequestParam String createBy, 
//			@RequestParam String startDate,
//			@RequestParam String endDate) {
//		return taskService.saveTask1(taskId, title, description, createBy, startDate, endDate);
//	}

//	@PostMapping("/Task2")
//    public StringResponse savetask2(@RequestParam Integer taskId,
//                                   @RequestParam String title,
//                                   @RequestParam String description,
//                                   @RequestParam String createBy,
//                                   @RequestParam String startDate,
//                                   @RequestParam String endDate) {
//        return taskService.savetask2(taskId, title, description, createBy, startDate, endDate);
//    }
//	
//	@PostMapping("/Task3")
//	public StringResponse savetask3(@RequestParam Integer taskId,
//                                   @RequestParam String title,
//                                   @RequestParam String description,
//                                   @RequestParam String createBy,
//                                   @RequestParam String startDate,
//                                   @RequestParam String endDate) {
//		return taskService.savetask3(taskId, title, description, createBy, startDate, endDate);
//	}
	
	 @PostMapping("/add")
	    public String saveTask(@RequestBody TaskEntity task) {
	        return taskService.saveTask(task);
	    }
	 
	 @PostMapping("/add/multipleTask")
	    public String saveAllTask(@RequestBody List<TaskEntity> task) {
	        return taskService.saveAllTask(task);
	    }

}
