package edu.gmu.cs583.project.kmeansBasic;

import edu.gmu.cs583.project.data.PointGenerator;
import edu.gmu.cs583.project.kmeans.KMeansClusterer;

public class Kmeans {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PointGenerator gen = new PointGenerator();
		gen.printValues();
		KMeansClusterer clusterer = new KMeansClusterer();
	}

}
