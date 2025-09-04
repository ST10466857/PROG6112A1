/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.st10466857;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */

public class Series {

    //1) Capture a new TV series
    public void CaptureSeries(List<SeriesModel> seriesList, Scanner sc) {
        System.out.println("\nCapture New TV Series");
        System.out.println("*************************");

        //ID (required, unique)
        String id;
        while (true) {
            System.out.print("Enter Series ID: ");
            id = sc.nextLine().trim();
            if (id.isEmpty()) {
                System.out.println("This field cannot be empty. Please try again.");
                continue;
            }
            boolean exists = false;
            for (SeriesModel s : seriesList) {
                if (s.SeriesId.equalsIgnoreCase(id)) { exists = true; break; }
            }
            if (exists) {
                System.out.println("That ID already exists. Please enter a unique ID.");
            } else break;
        }

        //Name (required)
        String name;
        while (true) {
            System.out.print("Enter Series Name: ");
            name = sc.nextLine().trim();
            if (name.isEmpty()) {
                System.out.println("This field cannot be empty. Please try again.");
            } else break;
        }

        //Age (required, numeric 2–18)
        String age;
        while (true) {
            System.out.print("Enter Age Restriction: ");
            age = sc.nextLine().trim();
            boolean numeric = !age.isEmpty();
            for (int i = 0; i < age.length(); i++) if (!Character.isDigit(age.charAt(i))) { numeric = false; break; }
            if (!numeric) { System.out.println("Invalid input. Age restriction must be a NUMBER."); continue; }
            int val = Integer.parseInt(age);
            if (val < 2 || val > 18) { System.out.println("Invalid range. Valid range is 2–18."); continue; }
            age = String.valueOf(val);
            break;
        }

        //Episodes (required, positive integer)
        String episodes;
        while (true) {
            System.out.print("Enter Number of Episodes: ");
            episodes = sc.nextLine().trim();
            boolean numeric = !episodes.isEmpty();
            for (int i = 0; i < episodes.length(); i++) if (!Character.isDigit(episodes.charAt(i))) { numeric = false; break; }
            if (!numeric) { System.out.println("Invalid input. Please enter a NUMBER."); continue; }
            int val = Integer.parseInt(episodes);
            if (val < 1) { System.out.println("Value must be POSITIVE."); continue; }
            episodes = String.valueOf(val);
            break;
        }

        seriesList.add(new SeriesModel(id, name, age, episodes));
        System.out.println("\nSeries details have been successfully saved.");
        System.out.print("\nPress ENTER to continue...");
        sc.nextLine();
    }

    //2) Search for a series by ID
    public void SearchSeries(List<SeriesModel> seriesList, Scanner sc) {
        System.out.println("\nSearch Series");
        System.out.println("*************************");
        System.out.print("Enter Series ID to search: ");
        String id = sc.nextLine().trim();

        SeriesModel found = null;
        for (SeriesModel s : seriesList) {
            if (s.SeriesId.equalsIgnoreCase(id)) { found = s; break; }
        }

        if (found != null) {
            System.out.println("\nSeries found:");
            System.out.println("Series ID            : " + found.SeriesId);
            System.out.println("Series Name          : " + found.SeriesName);
            System.out.println("Age Restriction      : " + found.SeriesAge);
            System.out.println("Number of Episodes   : " + found.SeriesNumberOfEpisodes);
        } else {
            System.out.println("\nNo series data could be found for ID: " + id);
        }
        System.out.print("\nPress ENTER to continue...");
        sc.nextLine(); //Independent Institute of Education, n.d.
    }

