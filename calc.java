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
public class calc {
 public static void main(String args[]){
  Scanner in = new Scanner(System.in);
  while(true){
   System.out.println("Select: \n1. Addition\n2. Subtraction\n3.Multiplication\n4. Division\n5. Exit");
   int input = in.nextInt();
   if(input == 1){
    System.out.println("Enter 2 numbers to add: ");
    double num1 = in.nextInt();
    double num2 = in.nextInt();
    double num3 = num1+num2;
    System.out.println(num3+" is the addition of "+num1+" and "+num2);
   }
   else if(input == 2){
    System.out.println("Enter 2 numbers to subtract: ");
    double num1 = in.nextInt();
    double num2 = in.nextInt();
    double num3 = num1-num2;
    System.out.println(num3+" is the subtraction of "+num1+" and "+num2);
   }
   else if(input == 3){
    System.out.println("Enter 2 numbers to mulitply: ");
    double num1 = in.nextInt();
    double num2 = in.nextInt();
    double num3 = num1*num2;
    System.out.println(num3+" is the multiplication of "+num1+" and "+num2);
   }
   else if(input == 4){
    System.out.println("Enter 2 numbers to divide: ");
    double num1 = in.nextInt();
    double num2 = in.nextInt();
    double num3 = num1/num2;
    System.out.println(num3+" is the division of "+num1+" and "+num2);
   }
   else if(input == 5){
    System.out.println("exiting...");
    break;
   }
   else{
    System.out.println("Invalid input, try again");
   }
  }
 }
}
