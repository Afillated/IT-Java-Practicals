/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.it.practicals;

/**
 *
 * @author carbon
 */
public class squareofaltarray {
 public static void main(String args[]){
  int[] array1 = {1,2,3,4,5,6,7,8,9};
  for(int i = 0;i<array1.length;i=i+2){
   int num1 = array1[i]*array1[i];
   System.out.println(num1);
  } 
 } 
}
