/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.shapes;

/**
 *
 * @author Emre
 */
public class Dikdortgen extends Shape{
    
    public Dikdortgen(double kisaKenar, double uzunKenar){
        super(4);
        kenar[0] = kenar[1] = kisaKenar;
        kenar[2]= kenar[3] = uzunKenar;
    }
    
    @Override
    public double alan(){
        return kenar[0]* kenar[2];
    }
}
