/* Authors: Chris Andrade, Nathan Heminger, Alex Prunka
 * Class: CS583 Section 002
 * Purpose: Final Project
 * Title: Clustering Algorithms
 * Description: DataPoint Class holds X and Y values for points.
 */

package edu.gmu.cs583.project.data;

import java.awt.Color;


public class DataPoint {
	private Integer x;
	private Integer y;
	private Color centroidMebership = null;
	
	public DataPoint(){
		Integer x = -1;
		Integer y = -1;
		centroidMebership = Color.white;
	}
	
	public DataPoint(Integer x, Integer y) {
		super();
		this.x = x;
		this.y = y;
		centroidMebership = Color.white;
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
	
	public String toString(){
		return x.toString() + ":" + y.toString();
	}
	
	public void setPoints(Integer x, Integer y){
		this.x = x;
		this.y = y;
	}

	public Color getCentroidMebership() {
		return centroidMebership;
	}

	public void setCentroidMebership(Color centroidMebership) {
		this.centroidMebership = centroidMebership;
	}
	
	
}
