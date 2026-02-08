/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package how.to.calculate.area.of.reactangle;

import java.util.Scanner;

/**
 *
 * @author omare
 */
public class HowToCalculateAreaOfReactangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner X = new Scanner(System.in);
        
        int Length , Width , Area;
        
        System.out.println("Enter Reactangle Length");
        Length = X.nextInt();
        
        System.out.println("Enter Reactangle Width");
        Width = X.nextInt();
        
        Area = Length * Width ;
        
        System.out.printf("The Reactangle Area Is %d",Area);
        
        System.out.println("\n");
        
    }
    
}
