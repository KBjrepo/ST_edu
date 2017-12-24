package ru.stqa.pft.sandbox;

public class Point {

  public double x1, y1;

  public Point(double x1, double y1) {
    this.x1 = x1;
    this.y1 = y1;
  }

  public double distance(double x2, double y2) {
    return Math.sqrt(Math.pow((x2 - this.x1), 2) + Math.pow((y2 - this.y1), 2));
  }

}
