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
public class plusminuszero {
 public static void main (String args[]){
  Scanner in = new Scanner(System.in);
  System.out.println("Enter a number to see if it is postive or negative: ");
  double num1 = in.nextDouble();
  if(num1>0){
   System.out.println("Number entered is postive");
  }
  else if(num1<0){
   System.out.println("Number entered is negative");
  }
  else{
   System.out.println("Number entered is zero");
  }
 }    
}
