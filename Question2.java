/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package question2;
import java.util.Scanner;
/**
 *
 * @author lab_services_student
 */
public class Question2 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input city and number of roads constructed
        System.out.print("Enter city name: ");
        String city = scanner.nextLine();

        System.out.print("Enter total number of roads constructed: ");
        int totalRoads = scanner.nextInt();

        // Create a CityRoadsReport instance and print the report
        CityRoadsReport report = new CityRoadsReport(city, totalRoads);
        report.reportRoads();
    }
}

  
    

