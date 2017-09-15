/**
*@ author GAURAV 15103076
*Write a java program to create an abstract class named Shape that contains an empty method named number Of Sides ( ).
*/


package gaurav;

abstract class ShapeAbstarction {

	abstract void numofSides();
	
}
class Trapezoid extends ShapeAbstarction
{
	void numofSides()
	{
		System.out.println("Number of Sides of Trapezoid = 4");
	}
}

class Triangle extends ShapeAbstarction
{
	void numofSides()
	{
		System.out.println("Number of Sides of Triangle = 3");
	}
}

class Hexagon extends ShapeAbstarction
{
	void numofSides()
	{
		System.out.println("Number of Sides of Hexagon = 6");
	}
	
}

