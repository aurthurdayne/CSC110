//-----------------------------------------------------------------------
//Program Name: SphereCalculations
//Author:       Nicholas Smith
//Class:        CSC 110AB
//Date:         Feb 9,2015
//Description:  Calculates Volume and Surface Area of a sphere
//-----------------------------------------------------------------------
package ch3;

import java.util.Scanner;
import java.text.DecimalFormat;


public class SphereCalculations
{

	public static void main(String[] args)
	{
		//Declare Variables
		double radius;
		double surfaceArea;
		double volume;
		final double PI = Math.PI;
		
		//Open Scanner and prompt user
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Sphere Calculator!");
		System.out.println("Enter the radius of the sphere:");
		
		radius = scan.nextDouble();
		
		surfaceArea = 4 * PI * Math.pow(radius, 2);
		
		volume = (PI*4/3) * Math.pow(radius, 3);
		
		//Set Decimal Format
		
		DecimalFormat df = new DecimalFormat("#.####");
		
		//Display output
		
		System.out.println("The results are:");
		System.out.println("Radius: " + df.format(radius));
		System.out.println("Volume: " + df.format(volume));
		System.out.println("Surface Area: " + df.format(surfaceArea));
		
		scan.close();
	}
/*OUTPUT
 * 
Welcome to Sphere Calculator!
Enter the radius of the sphere:
4.2
The results are:
Radius: 4.2
Volume: 310.3391
Surface Area: 221.6708
 *
Welcome to Sphere Calculator!
Enter the radius of the sphere:
7.5
The results are:
Radius: 7.5
Volume: 1767.1459
Surface Area: 706.8583
 *
 */
}
