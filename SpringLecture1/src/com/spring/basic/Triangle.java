package com.spring.basic;

import java.util.List;

public class Triangle {

	/*
	 * public String type; public int hight;
	 * 
	 * public String getType() { return type; }
	 * 
	 * public void setType(String type) { this.type = type; }
	 * 
	 * public int getHight() { return hight; }
	 * 
	 * public void setHight(int hight) { this.hight = hight; }
	 */

	
	public Point pointA;
	public Point pointB;
	public Point pointC;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("Point A : " + getPointA().getX() + "," + getPointA().getY());
		System.out.println("Point A : " + getPointB().getX() + "," + getPointB().getY());
		System.out.println("Point A : " + getPointC().getX() + "," + getPointC().getY());
	}
}
