/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.shapes;
import java.lang.Math;
/**
 *
 * @author Emre
 */
public class ucgen extends Shape {

    public ucgen(double kenar1, double kenar2, double kenar3) {
        super(3);
        kenar[0] = kenar1;
        kenar[1] = kenar2;
        kenar[2] = kenar3;

    }
    @Override
    public double alan(){
        double u = this.cevre()/2;
        double alan = Math.sqrt(u*(u-kenar[0])*(u-kenar[1])*(u-kenar[2]));
        return alan;
    }
}
