package com.zensar.model.figure;

public class Rectangle extends Parallelogram{
	
	public Rectangle(double dimension1, double dimension2, double angle) {
		super(dimension1, dimension2, angle);
	}
	
	@Override
	public void setAngle(double angle){
		
		throw new RuntimeException("Angle cannot change for Rectangle");
		
	}

}
