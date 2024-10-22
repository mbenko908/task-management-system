package sk.exam.task_management_system;

public class User {

    private final long id;
    private final String name;
    private final String email;


    public User(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }


    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }
}
