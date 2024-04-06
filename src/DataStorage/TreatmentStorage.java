/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStorage;

import java.util.ArrayList;
 
public class TreatmentStorage {
    private static TreatmentStorage instance;     
    private ArrayList<String> treatmentStorageData = new ArrayList<>();

    private TreatmentStorage() {
    }

    public static TreatmentStorage getInstance() {
        if (instance == null) {
            instance = new TreatmentStorage();
        }
        return instance;
    }

    public void addNewTreatment(String[] data) {
        String concatenatedData = String.join(",", data); // Joins array elements with a comma (you can choose any delimiter)
        treatmentStorageData.add(concatenatedData);
    }
    public ArrayList<String> getAvailableTreatments() {
        return treatmentStorageData;
    }
    public void resettTreatmentData() {
        treatmentStorageData.clear();
    }
}
