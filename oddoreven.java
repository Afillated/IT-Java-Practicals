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
public class oddoreven {
 public static void main(String args[]){
  Scanner in = new Scanner(System.in);
  System.out.println("Enter a number to check if it is even or odd");
  double num1 = in.nextDouble();
  if(num1%2 == 0){
   System.out.println("Entered number is even");
  }
  else {
   System.out.println("Entered number is odd");
  }
 }    
}
