package ai_BasedRecommendationSystem;
//Simple Recommendation System in Java
//This program recommends products based on user's favorite category
//Program runs in a loop until user types END
//Beginner-level Java with simple concepts and comments
import java.util.Scanner;
public class SimpleRecommendation {
 // Method to show recommendations based on category
 public static void showRecommendations(String category) {
     if (category.equalsIgnoreCase("books")) {
         System.out.println("Recommended Books:");
         System.out.println("1. Java Programming Basics");
         System.out.println("2. Learn Data Structures");
         System.out.println("3. Artificial Intelligence Guide");
     } 
     else if (category.equalsIgnoreCase("movies")) {
         System.out.println("Recommended Movies:");
         System.out.println("1. The Social Network");
         System.out.println("2. Iron Man");
         System.out.println("3. The Imitation Game");
     } 
     else if (category.equalsIgnoreCase("games")) {
         System.out.println("Recommended Games:");
         System.out.println("1. Chess");
         System.out.println("2. Cricket 22");
         System.out.println("3. Minecraft");
     } 
     else {
         System.out.println("Sorry! No recommendations available for this category.");
     }
 }
 // Main method (program execution starts here)
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Welcome to Simple Recommendation System!");
     System.out.println("Type END to exit the program.\n");
     while (true) {  // loop runs until user types END
         // Ask user for their interest
         System.out.println("Please enter your favorite category (books/movies/games): ");
         String userChoice = sc.nextLine();
         // Check if user wants to end the program
         if (userChoice.equalsIgnoreCase("END")) {
             System.out.println("Thank you! Exiting Recommendation System...");
             break; // break the loop
         }
         // Show recommendations based on user's choice
         showRecommendations(userChoice);
         System.out.println(); // print empty line for readability
     }
     sc.close(); // close scanner
 }
}
