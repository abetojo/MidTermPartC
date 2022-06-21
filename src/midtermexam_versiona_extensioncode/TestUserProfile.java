/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package midtermexam_versiona_extensioncode;

/**
 * SYST17796 Fundamentals of Software Design and Development
 * @author Joshua Abeto
 */
import java.util.Scanner;

public class TestUserProfile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = getInput(input, "Enter your name: ");
        String favGenre = getInput(input, "Enter your favourite genre: ");
        UserProfile user = new UserProfile(name, favGenre);
        displayObject(user);
    }

    public static String getInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }

    public static void displayObject(UserProfile object) {
        System.out.println("Your User Profile have been created");
        System.out.println("Your name is: " + object.getUserID() + 
                "\nYour favourite genre is: " + object.getGenre());
    }
}
