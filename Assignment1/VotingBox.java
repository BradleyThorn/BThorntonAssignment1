import stanford.karel.*;

public class VotingBox extends SuperKarel {

	public void run() {
		//keeps going until hitting the end wall
		while (frontIsClear()) 
		{
			move();
			//checks to see if a beeper has been "punched out". If it has, removes any adjacent beepers
			if(noBeepersPresent())
			{
				removeChad();			
			}
			move();
		}
				
	}
	public void turnRight()
	{
		turnLeft();
		turnLeft();
		turnLeft();
	}
	//makes karel about face
	public void turnAround() //brighhht eyeeessssss
	{
		turnLeft();
		turnLeft();
	}
	//runs through a voting box if a beeper is not in the center, removing beepers from the top and bottom if present
	public void removeChad()
	{
		turnLeft();
		move();
		while(beepersPresent())
		{
			pickBeeper();
		}
		turnAround();
		move();
		move();
		while(beepersPresent())
		{
			pickBeeper();
		}
		turnAround();
		move();
		turnRight();
	}
	
		
}
