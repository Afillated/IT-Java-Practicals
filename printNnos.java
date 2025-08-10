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
public class printNnos {
 public static void main(String args[]){
  Scanner in = new Scanner(System.in);
  System.out.println("Enter N to print natural numbers to N: ");
  int num1 = in.nextInt();
  int num2 = 0;
  for(int i =1;i<=num1;i++){
   num2 = num2 +1;
   System.out.print(num2+" ");
  }
 }
}
