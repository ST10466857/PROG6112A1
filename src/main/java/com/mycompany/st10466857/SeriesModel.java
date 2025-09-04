/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.st10466857;

/**
 *
 * @author lab_services_student
 */

public class SeriesModel {
    // Fields kept public and as Strings to match the brief verbatim
    public String SeriesId;
    public String SeriesName;
    public String SeriesAge;
    public String SeriesNumberOfEpisodes; //Independent Institute of Education, n.d.

    // Convenience constructor for quicker/safer instantiation
    public SeriesModel(String id, String name, String age, String episodes) {
        this.SeriesId = id;
        this.SeriesName = name;
        this.SeriesAge = age;
        this.SeriesNumberOfEpisodes = episodes; //Independent Institute of Education, n.d.
    }

    @Override
    public String toString() {
        return String.format("ID: %s | Name: %s | Age: %s | Episodes: %s",
                SeriesId, SeriesName, SeriesAge, SeriesNumberOfEpisodes); //Independent Institute of Education, n.d.
    }
}

/*
Refrence list
CHAT GPT was consulted for good and neat programming standards
Apache NetBeans. (2024) NetBeans IDE 24 Documentation. Available at: https://netbeans.apache.org/kb/docs/ (Accessed: 4 September 2025).
BrowserStack. n.d. JUnit and automation testing. Available at: https://www.browserstack.com/guide/junit-and-automation-testing [Accessed 4 September 2025].
Independent Institute of Education. (n.d.) [Title of the module or lesson]. Available at: https://mystudies.iie.edu.za/d2l/le/lessons/40467/topics/3551774 (Accessed: 4 September 2025).
*/

