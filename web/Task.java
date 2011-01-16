package com.scunt.app;

import java.util.*;


protected class Task {
	
	private UUID taskID;
	private String name;
	private String description;
	private int difficulty;
	
	//private UserSubmittedPictureIDs pictures;
	
	private boolean completed;
	
	Task(String Name, String Description, int Difficulty)
	{
		setTaskID(UUID.randomUUID());
		setName(Name);
		setDescription(Description);
		if(!(Difficulty>1000 && Difficulty<1004))
			return;
		setDifficulty(Difficulty);
		setCompleted(false);
	}
	
	public void setTaskID(UUID taskID) {
		this.taskID = taskID;
	}

	public UUID getTaskID() {
		return taskID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDifficulty(int difficulty) {
		if(!(difficulty>1000 && difficulty<1004))
			return;
		this.difficulty = difficulty;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public boolean isCompleted() {
		return completed;
	}
	
}

public class TaskList extends Task
{
	TaskList next;
	TaskList previous;
	Task current;
	
	TaskList(String Name, String Description, int Difficulty)
	{
		current = super(Name, Description, Difficulty);
		next = null;
		previous = null;
	}
	
	public void AddNewtask(String Name, String Description, int Difficulty)
	{
		TaskList traverse = this;
		while(traverse.next != null)
		{
			traverse = traverse.next;
		}
		TaskList newTask = new TaskList(Name, Description, Difficulty);
		traverse.next = newTask;
		newTask.previous = traverse;
	}
	
	public void DeleteTask(string Name)
	{
		TaskList traverse = this;
		if(traverse.current.getName() == Name)
		{
			traverse = traverse.next;
		}
	}
}