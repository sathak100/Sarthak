package com.ARDE.MMD.IMMS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ARDE.MMD.IMMS.Dao.TaskDao;
import com.ARDE.MMD.IMMS.Entity.TaskEntity;

@Service
public class TaskService {

    @Autowired
    private TaskDao taskDao;

    // Get all tasks
    public List<TaskEntity> getAllTask() {
        return taskDao.findAll();
    }

    // Add single task
    public String saveTask(TaskEntity task) {
        taskDao.save(task); // Automatically does INSERT or UPDATE
        System.out.println("✅ Saved Task: " + task);
        return "Task saved successfully!";
    }

    // Save multiple tasks
    public String saveAllTask(List<TaskEntity> taskList) {
        taskDao.saveAll(taskList); // Automatically does INSERT or UPDATE
        System.out.println("✅ Saved Task List:");
        taskList.forEach(System.out::println);
        return "Tasks saved successfully!";
    }
}
