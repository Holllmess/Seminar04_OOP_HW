import java.util.ArrayList;
import java.util.List;

public class Tasker {
    private String taskName;
    private Priority priority;
    private String deadline;
    private String personName;


    public Tasker(String taskName, Priority priority, String deadline, String personName) {
        this.taskName = taskName;
        this.priority = priority;
        this.deadline = deadline;
        this.personName = personName;
    }

    public String getTaskName() {
        return taskName;
    }

    public Priority getPriority() {
        return priority;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getPersonName() {
        return personName;
    }

    @Override
    public String toString() {
        return "Tasker{" +
                "taskName='" + taskName + '\'' +
                ", priority=" + priority +
                ", deadline='" + deadline + '\'' +
                ", personName='" + personName + '\'' +
                '}';
    }
}
