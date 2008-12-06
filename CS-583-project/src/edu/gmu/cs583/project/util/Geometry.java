package edu.gmu.cs583.project.util;

import edu.gmu.cs583.project.data.Centroid;
import edu.gmu.cs583.project.data.DataPoint;
import java.lang.Math;

public class Geometry {
	private boolean DEBUG = false;

	public Geometry(){	}
	
	public static void main(String[] args){
		Geometry geo = new Geometry();
		Centroid cent = new Centroid(5,20);
		DataPoint point = new DataPoint(10,30);
		geo.setDEBUG(true);
		System.out.println(geo.getDistance(cent, point));
	}
	
	public Double getDistance(Centroid centroid, DataPoint point){
		Double xVals = Math.pow((centroid.getX() - point.getX()),2);
		Double yVals = Math.pow((centroid.getY() - point.getY()),2);
		if(DEBUG)
			System.out.println("Centroid: "+ centroid.toString()+" point: " + point.toString() +" Distance: " + Math.sqrt(xVals+yVals));
		
		return Math.sqrt(xVals+yVals);
	}

	

	public boolean isDEBUG() {
		return DEBUG;
	}

	public void setDEBUG(boolean debug) {
		DEBUG = debug;
	}
	
	
	
}
