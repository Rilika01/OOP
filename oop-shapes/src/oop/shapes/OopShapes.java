/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.shapes;
/**
 *
 * @author Emre
 */
public class OopShapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape s1 = new Kare(5);
        System.out.println(s1.cevre());
        System.out.println(s1.alan());
        
        s1 = new Dikdortgen(5,7);
        System.out.println(s1.cevre());
        System.out.println(s1.alan());
    }
    
}
