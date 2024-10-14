/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oncampustest2;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.Scanner;

/**10
 * 
 *
 * @author lab_services_student
 */
public class OnCampusTest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scanner = new Scanner(System.in); 
    
        System.out.println("Enter the number of roads constructed for Cape Town: ");
        int CPT = scanner.nextInt();
        
        System.out.println("Enter the number of roads constructed for Johannesburg: ");
        int JHB = scanner.nextInt();
        
        System.out.println("Enter the number of roads constructed for Port Elizabeth:");
        int PE = scanner.nextInt();
        
        int space = 0;
        
        int[][] roads = {
            {space, CPT}, // CPT
            {space, JHB}, // JHB
            {space, PE}  // PE
        };
       
        int highestConstructions = Integer.MIN_VALUE;
        int lowestConstructions = Integer.MAX_VALUE;
        
         for (int i = 0; i < roads.length; i++) {
            for (int j = 0; j < roads[i].length; j++) {
                int total = roads[i][j];
                if (total > highestConstructions) {
                    highestConstructions = total;
                }
                if (total < lowestConstructions) {
                    lowestConstructions = total;
                }
            }
        }
        
        System.out.println("*********************************************************************");
        System.out.println("ROAD CONSTRUCTION REPORT");
        System.out.println("*********************************************************************");
 
        String[] cities = {"JHB", "CPT", "PE"};
        String[] title = {"Roads Constructed"};
        
         System.out.print("\t\t");
        for (String vehicle : title) {
            System.out.print(vehicle + "\t");
        }
        System.out.println();
        
         for (int i = 0; i < roads.length; i++) {
            System.out.print(cities[i] + "\t");
            for (int j = 0; j < roads[i].length; j++) {
                System.out.print(roads[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("City with the most road contructions: " + highestConstructions);
        
        System.out.println("*********************************************************************");
    }
    
}

