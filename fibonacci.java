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
public class fibonacci {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.println("Enter the number of terms of fibonacci sequence: ");
  int count = in.nextInt();
  int n1 = 0, n2 = 1;     
  System.out.print(n1 + " " + n2);

  for (int i = 2; i < count; ++i) {
   int n3 = n1 + n2;
   System.out.print(" " + n3);
   n1 = n2;
   n2 = n3;
  }
  System.out.println();
 }   
}
