package model;

/**
 * @Autor: Jef Beyens
 * @Date: 16/10/2016
 * @Project: Calculator
 * @Purpose: Model data klasse
 * This class is a container for the settings for the exercise generator
 */
public class ExerciseSettings {
	private double minRange;
	private double maxRange;
	private int nrDecimals;
	private int nrExercises;
	private String[] operators;
	
	
	public double getMinRange() {
		return minRange;
	}
	public void setMinRange(double minRange) {
		this.minRange = minRange;
	}
	public double getMaxRange() {
		return maxRange;
	}
	public void setMaxRange(double maxRange) {
		this.maxRange = maxRange;
	}
	public int getNrDecimals() {
		return nrDecimals;
	}
	public void setNrDecimals(int nrDecimals) {
		this.nrDecimals = nrDecimals;
	}
	public String[] getOperators() {
		return operators;
	}
	public void setOperators(String[] operators) {
		this.operators = operators;
	}
	public int getNrOfExercises() {
		return nrExercises;
	}
	public void setNrOfExercises(int nrExercises) {
		this.nrExercises = nrExercises;
	}
	
	
}
