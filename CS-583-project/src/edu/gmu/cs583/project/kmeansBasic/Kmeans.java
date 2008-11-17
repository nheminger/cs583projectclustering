package edu.gmu.cs583.project.kmeansBasic;

import java.util.Vector;

import edu.gmu.cs583.project.data.Centroid;
import edu.gmu.cs583.project.data.DataPoint;
import edu.gmu.cs583.project.data.PointGenerator;

public class Kmeans {
	private Vector<DataPoint> dataPoints = new Vector<DataPoint>();
	private Vector<Centroid> centroids = new Vector<Centroid>();
	private boolean DEBUG = false;
	
	Kmeans(Integer numberOfCentroids,Integer numberOfDataPoints){
		PointGenerator gen = new PointGenerator(numberOfDataPoints);
		for(int i = 0; i < numberOfCentroids;i++){
			//TODO: generate centroids
		}
		//TODO: initCentroids
	}
	
	public static void main(String[] args) {
		PointGenerator gen = new PointGenerator();
		gen.printValues();
		
	}
	
	public void initCentroids(){
			
	}
	
	public void calulateMembership(){
		
	}
	
	public void recomputeCentroids(){
		
	}
	
	
	

}
