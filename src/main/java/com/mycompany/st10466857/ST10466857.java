/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.st10466857;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class ST10466857 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<SeriesModel> seriesList = new ArrayList<>();
        Series seriesApp = new Series();

        System.out.println("LATEST SERIES - 2025");
        System.out.println("**********************************");
        System.out.println("Enter (1) to launch menu or any other key to exit");

        String input = sc.nextLine().trim();
        if (!input.equals("1")) {
            System.out.println("Exiting application. Goodbye!");
            return;
        }

        while (true) {
            System.out.println("\nTV Series Manager");
            System.err.println("**********************");
            System.out.println("1) Capture a new TV series");
            System.out.println("2) Search for a TV series");
            System.out.println("3) Update a TV series");
            System.out.println("4) Delete a TV series");
            System.out.println("5) View series report");
            System.out.println("6) Exit");
            System.out.print("Select an option (1-6): ");

            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1":
                    seriesApp.CaptureSeries(seriesList, sc);
                    break;
                case "2":
                    seriesApp.SearchSeries(seriesList, sc);
                    break;
                case "3":
                    seriesApp.UpdateSeries(seriesList, sc);
                    break;
                case "4":
                    seriesApp.DeleteSeries(seriesList, sc);
                    break;
                case "5":
                    seriesApp.SeriesReport(seriesList);
                    System.out.print("\nPress ENTER to continue...");
                    sc.nextLine();
                    break;
                case "6":
                    seriesApp.ExitSeriesApplication();
                    return;
                default:
                    System.out.println("Invalid option. Please choose 1–6.");
                    System.out.print("\nPress ENTER to continue...");
                    sc.nextLine(); //Independent Institute of Education, n.d.
            }
        }
    }
}

/*
Refrence list
Apache NetBeans. (2024) NetBeans IDE 24 Documentation. Available at: https://netbeans.apache.org/kb/docs/ (Accessed: 4 September 2025).
BrowserStack. n.d. JUnit and automation testing. Available at: https://www.browserstack.com/guide/junit-and-automation-testing [Accessed 4 September 2025].
Independent Institute of Education. (n.d.) [Title of the module or lesson]. Available at: https://mystudies.iie.edu.za/d2l/le/lessons/40467/topics/3551774 (Accessed: 4 September 2025).
*/
