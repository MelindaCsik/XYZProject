/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xyz;
import static java.lang.Math.PI;
import java.util.Scanner;
/**
 *
 * @author user3
 */
public class XYZ {

    /**
     * @param args the command line arguments
     */
    public static double hengerterfogat(double sugar,double magas) {
        double vossz;
        vossz = (sugar * sugar) * PI * magas;
        return vossz;
    }
    public static double hengerfelszin(double sugar1,double magas1) {
        double aossz;
        aossz = 2 * (sugar1 * sugar1) * PI + 2 * sugar1 * PI * magas1;
        return aossz;
    }
    public static void main(String[] args) {
        
        Scanner bill = new Scanner(System.in);
        
        System.out.println("Adja meg a henger sugarát:");
        double sugar = bill.nextDouble();
        System.out.println("Adja meg a henger magasságát:");
        double magas = bill.nextDouble();
        
        System.out.println("A henger térfogata:" + hengerterfogat(sugar, magas));
        
        System.out.println("A henger felszíne:" + hengerfelszin(sugar, magas));
        

       
    }
    
}
