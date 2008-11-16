package edu.gmu.cs583.project.kmeansBasic;

import java.util.Vector;

import edu.gmu.cs583.project.data.Centroid;
import edu.gmu.cs583.project.data.DataPoint;
import edu.gmu.cs583.project.data.PointGenerator;
import edu.gmu.cs583.project.kmeans.KMeansClusterer;

public class Kmeans {
	private Vector<DataPoint> dataPoints = new Vector<DataPoint>();
	private Vector<Centroid> centroids = new Vector<Centroid>();
	
	Kmeans(Integer numberOfCentroids,Integer numberOfDataPoints){
		
	}
	
	public static void main(String[] args) {
		PointGenerator gen = new PointGenerator();
		gen.printValues();
		
	}
	
	public void initCentroids(){
			
	}
	
	public void calulateMembership(){
		
	}
	

}
