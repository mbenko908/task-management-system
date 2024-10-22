package sk.exam.task_management_system;

public enum TaskStatus {

    NEW,
    DONE;

    public static TaskStatus fromString(String status){
        return switch (status){
            case "NEW" -> NEW;
            case "DONE" -> DONE;
            default -> throw new IllegalArgumentException("Unknown task status: " + status);
        };
    }

}
