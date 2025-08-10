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
public class leapyear {
 public static void main(String args[]){
  Scanner in = new Scanner(System.in);
  System.out.println("Enter a year to print if its a leap year or not: ");
  int num1 = in.nextInt();
  if(num1%4==0){
   System.out.println(num1+" is a leap year");
  }
  else{
   System.out.println(num1+" is not a leap year");
  }
 }
}
