/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.it.practicals;

/**
 *
 * @author carbon
 */
public class stringManipulation {
 public static void main(String argss[]){
   String a = "Hello World";
   System.out.println(a.charAt(5));
   System.out.println(a.concat("neon"));
   System.out.println(a.contains("o"));
   System.out.println(a.endsWith("l"));
   System.out.println(a.equals("hello world"));
   System.out.println(a.equalsIgnoreCase("hello world"));
   System.out.println(a.indexOf("W", 0));
   System.out.println(a.indexOf("orld", 0));
   System.out.println(a.isEmpty());
   System.out.println(a.length());
   System.out.println(a.replace("l","*"));
   System.out.println(a.replace("Hello","yo"));
   System.out.println(a.toLowerCase());
   System.out.println(a.toUpperCase());
 }    
}
