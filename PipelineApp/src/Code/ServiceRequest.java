/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author muaaz
 */
public class ServiceRequest {
    public int floorNumber;
    public String staffID;

    public ServiceRequest(int floorNumber, String staffID) {
        this.floorNumber = floorNumber;
        this.staffID = staffID;
    }
    
    public String printInfo() {
        return "Floor: " + floorNumber + ", Staff ID: " + staffID;
    }
}
