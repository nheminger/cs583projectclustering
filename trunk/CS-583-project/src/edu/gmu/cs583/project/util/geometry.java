package edu.gmu.cs583.project.util;

import edu.gmu.cs583.project.data.Centroid;
import edu.gmu.cs583.project.data.DataPoint;
import java.lang.Math;

public class geometry {
	private boolean DEBUG = false;

	geometry(){	}
	
	geometry(boolean x){
		DEBUG = x;
	}
	
	public Double GetDistance(Centroid centroid, DataPoint point){
		Double xVals = Math.pow((centroid.getX() - point.getX()),2);
		Double yVals = Math.pow((centroid.getY() - point.getY()),2);
		if(DEBUG)
		System.out.println("Centroid: "+ centroid.toString()+" point: " + point.toString() +" Distance: " + Math.sqrt(xVals+yVals));
		return Math.sqrt(xVals+yVals);
	}
	
}
