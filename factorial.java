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
public class factorial {
 public static void main(String args[]){
  Scanner in = new Scanner(System.in);
  System.out.println("Enter a number to get its factorial: ");
  int num1 = in.nextInt();
  //using for loop
  int num2 = 1;
  for(int i = 1;i<(num1+1);i++){
   num2 = num2*i;
  }
  System.out.println("The factorial of entered number is "+num2);
 
  //using for loop
  int j = 1;
  int num3 = 1;
  while(j<(num1+1)){
   num3 = num3*j;
   j=j+1;
  }
  System.out.println("The factorial of entered number is "+num3);
 }
}
