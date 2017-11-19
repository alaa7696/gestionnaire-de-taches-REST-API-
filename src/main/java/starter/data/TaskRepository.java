package starter.data;

import org.springframework.data.repository.CrudRepository;
import starter.model.Task;

public interface TaskRepository extends CrudRepository<Task,Integer> {
}
