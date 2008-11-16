package edu.gmu.cs583.project.data;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;

public class PointGenerator {

	Integer x_range;
	Integer y_range;
	Integer number_of_points;
	Vector<DataPoint> data;
	HashMap points;
	
	PointGenerator(Integer x, Integer y, Integer numberOfPoints){
		x_range = x;
		y_range = y;
		number_of_points = numberOfPoints;
	}
	
	public void GeneratePoints(){
		
	}
	
	public Vector<DataPoint> GetPoints(){
		return data;
	}
	
	private boolean checkvalues(Integer x,Integer y){
		boolean isUnque = false;
		
		
		return isUnque;
	}
	
}
