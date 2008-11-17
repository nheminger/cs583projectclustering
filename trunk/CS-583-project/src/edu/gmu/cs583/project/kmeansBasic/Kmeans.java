package edu.gmu.cs583.project.kmeansBasic;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

import edu.gmu.cs583.project.data.Centroid;
import edu.gmu.cs583.project.data.DataPoint;
import edu.gmu.cs583.project.data.PointGenerator;

public class Kmeans {
	
	private Vector<DataPoint> dataPoints = new Vector<DataPoint>();
	private Vector<Centroid> centroids = new Vector<Centroid>();
	private boolean DEBUG = false;
	private List<Color> colors = new ArrayList<Color>();
	private Integer number_of_centroids;
	private PointGenerator gen;
	
	Kmeans(Integer numberOfCentroids,Integer numberOfDataPoints,Integer x,Integer y){
		if(numberOfCentroids < 12){
			System.out.println("Max number of centroids is 12, The number of centroids has been set to 12");
			number_of_centroids = 12;
		} else if (numberOfCentroids > 0){
			number_of_centroids = numberOfCentroids;
		} else {
			System.out.println("Invalid number was entered for number of centroids, The number of centroids has been set to 3");
			number_of_centroids = 3;
		}
		makecolors();
		gen = new PointGenerator(numberOfDataPoints);
		createCentroids();
	}
	
	public static void main(String[] args) {
		PointGenerator gen = new PointGenerator();
		gen.printValues();
		
	}
	
	public void createCentroids(){
		for(int i = 0; i < number_of_centroids;i++){
			Centroid cent = new Centroid();
			centroids.add(cent);
		}
		initCentroids();
	}
	
	public void initCentroids(){
		int t = 0;
		for(Centroid i: centroids){
			i.setPoints(dataPoints.get(t).getX(),dataPoints.get(t).getY());
			i.setCentroidId((t+1));
			i.setCentroidColor(colors.get(t));
			t++;
			if(DEBUG){
				System.out.println(i.toString());
			}
		}
	}
	
	public void calulateMembership(){
		
	}
	
	public void recomputeCentroids(){
		
	}
	
	public void initcentColors(){
		
	}
	
	public void centroidColors(){
		
	}
	
	public Vector<DataPoint> getDataPoints() {
		return dataPoints;
	}

	public void setDataPoints(Vector<DataPoint> dataPoints) {
		this.dataPoints = dataPoints;
	}

	public Vector<Centroid> getCentroids() {
		return centroids;
	}

	public void setCentroids(Vector<Centroid> centroids) {
		this.centroids = centroids;
	}

	public void makecolors(){
		colors.add(Color.blue);
		colors.add(Color.cyan);
		colors.add(Color.green);
		colors.add(Color.orange);
		colors.add(Color.red);
		colors.add(Color.magenta);
		colors.add(Color.yellow);
		colors.add(Color.pink);
		colors.add(Color.gray);
		colors.add(Color.lightGray);
		colors.add(Color.magenta);
		colors.add(Color.darkGray);
	}

}
