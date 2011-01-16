package com.scunt.app;


import java.util.*;

public class User {
		
		private UUID taskID;
		private String name;
		private String description;
		private int difficulty;
		
		//private UserSubmittedPictureIDs pictures;
		
		private boolean completed;
		
		Task(String Name, String Description, int Difficulty)
		{
			taskID = UUID.randomUUID();
			String name = Name;
			String description = Description;
			if(!(Difficulty>1000 && Difficulty<1004))
				return;
			difficulty = Difficulty;
			completed = false;
		}
		
		public int ChangeName(String Name)
		{
			name = Name;
			return 1;
		}
		
		public int ChangeDescription(String Description)
		{
			description = Description;
			return 1;
		}
		
		public int ChangeDifficulty(int Difficulty)
		{
			if(!(Difficulty>1000 && Difficulty<1004))
				return -1;
			difficulty = Difficulty;
			return 1;
		}
		
		public int ChangeCompleted(boolean Completed)
		{
			completed = Completed;
			return 1;
		}
		
		

	}
