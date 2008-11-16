/* Authors: Chris Andrade, Nathan Heminger, Alex Prunka
 * Class: CS583 Section 002
 * Purpose: Final Project
 * Title: Clustering Algorithms
 * Description: Point Generator Class generators n number of x and y data points in a given
 * range. It outputs a Vector of n DataPoint Class initialized with x and y position in the given range.
 */

package edu.gmu.cs583.project.data;

import java.util.HashMap;
import java.util.Random;
import java.util.Vector;

public class PointGenerator {

	Integer x_range;
	Integer y_range;
	Integer number_of_points;
	Vector<DataPoint> returnDataPoints;
	HashMap<String,DataPoint> hashedPoints;
	
	
	
	PointGenerator(){
		x_range = 300;
		y_range = 300;
		number_of_points = 50;
		GeneratePoints();
	}
	
	
	PointGenerator(Integer x, Integer y, Integer numberOfPoints){
		x_range = x;
		y_range = y;
		number_of_points = numberOfPoints;
		GeneratePoints();
	}
	
	private DataPoint GeneratePoints(){
		Random generator = new Random();
		DataPoint point = new DataPoint();
		while(hashedPoints.size() < number_of_points){
			point.setPoints(generator.nextInt(x_range),generator.nextInt(y_range));
			hashedPoints.put(point.toString(), point);			
		}
		return point;
	}
	
	public Vector<DataPoint> GetPointsVector(){
		for(String key : hashedPoints.keySet()){
			returnDataPoints.add(hashedPoints.get(key));
		}
		return returnDataPoints;
	}
	
	public HashMap<String, DataPoint> GetPointsHashed(){
		return hashedPoints;
	}
	
	public void printValues(){
		for(String key : hashedPoints.keySet()){
			System.out.println(hashedPoints.get(key).toString());
		}
	}
	
	
}