package starter.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "t_task")
public class Task implements Serializable {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private int idt_task;
    private String name;
    private String description;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date_created;
    private boolean finished;

    public Task(){}
    public Task(String name, String description, Date date_created, boolean finished) {
        this.name = name;
        this.description = description;
        this.date_created = date_created;
        this.finished = finished;
    }

    public int getIdt_task() {
        return idt_task;
    }

    public void setIdt_task(int idt_task) {
        this.idt_task = idt_task;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    @Override
    public String toString() {
        return "Task{" +
                "idt_task=" + idt_task +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", date_created=" + date_created +
                ", finished=" + finished +
                '}';
    }
}
