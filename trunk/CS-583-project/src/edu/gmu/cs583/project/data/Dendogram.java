package edu.gmu.cs583.project.data;

import java.util.Vector;

/**
 * The Dendogram class is used to represent how the hierarchical clustering
 * method composed the clusters. A Dendogram may contain other dendograms called
 * sub-dendograms, or be composed of a single cluster of two points.
 * 
 * @author Chris Andrade
 */
public class Dendogram {

	private Vector<Dendogram> subDendograms;
	private Vector<DataPoint> cluster;

	/**
	 * Default Constructor
	 */
	public Dendogram() {
		subDendograms = new Vector<Dendogram>();
		cluster = new Vector<DataPoint>();
	}

	/**
	 * Displays the Dendogram as a multi-tiered string.
	 */
	public String toString() {
		String str = "{";
		if (!cluster.isEmpty()) {
			for (int i = 0; i <= cluster.size() - 1; i++) {
				if (i == 0)
					str += "(" + cluster.get(0).getX() + ", "
							+ cluster.get(0).getY() + ")";
				else
					str += ",(" + cluster.get(0).getX() + ", "
							+ cluster.get(0).getY() + ")";
			}
			str += "}";
		} else {
			for (Dendogram subDendogram : subDendograms) {
				str += "\n" + subDendogram.toString();
			}
			str += "}";
		}
		return str;
	}
}
