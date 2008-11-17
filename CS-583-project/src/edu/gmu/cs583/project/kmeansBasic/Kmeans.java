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
		number_of_centroids = numberOfCentroids;
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
		Random generator = new Random();
		for(Centroid i: centroids){
			i.setPoints(generator.nextInt(gen.getX_range()),generator.nextInt(gen.getY_range()));
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
