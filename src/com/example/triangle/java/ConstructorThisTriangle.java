package com.example.triangle.java;

public class ConstructorThisTriangle {

	double base, height;

 public ConstructorThisTriangle(double base, double height) {
	this.base = base;
	this.height = height;	
	// TODO Auto-generated constructor stub
}

public void DispalyValues(){

	System.out.println("Base: "+base );     

	System.out.println("Height: "+height );
}
public static void main(String args[]){

ConstructorThisTriangle tri = new ConstructorThisTriangle(10, 20);
tri.DispalyValues();
}
}
