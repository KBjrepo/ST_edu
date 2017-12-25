package ru.stqa.pft.sandbox;

public class PointDistance {
  public static void main(String[] args) {

    Point p1 = new Point(0.5,1);
    Point p2 = new Point(2, 3);

    System.out.println("Расстояние между двумя точками = " + p1.distance(p2));
  }



}
