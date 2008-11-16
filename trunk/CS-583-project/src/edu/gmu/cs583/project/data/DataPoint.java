package edu.gmu.cs583.project.data;

import java.awt.Color;


public class DataPoint {
	Integer x;
	Integer y;
	Color centroidColor;
	
	public DataPoint(){
		Integer x = -1;
		Integer y = -1;
		Color centroidColor = null;
	}
	
	public DataPoint(Integer x, Integer y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public Color getCentroidColor() {
		return centroidColor;
	}

	public void setCentroidColor(Color centroidColor) {
		this.centroidColor = centroidColor;
	}
	
	public String toString(){
		return x.toString() + ":" + y.toString();
	}
	
	public void setPoints(Integer x, Integer y){
		this.x = x;
		this.y = y;
	}
	
}
