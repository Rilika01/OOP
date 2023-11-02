/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.shapes;

/**
 *
 * @author Emre
 */
public class Shape {
   protected double[] kenar;
   
   public Shape(int kenarsayisi){
       kenar = new double[kenarsayisi];
   }
   
   public double cevre(){
       double c =0;
       for (int i=0; i<kenar.length; i++){
           c += kenar[i];
       }
       return c;
   }
   
   public double alan(){
       return 0;
   }
   
   public double hacim(){
       return 0;
   }
   
   double get(int index){
       if(index > kenar.length){
           throw new ArrayIndexOutOfBoundsException();
       }
       return kenar[index];
   }
   
   void set(int index, double newValue){
       if(index > kenar.length){
           throw new ArrayIndexOutOfBoundsException();
       }
       kenar[index] = newValue;
   }
}
