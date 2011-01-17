package com.scunt.app;

import com.scunt.app.LazyAdapter;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class ScuntApp extends Activity {

    ListView list;
    LazyAdapter adapter;

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
    
    private static String[][] MissonInformationPair = { {"Knock, Knock", "Exact Change", "Awkward!", "Egypt Here We Come",
    	"Nice Stick", "Hang Em' High", "Stomach Problems", "Sleepy Time", "Woof Woof", "Tight Squeeze", "You've Got Balls",
    	"5 Pillars of Pylon", "Oldest Book", "Now That's a Rock", "Human Tic-Tac-Toe", "Small World", "Cheapest Convenience",
    	"Dance Monkeys!", "McSmile", "Yarrr Pirates", "Yellow Fever", "Rickroll in real life", "Employed?", "Write This Down",
    	"What a Year", "How Friendly","Out of State"},
    	{"Dressed up in costume, Trick or Treat at a random house and actually receive edible items.",
    		"Obtain a receipt for exactly $0.11 of gas. At lease one team member must be in photo.",
    		"Take a photo with your team and at least 2 ex-significant others.",
    		"Construct the largest human pyramid you possibly can. Must be at least 3 levels.",
    		"Arrange the most provocative photo with a hockey stick or golf club.",
    		"Take a photo with all team members high-fiving complete strangers simultaneously.",
    		"Purchase and consume a greasy burger. Point goes to highest calorie sandwich.",
    		"Take a photo with 8 or more people lying down simultaneously. At least one team member must be in photo.",
    		"Find a dog. Have each member place one or more hands on dog. Photograph.",
    		"Locate a shopping cart. Fit the entire team less one member inside. All limbs must be contained. Photograph.",
    		"Find the largest variety of sports balls possible. Photograph them all in one picture.",
    		"They're markers, they're party hats - they're pylons! Find 5 and photo.",
    		"Books have been how humanity has recorded its existence for all of time. Find one of the first.",
    		"Its a rockin' world - find the biggest rock. Must bring rock back to final rendevouz.",
    		"Battle of minds. Battle of strategy. Play Tic-tak-toe in real life, with real people.",
    		"Ideas and news comes from around the world. Find the most foreign newspaper.",
    		"Being a student is about saving cash. Find the cheapest thing in your local convenience store.",
    		"Get at least 7 people to celebrate life and dance in a public space!",
    		"Go to McDonald's. Photograph at least 3 employees giving a free smile.",
    		"Construct and wear a pirate hat made of newspaper.",
    		"Collect the most number of fast-food mustard packets as possible. Keep the evidence.",
    		"Knock on someones door and sing \"never gonna give you up\" caroling style",
    		"Photo of a team member working at a service job they're not actually employed at.",
    		"Obtain a free promotional pen, with the company's name on it. Must be obtained during competition.",
    		"Obtain a coin of any denomination from 1999", "Photo a team member pumping a complete stranger's gas.",
    		"Snap a picture of the most far-away license plate you can find. Team member must be in photo."}
    	}

    public string[] GetRandomMissionInformation()
    {
    	int randomNumber = (int)Math.random()*26;
    	return new String{MissionInformationPair[0][randomNumber], MissionInformationPair[0][randomNumber]};
    }