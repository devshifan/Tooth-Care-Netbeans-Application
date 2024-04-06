/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStorage;

import java.util.ArrayList;
 
public class PaymentStorage {
    private static PaymentStorage instance;     
    private ArrayList<String> paymentStorageData = new ArrayList<>();

    private PaymentStorage() {
    }

    public static PaymentStorage getInstance() {
        if (instance == null) {
            instance = new PaymentStorage();
        }
        return instance;
    }

    public void addNewPayment(String[] data) {
        String concatenatedData = String.join(",", data); // Joins array elements with a comma (you can choose any delimiter)
        paymentStorageData.add(concatenatedData);
    }
    public ArrayList<String> getAvailablePayment() {
        return paymentStorageData;
    }
    public void resetPaymentData() {
        paymentStorageData.clear();
    }

}
