package com.scunt.app;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ScuntApp extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
        
    // Called when the "Tasks" button is clicked on the front page
    public void tasksClicked(View view) {
    	final ListView listView;
    	String tasksLists[]={"Roof a building", "Picture with a goose", "Go swimming", "Play dodgeball", "Find oldest book", "Hug an older person", "Pump 11 cent gas", "Get a pic inside university club"};

    	setContentView(R.layout.tasks);
    	listView=(ListView)findViewById(R.id.ListView01);
    	listView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_multiple_choice, tasksLists));
    	listView.setChoiceMode(ListView.CHOICE_MODE_NONE);
    	listView.setTextFilterEnabled(true);
    	listView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> a, View v, int position, long id) {
				AlertDialog.Builder adb=new AlertDialog.Builder(ScuntApp.this);
				adb.setTitle("Task Status");
				adb.setMessage("You haven't done this task yet, get working!");
				adb.setPositiveButton("Ok", null);
				adb.show();
			}
		});
    	
    }
}