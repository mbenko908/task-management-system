package sk.exam.task_management_system;

import java.time.OffsetDateTime;

public class Task {

    private final long id;
    private final long userId;
    private final Long projectId;
    private final String name;
    private final String description;
    private final TaskStatus status;
    private final OffsetDateTime createAt;

    public Task(long id, long userId, Long projectId, String name, String description, TaskStatus status, OffsetDateTime createAt) {
        this.id = id;
        this.userId = userId;
        this.projectId = projectId;
        this.name = name;
        this.description = description;
        this.status = status;
        this.createAt = createAt;
    }
}
