package com.todo.domain;

public class TodoItem {
    private int id;
    private String task;
    private Boolean isDone;


    public int getId() {
        return id;
    }

    public Boolean getIsDone() {
        return isDone;
    }

    public String getTask() {
        return task;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIsDone(Boolean isDone) {
        this.isDone = isDone;
    }

    public void setTask(String task) {
        this.task = task;
    }
    

    
}
