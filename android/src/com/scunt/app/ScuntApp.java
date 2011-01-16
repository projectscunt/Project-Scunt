package com.scunt.app;

import java.util.ArrayList;

import com.scunt.app.LazyAdapter;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

public class ScuntApp extends Activity {

    ListView list;
    LazyAdapter adapter;
    private static final String TAG = "AamirDebugging";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
        
    // Called when the "Tasks" button is clicked on the front page
    public void tasksClicked(View view) {	
        setContentView(R.layout.tasks);
        
    	// Code goes here        
        Log.v(TAG, "You clicked on the Tasks button");
        list=(ListView)findViewById(R.id.list);
        adapter=new LazyAdapter(this, mStrings);
        list.setAdapter(adapter);        
    }
    
    // private ArrayList<String, String> mStrings = new ArrayList<String, String>(); 
    private String[] mStrings={
            "http://a3.twimg.com/profile_images/670625317/aam-logo-v3-twitter.png",
            "http://a3.twimg.com/profile_images/740897825/AndroidCast-350_normal.png",
            "http://a3.twimg.com/profile_images/121630227/Droid_normal.jpg",
            "http://a1.twimg.com/profile_images/957149154/twitterhalf_normal.jpg",
            "http://a1.twimg.com/profile_images/97470808/icon_normal.png",
            "http://a3.twimg.com/profile_images/511790713/AG.png",
            "http://a3.twimg.com/profile_images/956404323/androinica-avatar_normal.png",
            "http://a1.twimg.com/profile_images/909231146/Android_Biz_Man_normal.png",
            "http://a3.twimg.com/profile_images/72774055/AndroidHomme-LOGO_normal.jpg",
            "http://a1.twimg.com/profile_images/349012784/android_logo_small_normal.jpg",
            "http://a1.twimg.com/profile_images/841338368/ea-twitter-icon.png",
            "http://a3.twimg.com/profile_images/77641093/AndroidPlanet_normal.png"
    };
}