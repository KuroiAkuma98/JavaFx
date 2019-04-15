package sample;

import java.time.LocalDate;

public class Task
{
    private String taskName;
    private LocalDate expDate;
    private Priority priority;
    private String description;
    Task(String Name,LocalDate Date,Priority priority,String description)
    {
        this.taskName = Name;
        this.expDate = Date;
        this.priority = priority;
        this.description = description;
    }

    public void setTaskName(String name)
    {
        this.taskName = name;
    }
    public void setExpDate(LocalDate date)
    {
        this.expDate = date;
    }
    public void setPriority(Priority priority)
    {
        this.priority = priority;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getTaskName()
    {
        return taskName;
    }
    public LocalDate getExpDate()
    {
        return expDate;
    }
    public Priority getPriority()
    {
        return priority;
    }
    public String getDescription()
    {
        return description;
    }

    public String toString()
    {
        return taskName + "_" + expDate;
    }

    public String getTaskDescription()
    {
        String desc = "Title: " + taskName + "\n" + "Exp. date: " + expDate + "\n" + "Priority: " + priority + "\n" + "Description: " + description;
        return desc;
    }

}
