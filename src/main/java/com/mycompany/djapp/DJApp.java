/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.djapp;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */

public class DJApp {
    private static Manager manager = new Manager();  //Independent Institute of Education, n.d.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nDJ Equipment Store Menu");
            System.out.println("1) Add Equipment");
            System.out.println("2) Search Equipment");
            System.out.println("3) Update Equipment");
            System.out.println("4) Delete Equipment");
            System.out.println("5) View Report");
            System.out.println("6) Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); //Independent Institute of Education, n.d.

            switch (choice) {
                case 1:
                    System.out.print("Enter Equipment ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter Stock: ");
                    int stock = sc.nextInt();
                    sc.nextLine();
                    manager.captureEquipment(new Equipment(id, name, price, stock));
                    System.out.println("Equipment added successfully.");
                    break; //Independent Institute of Education, n.d.

                case 2:
                    System.out.print("Enter Equipment ID to search: ");
                    String searchId = sc.nextLine();
                    Equipment found = manager.searchEquipment(searchId);
                    System.out.println(found != null ? found : "Equipment not found.");
                    break; //Independent Institute of Education, n.d.

                case 3:
                    System.out.print("Enter Equipment ID: ");
                    String updateId = sc.nextLine();
                    System.out.print("New Name: ");
                    String newName = sc.nextLine();
                    System.out.print("New Price: ");
                    double newPrice = sc.nextDouble();
                    System.out.print("New Stock: ");
                    int newStock = sc.nextInt();
                    sc.nextLine();
                    boolean updated = manager.updateEquipment(updateId, newName, newPrice, newStock);
                    System.out.println(updated ? "Updated successfully." : "Not found.");
                    break;  //Independent Institute of Education, n.d.

                case 4:
                    System.out.print("Enter Equipment ID to delete: ");
                    String delId = sc.nextLine();
                    boolean deleted = manager.deleteEquipment(delId);
                    System.out.println(deleted ? "Deleted successfully." : "Not found.");
                    break;  //Independent Institute of Education, n.d.

                case 5:
                    System.out.println(manager.generateReport());
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);

        sc.close();  //Independent Institute of Education, n.d.
    }
}

/*
Refrence list
CHAT GPT was consulted for good and neat programming standards
Apache NetBeans. (2024) NetBeans IDE 24 Documentation. Available at: https://netbeans.apache.org/kb/docs/ (Accessed: 4 September 2025).
BrowserStack. n.d. JUnit and automation testing. Available at: https://www.browserstack.com/guide/junit-and-automation-testing [Accessed 4 September 2025].
Independent Institute of Education. (n.d.) [Title of the module or lesson]. Available at: https://mystudies.iie.edu.za/d2l/le/lessons/40467/topics/3551774 (Accessed: 4 September 2025).
*/
