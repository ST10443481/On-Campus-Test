/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question2;

/**
 *
 * @author lab_services_student
 */
public class CityRoadsReport extends RoadsConstructed {

    public CityRoadsReport(String city, int totalRoadsConstructed) {
        super(city, totalRoadsConstructed);
    }

    @Override
    public void reportRoads() {
        System.out.println("\nROAD CONSTRUCTION REPORT");
        System.out.println("***************************");
        System.out.println("City: " + getCity());
        System.out.println("Total Roads Constructed: " + getTotalRoadsConstructed());
    }
}