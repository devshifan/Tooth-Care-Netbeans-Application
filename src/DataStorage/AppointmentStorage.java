/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStorage;

import java.util.ArrayList;
 
public class AppointmentStorage {
    private static AppointmentStorage instance;     
    private final ArrayList<String> apppointmentStorage = new ArrayList<>();

    private AppointmentStorage() {
    }

    public static AppointmentStorage getInstance() {
        if (instance == null) {
            instance = new AppointmentStorage();
        }
        return instance;
    }

    public void addNewAppointment(String[] data) {
        // Joins array elements with a comma (can choose any delimiter)
        String concatenatedData = String.join(",", data); 
        apppointmentStorage.add(concatenatedData); 
    }

    public ArrayList<String> getAvailableAppointment() {
        return apppointmentStorage;
    }
    public void resetAppointmentData() {
        apppointmentStorage.clear();
    }
}
