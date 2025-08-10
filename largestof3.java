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
public class largestof3 {
 public static void main(String args[]){
  Scanner in = new Scanner(System.in);
  System.out.println("Enter three numbers to find the largest: ");
  // double num1, num2 ,num3;
  double num1 = in.nextDouble();
  double num2 = in.nextDouble();
  double num3 = in.nextDouble();
  if(num1>num2 && num1>num3){
   System.out.println(num1+" is the largest");
  }
  else if(num2>num1 && num2>num3){
   System.out.println(num2+" is the largest");
  }
  else if(num3>num1 && num3>num2){
   System.out.println(num3+" is the largest");
  }
  else {
   System.out.println("Some/all numbers are equal");
  }
 }    
}
