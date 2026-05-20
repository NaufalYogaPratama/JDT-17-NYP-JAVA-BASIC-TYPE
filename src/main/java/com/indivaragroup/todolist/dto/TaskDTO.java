package com.indivaragroup.todolist.dto;

public class TaskDTO {
    // Properti fundamental (private agar ter-encapsulate)
    private String taskId;
    private String title;
    private String assignee;
    private String status; // Open, In Progress, Ready Review, Done, Cancelled
    private int estimatedHour;
    private int actualHour;
    private double weight;

    // Constructor untuk kemudahan pengisian data
    public TaskDTO(String taskId, String title, String assignee, String status,
                   int estimatedHour, int actualHour, double weight) {
        this.taskId = taskId;
        this.title = title;
        this.assignee = assignee;
        this.status = status;
        this.estimatedHour = estimatedHour;
        this.actualHour = actualHour;
        this.weight = weight;
    }

    // Getter dan Setter
    public String getTaskId() { return taskId; }
    public void setTaskId(String taskId) { this.taskId = taskId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAssignee() { return assignee; }
    public void setAssignee(String assignee) { this.assignee = assignee; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public int getEstimatedHour() { return estimatedHour; }
    public void setEstimatedHour(int estimatedHour) { this.estimatedHour = estimatedHour; }

    public int getActualHour() { return actualHour; }
    public void setActualHour(int actualHour) { this.actualHour = actualHour; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }
}
