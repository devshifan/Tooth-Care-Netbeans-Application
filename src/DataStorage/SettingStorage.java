/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStorage;

import java.util.ArrayList;
 
public class SettingStorage {
    private static SettingStorage instance;     
    private ArrayList<String> settingStorageData = new ArrayList<>();

    private SettingStorage() {
    }

    public static SettingStorage getInstance() {
        if (instance == null) {
            instance = new SettingStorage();
        }
        return instance;
    }

    public void addNewUser(String[] data) {
        String concatenatedData = String.join(",", data); // Joins array elements with a comma (you can choose any delimiter)
        settingStorageData.add(concatenatedData);
    }
    public ArrayList<String> getAvailableUsers() {
        return settingStorageData;
    }
    public void resetUserData() {
        settingStorageData.clear();
    }
}
