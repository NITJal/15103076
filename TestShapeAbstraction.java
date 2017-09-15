/**
*@ author GAURAV 15103076
*Write a java program to create an abstract class named Shape that contains an empty method named number Of Sides ( ).
*/

package gaurav;

public class TestShapeAbstraction {


	public static void main(String[] args) 
	{
			Trapezoid tr = new Trapezoid();
			tr.numofSides();
			Triangle tri = new Triangle();
			tri.numofSides();
			Hexagon he = new Hexagon();
			he.numofSides();
	}

}