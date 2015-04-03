/**
 * @(#)CarTest.java
 *
 *
 * @Derick Warshaw // Lab 9 // COSC1337
 * @version 1.00 2014/4/3
 */

/**This class creates a program that will test all public methods, accessors,and
 *mutators that reside in the Car Class. It also tests data validation
 *for proper speed. */
public class CarTest
{

    public static void main(String[] args)
    {

		// variable definitions
	    int speed;
	    int year;
	    String model;
	    String make;
		String north = "north";
		String south = "south";
		String east = "east";
		String west = "west";
	    String chevrolet = "Chevrolet";
	    String corvette = "Corvette";
		int goodYear = 2014;
		int badYear = -2014;

		///////////////////////////Good Data////////////////////////////////////
		System.out.println("TESTING GOOD DATA");
		System.out.println("");
		System.out.println("");


		/* creating a Car object and referencing louise. Passing date, make,
		 *model to test constructor for good data*/
		Car louise = new Car(goodYear, chevrolet, corvette);

		// creating a Car object and referencing martha. Passes no data to test
		// default constructor.
		Car martha = new Car();

		/* testing accessors by calling get functions for data passed in and
		 assign ing them to variables to be displayed later*/
		year = louise.getYear();
		speed = louise.getSpeed();
		model = louise.getModel();
		make = louise.getMake();

		/* printing to console the data passed in through constructor. Initial
		 speed is not passed in but is initialized through the constructor.
		 It is displayed as well.
		*/
		System.out.println("PRINTING RESULTS FROM DATA PASSED TO CONSTRUCTOR");
		System.out.println("");
		System.out.println("Year: " + year);
		System.out.println("Model: " + model);
		System.out.println("Make: " + make);
		System.out.println("Initial Speed: " + speed);
		System.out.println("");

		/* testing hard coded string results for pass/fail upon return and
		 *compare
		*/
		if(chevrolet.equals(model))
		{

			System.out.println("MODEL: PASSED");

		}

		else
		{

			System.out.println("MODEL: FAILED");
		}

		/* testing hard coded string results for pass/fail upon return and
		 *compare
		*/
		if(corvette.equals(make))
		{

			System.out.println("MAKE: PASSED");

		}

		else
		{

			System.out.println("MAKE: FAILED");

		}

		// testing hard coded int results for pass/fail upon return for year
		if(year == 99999)
		{

			System.out.println("YEAR: FAILED");

		}

		else
		{

			System.out.println("YEAR: PASSED");

		}

		/* testing accessors by calling get functions for data passed in and assign
		 ing them to variables to be displayed later. Martha was an object which
		 used the default constructor.
		 */
		year = martha.getYear();
		speed = martha.getSpeed();
		model = martha.getModel();
		make = martha.getMake();


		/* printing to console the data passed in through default constructor.
		 Initial
		 speed is not passed in but is initialized through the constructor.
		 It is displayed as well.
		*/
		System.out.println("");
		System.out.println("PRINTING RESULTS FROM DEFAULT CONSTRUCTOR");
		System.out.println("");
		System.out.println("Year: " + year);
		System.out.println("Model: " + model);
		System.out.println("Make: " + make);
		System.out.println("Initial Speed: " + speed);
		System.out.println("");


		/* accelerate method called and currentSpeed is called. This should
		 *increase speed by 5 and display the current speed 5 times.
		*/
		System.out.println("ACCELERATING AND DISPLAYING SPEED 5 TIMES");
		System.out.println("");

		System.out.println("Accelerate");
		louise.accelerate();
		louise.currentSpeed();

		System.out.println("Accelerate");
		louise.accelerate();
		louise.currentSpeed();

		System.out.println("Accelerate");
		louise.accelerate();
		louise.currentSpeed();

		System.out.println("Accelerate");
		louise.accelerate();
		louise.currentSpeed();

		System.out.println("Accelerate");
		louise.accelerate();
		louise.currentSpeed();
		System.out.println("");

		// verifying results
		if (louise.getSpeed() == 25)
		{

			System.out.println("ACCELERATION: PASSED");
		}
		else
		{
			System.out.println("ACCELERATION: FAILED");
		}

		/* brake method called and currentSpeed called. This should decrease
		speed by 5 and display the current speed 5 times.
		*/
		System.out.println("");
		System.out.println("BRAKING 6 TIMES AND DISPLAYING SPEED");
		System.out.println("");

		System.out.println("brake");
		louise.brake();
		louise.currentSpeed();

		System.out.println("brake");
		louise.brake();
		louise.currentSpeed();

		System.out.println("brake");
		louise.brake();
		louise.currentSpeed();

		System.out.println("brake");
		louise.brake();
		louise.currentSpeed();

		System.out.println("brake");
		louise.brake();
		louise.currentSpeed();

		System.out.println("brake");
		louise.brake();
		louise.currentSpeed();
		System.out.println("");

		// verifying results
		if (louise.getSpeed() == 0)
		{
			System.out.println("BRAKING: PASSED");
		}
		else
		{
			System.out.println("BAKING: FAILED");
		}

		// testing navigation for right turns
		System.out.println("");
		System.out.println("");
		System.out.println("NAVIGATION TESTING FOR RIGHT TURNS");
		System.out.println("");
		System.out.println("");
		System.out.println("Initial Direction: " + louise.getDirection());
		System.out.println("Make a right turn");
		louise.rightTurn();
		System.out.println("New Direction: " + louise.getDirection());
		System.out.println("");

		// test whether the direction returned after turning right was correct
		if(east.equals(louise.getDirection()))
		{

			System.out.println("-------------------------");
			System.out.println("DIRECTION CHANGE: PASSED");
			System.out.println("-------------------------");

		}
		else
		{
			System.out.println("-------------------------");
			System.out.println("DIRECTION CHANGE: FAILED");
			System.out.println("-------------------------");
		}

		System.out.println("");
		System.out.println("Initial Direction: " + louise.getDirection());
		System.out.println("Make a right turn");
		louise.rightTurn();
		System.out.println("New Direction: " + louise.getDirection());
		System.out.println("");

		// test whether the direction returned after turning right was correct
		if(south.equals(louise.getDirection()))
		{
			System.out.println("-------------------------");
			System.out.println("DIRECTION CHANGE: PASSED");
			System.out.println("-------------------------");
		}
		else
		{
			System.out.println("-------------------------");
			System.out.println("DIRECTION CHANGE: FAILED");
			System.out.println("-------------------------");
		}

		System.out.println("");
		System.out.println("");
		System.out.println("Initial Direction: " + louise.getDirection());
		System.out.println("Make a right turn");
		louise.rightTurn();
		System.out.println("New Direction: " + louise.getDirection());
		System.out.println("");

		// test whether the direction returned after turning right was correct
		if(west.equals(louise.getDirection()))
		{
			System.out.println("-------------------------");
			System.out.println("DIRECTION CHANGE: PASSED");
			System.out.println("-------------------------");

		}
		else
		{
			System.out.println("-------------------------");
			System.out.println("DIRECTION CHANGE: FAILED");
			System.out.println("-------------------------");
		}

		System.out.println("");
		System.out.println("Initial Direction: " + louise.getDirection());
		System.out.println("Make a right turn");
		louise.rightTurn();
		System.out.println("New Direction: " + louise.getDirection());
		System.out.println("");

		// test whether the direction returned after turning right was correct
		if(north.equals(louise.getDirection()))
		{
			System.out.println("-------------------------");
			System.out.println("DIRECTION CHANGE: PASSED");
			System.out.println("-------------------------");

		}
		else
		{
			System.out.println("-------------------------");
			System.out.println("DIRECTION CHANGE: FAILED");
			System.out.println("-------------------------");
		}

		// testing navigation for left turns
		System.out.println("");
		System.out.println("");
		System.out.println("NAVIGATION TESTING FOR LEFT TURNS");
		System.out.println("");
		System.out.println("");
		System.out.println("Initial Direction: " + louise.getDirection());
		System.out.println("Make a left turn");
		louise.leftTurn();
		System.out.println("New Direction: " + louise.getDirection());
		System.out.println("");

		// test whether the direction returned after turning left was correct
		if(west.equals(louise.getDirection()))
		{
			System.out.println("-------------------------");
			System.out.println("DIRECTION CHANGE: PASSED");
			System.out.println("-------------------------");

		}

		else
		{
			System.out.println("-------------------------");
			System.out.println("DIRECTION CHANGE: FAILED");
			System.out.println("-------------------------");
		}


		System.out.println("");
		System.out.println("Initial Direction: " + louise.getDirection());
		System.out.println("Make a left turn");
		louise.leftTurn();
		System.out.println("New Direction: " + louise.getDirection());
		System.out.println("");

		// test whether the direction returned after turning left was correct
		if(south.equals(louise.getDirection()))
		{
			System.out.println("-------------------------");
			System.out.println("DIRECTION CHANGE: PASSED");
			System.out.println("-------------------------");

		}
		else
		{
			System.out.println("-------------------------");
			System.out.println("DIRECTION CHANGE: FAILED");
			System.out.println("-------------------------");
		}

		System.out.println("");
		System.out.println("");
		System.out.println("Initial Direction: " + louise.getDirection());
		System.out.println("Make a left turn");
		louise.leftTurn();
		System.out.println("New Direction: " + louise.getDirection());
		System.out.println("");

		// test whether the direction returned after turning left was correct
		if(east.equals(louise.getDirection()))
		{
			System.out.println("-------------------------");
			System.out.println("DIRECTION CHANGE: PASSED");
			System.out.println("-------------------------");

		}
		else
		{
			System.out.println("-------------------------");
			System.out.println("DIRECTION CHANGE: FAILED");
			System.out.println("-------------------------");
		}
		System.out.println("");
		System.out.println("Initial Direction: " + louise.getDirection());
		System.out.println("Make a left turn");
		louise.leftTurn();
		System.out.println("New Direction: " + louise.getDirection());
		System.out.println("");

		// test whether the direction returned after turning left was correct
		if(north.equals(louise.getDirection()))
		{
			System.out.println("-------------------------");
			System.out.println("DIRECTION CHANGE: PASSED");
			System.out.println("-------------------------");

		}
		else
		{
			System.out.println("-------------------------");
			System.out.println("DIRECTION CHANGE: FAILED");
			System.out.println("-------------------------");
		}




		///////////////////////////Bad Data////////////////////////////////////
		System.out.println("");
		System.out.println("");
		System.out.println("TESTING BAD DATA");
		System.out.println("");
		System.out.println("");


		// creating Car object to test bad data
		Car francine = new Car(badYear, corvette, chevrolet);

		/* testing accessors by calling get functions for data passed in and
		assign ing them to variables to be displayed later
		*/
		year = francine.getYear();
		speed = francine.getSpeed();
		model = francine.getModel();
		make = francine.getMake();

		/* printing to console the data passed in through constructor. Initial
		 speed is not passed in but is initialized through the constructor.
		It is displayed as well.
		*/
		System.out.println("PRINTING RESULTS FROM DATA PASSED TO CONSTRUCTOR");
		System.out.println("");
		System.out.println("Year: " + year);
		System.out.println("Model: " + model);
		System.out.println("Make: " + make);
		System.out.println("Initial Speed: " + speed);
		System.out.println("");

		// testing hard coded string results for pass/fail upon return and
		// compare
		if(chevrolet.equals(model))
		{

			System.out.println("MODEL: PASSED");

		}

		else
		{

			System.out.println("MODEL: FAILED");
		}

		// testing hard coded string results for pass/fail upon return and
		// compare
		if(corvette.equals(make))
		{

			System.out.println("MAKE: PASSED");

		}

		else
		{

			System.out.println("MAKE: FAILED");
		}

		// testing hard coded int results for pass/fail upon return for year
		if(year == 99999)
		{
			System.out.println("YEAR: FAILED");

		}

		else
		{
			System.out.println("YEAR: PASSED");
		}

		System.out.println("");
		System.out.println("");
		System.out.println("TEST COMPLETE");

	}

}