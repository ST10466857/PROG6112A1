/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.djapp;

/**
 *
 * @author lab_services_student
 */

//Independent Institute of Education, n.d.
public class Equipment {
    private String equipmentId;
    private String equipmentName;
    private double price;
    private int stock;

    //Constructor
    public Equipment(String equipmentId, String equipmentName, double price, int stock) {
        this.equipmentId = equipmentId;
        this.equipmentName = equipmentName;
        this.price = price;
        this.stock = stock;
    }

    //Getters & Setters
    public String getEquipmentId() { return equipmentId; }
    public void setEquipmentId(String equipmentId) { this.equipmentId = equipmentId; }

    public String getEquipmentName() { return equipmentName; }
    public void setEquipmentName(String equipmentName) { this.equipmentName = equipmentName; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    @Override
    public String toString() {
        return "ID: " + equipmentId + " | Name: " + equipmentName +
               " | Price: R" + price + " | Stock: " + stock;
    }
}

/*
Refrence list
Apache NetBeans. (2024) NetBeans IDE 24 Documentation. Available at: https://netbeans.apache.org/kb/docs/ (Accessed: 4 September 2025).
BrowserStack. n.d. JUnit and automation testing. Available at: https://www.browserstack.com/guide/junit-and-automation-testing [Accessed 4 September 2025].
Independent Institute of Education. (n.d.) [Title of the module or lesson]. Available at: https://mystudies.iie.edu.za/d2l/le/lessons/40467/topics/3551774 (Accessed: 4 September 2025).
*/
