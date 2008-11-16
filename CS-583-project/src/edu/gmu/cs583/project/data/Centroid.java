package edu.gmu.cs583.project.data;

import java.awt.Color;

public class Centroid {
	private Integer CentroidId;
	private Integer x;
	private Integer y;
	private Color centroidColor;
	private Cluster cluster;
	
	public Centroid(Integer centroidId, Color centroidColor, Cluster cluster,
			Integer x, Integer y) {
		super();
		CentroidId = centroidId;
		this.centroidColor = centroidColor;
		this.cluster = cluster;
		this.x = x;
		this.y = y;
	}

	public Integer getCentroidId() {
		return CentroidId;
	}

	public void setCentroidId(Integer centroidId) {
		CentroidId = centroidId;
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

	public Cluster getCluster() {
		return cluster;
	}

	public void setCluster(Cluster cluster) {
		this.cluster = cluster;
	}
	
	public String toString(){
		return x.toString() + ":" + y.toString();
	}
		
}
