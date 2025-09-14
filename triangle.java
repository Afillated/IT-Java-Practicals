/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.it.practicals;

/**
 *
 * @author carbon
 */
import java.util.Scanner;
public class triangle {
  private String color;
  private double height;
  private double base;
  private double area;

  triangle(String c, double h, double b){
   color = c;
   height = h;
   base = b;
   area = (0.5*h*b);
  }

  double getArea(){
   return area;
  }

  String getColor(){
   return color;
  }

  public static void main(String args[]){
   Scanner in = new Scanner(System.in);
   Scanner in2 = new Scanner(System.in);
   System.out.println("Enter colour, height, base of triangle 1: ");
   String c1 = in.nextLine();
   double num1 = in.nextDouble();
   double num2 = in.nextDouble();
   triangle t1 = new triangle(c1, num1, num2);
   System.out.println("Enter colour, height, base of triangle 2: ");
   String c2 = in2.nextLine();
   double num3 = in2.nextDouble();
   double num4 = in2.nextDouble();
   triangle t2 = new triangle(c2, num3, num4);
   if(t1.getArea() == t2.getArea() && t1.getColor().equals(t2.getColor())){
    System.out.println("Triangles are indentical");
   }
   else{
    System.out.println("Triangles are not indentical");
   }
  }
}
