package sk.exam.task_management_system;

public class Project {

    private final long id;
    private final long user_id;
    private final String name;
    private final String description;

    public Project(long id, long user_id, String name, String description) {
        this.id = id;
        this.user_id = user_id;
        this.name = name;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public long getUser_id() {
        return user_id;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}
