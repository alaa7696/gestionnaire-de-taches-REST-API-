package starter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import starter.data.TaskRepository;
import starter.model.Task;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> findAll(){
        List<Task> list=new ArrayList<>();
        for(Task task:taskRepository.findAll())
            list.add(task);
        return list;
    }
    public void save(Task task){
        taskRepository.save(task);
    }
}
