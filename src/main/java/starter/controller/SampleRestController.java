package starter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import starter.model.Task;
import starter.service.TaskService;

import java.util.Date;

@RestController
public class SampleRestController {

    @Autowired
    private TaskService taskService;
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String get(){
        return "hello!!";
    }

    @GetMapping("/all")
    public String allTasks(){
        return taskService.findAll().toString();
    }

    @RequestMapping(value = ("/addTask"),method = RequestMethod.POST)
    public void add(){
        taskService.save(new Task("task4","desc4",new Date(),true));
    }
}
