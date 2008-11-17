package edu.gmu.cs583.project.kmeansBasic;

import java.awt.Color;
import java.util.Vector;

import edu.gmu.cs583.project.data.Centroid;
import edu.gmu.cs583.project.data.DataPoint;
import edu.gmu.cs583.project.data.PointGenerator;

public class Kmeans {
	private Vector<DataPoint> dataPoints = new Vector<DataPoint>();
	private Vector<Centroid> centroids = new Vector<Centroid>();
	private boolean DEBUG = false;
	private Vector<Color> colors = new Vector<Color>();
	private Integer number_of_centroids;

	Kmeans(Integer numberOfCentroids,Integer numberOfDataPoints){
		number_of_centroids = numberOfCentroids;
		PointGenerator gen = new PointGenerator(numberOfDataPoints);
		for(int i = 0; i < number_of_centroids;i++){
			Centroid cent = new Centroid();
			centroids.add(cent);
		}
		initCentroids();
	}
	
	public static void main(String[] args) {
		PointGenerator gen = new PointGenerator();
		gen.printValues();
		
	}
	
	public void initCentroids(){
			//TODO: get centroid colors
	}
	
	public void calulateMembership(){
		
	}
	
	public void recomputeCentroids(){
		
	}
	
	public void initcentColors(){
		
	}
	public void centroidColors(){
		
	}
	
	

}