    //3) Update a series
    public void UpdateSeries(List<SeriesModel> seriesList, Scanner sc) {
        System.out.println("\nUpdate Series");
        System.out.println("*************************");
        System.out.print("Enter Series ID to update: ");
        String id = sc.nextLine().trim();

        SeriesModel found = null;
        for (SeriesModel s : seriesList) {
            if (s.SeriesId.equalsIgnoreCase(id)) { found = s; break; }
        }

        if (found == null) {
            System.out.println("\nNo series data could be found for ID: " + id);
            System.out.print("\nPress ENTER to continue...");
            sc.nextLine();
            return;
        }

        System.out.println("\nCurrent details:");
        System.out.println("Series ID            : " + found.SeriesId);
        System.out.println("Series Name          : " + found.SeriesName);
        System.out.println("Age Restriction      : " + found.SeriesAge);
        System.out.println("Number of Episodes   : " + found.SeriesNumberOfEpisodes);
        System.out.println("\nPress ENTER to keep the current value shown in [brackets].");

        //Name (optional)
        System.out.print("Enter Series Name [" + found.SeriesName + "]: ");
        String newName = sc.nextLine().trim();
        if (!newName.isEmpty()) found.SeriesName = newName;

        //Age (optional, numeric 2–18)
        while (true) {
            System.out.print("Enter Age Restriction [" + found.SeriesAge + "]: ");
            String newAge = sc.nextLine().trim();
            if (newAge.isEmpty()) break;
            boolean numeric = true;
            for (int i = 0; i < newAge.length(); i++) if (!Character.isDigit(newAge.charAt(i))) { numeric = false; break; }
            if (!numeric) { System.out.println("Invalid input. Age restriction must be a NUMBER."); continue; }
            int val = Integer.parseInt(newAge);
            if (val < 2 || val > 18) { System.out.println("Invalid range. Valid range is 2–18."); continue; }
            found.SeriesAge = String.valueOf(val);
            break;
        }

        //Episodes (optional, positive int)
        while (true) {
            System.out.print("Enter Number of Episodes [" + found.SeriesNumberOfEpisodes + "]: ");
            String newEp = sc.nextLine().trim();
            if (newEp.isEmpty()) break;
            boolean numeric = true;
            for (int i = 0; i < newEp.length(); i++) if (!Character.isDigit(newEp.charAt(i))) { numeric = false; break; }
            if (!numeric) { System.out.println("Invalid input. Episodes must be a NUMBER."); continue; }
            int val = Integer.parseInt(newEp);
            if (val < 1) { System.out.println("Value must be POSITIVE."); continue; }
            found.SeriesNumberOfEpisodes = String.valueOf(val);
            break;
        }

        System.out.println("\nSeries successfully updated.");
        System.out.print("\nPress ENTER to continue...");
        sc.nextLine(); //Independent Institute of Education, n.d.
    }

    //4)Delete a series
    public void DeleteSeries(List<SeriesModel> seriesList, Scanner sc) {
        System.out.println("\nDelete Series");
        System.out.println("*************************");
        System.out.print("Enter Series ID to delete: ");
        String id = sc.nextLine().trim();

        SeriesModel found = null;
        for (SeriesModel s : seriesList) {
            if (s.SeriesId.equalsIgnoreCase(id)) { found = s; break; }
        }

        if (found == null) {
            System.out.println("\nNo series data could be found for ID: " + id);
            System.out.print("\nPress ENTER to continue...");
            sc.nextLine();
            return;
        }

        System.out.println("\nFound:");
        System.out.println("ID: " + found.SeriesId + " | Name: " + found.SeriesName +
                " | Age: " + found.SeriesAge + " | Episodes: " + found.SeriesNumberOfEpisodes);

        System.out.print("\nAre you sure you want to delete this series? (Y/N): ");
        String confirm = sc.nextLine().trim().toUpperCase();
        if (confirm.equals("Y")) {
            seriesList.remove(found);
            System.out.println("Series successfully deleted.");
        } else {
            System.out.println("Delete cancelled.");
        }
        System.out.print("\nPress ENTER to continue...");
        sc.nextLine(); //Independent Institute of Education, n.d.
    }

    //5) Display a report
    public void SeriesReport(java.util.List<SeriesModel> seriesList) {
        System.out.println();
        if (seriesList.isEmpty()) {
            System.out.println("No series captured yet.");
            return;
        }

        for (int i = 0; i < seriesList.size(); i++) {
            SeriesModel s = seriesList.get(i);
            System.out.println("Series " + (i + 1));
            System.out.println("----------------------------------------------------");
            System.out.println("SERIES ID: " + s.SeriesId);
            System.out.println("SERIES NAME: " + s.SeriesName);
            System.out.println("SERIES AGE RESTRICTION: " + s.SeriesAge);
            System.out.println("NUMBER OF EPISODES: " + s.SeriesNumberOfEpisodes);
            System.out.println("----------------------------------------------------");
        }
    }

    //6) Exit
    public void ExitSeriesApplication() {
        System.out.println("\nExiting application. Goodbye!");
    }
}

/*
Refrence list
CHAT GPT was consulted for good and neat programming standards
Apache NetBeans. (2024) NetBeans IDE 24 Documentation. Available at: https://netbeans.apache.org/kb/docs/ (Accessed: 4 September 2025).
BrowserStack. n.d. JUnit and automation testing. Available at: https://www.browserstack.com/guide/junit-and-automation-testing [Accessed 4 September 2025].
Independent Institute of Education. (n.d.) [Title of the module or lesson]. Available at: https://mystudies.iie.edu.za/d2l/le/lessons/40467/topics/3551774 (Accessed: 4 September 2025).
*/
