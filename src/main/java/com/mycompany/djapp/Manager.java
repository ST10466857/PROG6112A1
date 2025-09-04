/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.djapp;

import java.util.ArrayList;

/**
 *
 * @author lab_services_student
 */

public class Manager {
    private ArrayList<Equipment> equipmentList = new ArrayList<>();  //Independent Institute of Education, n.d.

    //2)Capture new equipment
    public void captureEquipment(Equipment eq) {
        equipmentList.add(eq);  //Independent Institute of Education, n.d.
    }

    //3)Search equipment by ID
    public Equipment searchEquipment(String id) {
        for (Equipment eq : equipmentList) {
            if (eq.getEquipmentId().equalsIgnoreCase(id)) {
                return eq;
            }
        }
        return null;  //Independent Institute of Education, n.d.
    }

    //4)Update equipment
    public boolean updateEquipment(String id, String newName, double newPrice, int newStock) {
        Equipment eq = searchEquipment(id);
        if (eq != null) {
            eq.setEquipmentName(newName);
            eq.setPrice(newPrice);
            eq.setStock(newStock);
            return true;  //Independent Institute of Education, n.d.
        }
        return false;
    }

    //6) Delete equipment
    public boolean deleteEquipment(String id) {
        Equipment eq = searchEquipment(id);  //Independent Institute of Education, n.d.
        if (eq != null) {
            equipmentList.remove(eq);
            return true;
        }
        return false;
    }

    //5) Report
    public String generateReport() {
        StringBuilder report = new StringBuilder("\nDJ Equipment Inventory Report\n");
        for (Equipment eq : equipmentList) {
            report.append(eq.toString()).append("\n");  //Independent Institute of Education, n.d.
        }
        return report.toString();  //Independent Institute of Education, n.d.
    }
}

/*
Refrence list
Apache NetBeans. (2024) NetBeans IDE 24 Documentation. Available at: https://netbeans.apache.org/kb/docs/ (Accessed: 4 September 2025).
BrowserStack. n.d. JUnit and automation testing. Available at: https://www.browserstack.com/guide/junit-and-automation-testing [Accessed 4 September 2025].
Independent Institute of Education. (n.d.) [Title of the module or lesson]. Available at: https://mystudies.iie.edu.za/d2l/le/lessons/40467/topics/3551774 (Accessed: 4 September 2025).
*/