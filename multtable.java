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
public class multtable {
 public static void main(String args[]){
  Scanner in = new Scanner(System.in);
  System.out.println("Enter a number to get its multiples up to 10 iterations: ");
  int num1 = in.nextInt();
  for(int i = 1;i<11;i++){
   int num2 = num1*i;
   System.out.println(num2);
  }
 }    
}
