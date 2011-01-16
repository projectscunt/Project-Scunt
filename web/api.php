<?php
	// api.php
	$action = $_GET["action"];
	
	// handle action
	if ($action == "getTasks") {
		echo json_encode (getTasks());
	} else {
		echo "Invalid action";
	}
	exit;
	
	function getTasks () {
		$tasks = array ();
		
		// populate
		$tasks [0]["id"] = 0;
		$tasks [0]["name"] = "Knock, Knock";
		$tasks [0]["desc"] = "Dressed up in costume, Trick or Treat at a random house and actually receive edible items.";
		
		$tasks [1]["id"] = 1;
		$tasks [1]["name"] = "Exact Change";
		$tasks [1]["desc"] = "Obtain a receipt for exactly $0.11 of gas. At lease one team member must be in photo.";
		
		$tasks [2]["id"] = 2;
		$tasks [2]["name"] = "Awkward!";
		$tasks [2]["desc"] = "Take a photo with your team and at least 2 ex-significant others.";
		
		$tasks [3]["id"] = 3;
		$tasks [3]["name"] = "Egypt Here We Come";
		$tasks [3]["desc"] = "Construct the largest human pyramid you possibly can. Must be at least 3 levels.";
		
		$tasks [4]["id"] = 4;
		$tasks [4]["name"] = "Nice Stick";
		$tasks [4]["desc"] = "Arrange the most provocative photo with a hockey stick or golf club.";
		
		$tasks [5]["id"] = 5;
		$tasks [5]["name"] = "Hang Em' High";
		$tasks [5]["desc"] = "Take a photo with all team members high-fiving complete strangers simultaneously.";
		
		$tasks [6]["id"] = 6;
		$tasks [6]["name"] = "Stomach Problems";
		$tasks [6]["desc"] = "Purchase and consume a greasy burger. Point goes to highest calorie sandwich.";
		
		$tasks [7]["id"] = 7;
		$tasks [7]["name"] = "Sleepy Time";
		$tasks [7]["desc"] = "Take a photo with 8 or more people lying down simultaneously. At least one team member must be in photo.";
		
		$tasks [8]["id"] = 8;
		$tasks [8]["name"] = "Woof Woof";
		$tasks [8]["desc"] = "Find a dog. Have each member place one or more hands on dog. Photograph.";
	
		return $tasks;
	}
?>