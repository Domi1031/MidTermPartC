import java.util.Scanner;

public class TestUserProfile {
    public static void main(String[] args) {
        // Display the available genres
        System.out.println("Available Genres:");
        System.out.println("1. Action");
        System.out.println("2. Comedy");
        System.out.println("3. Drama");
        System.out.println("4. Fantasy");
        System.out.println("5. Sci-Fi");
        
        // Prompt the user for their name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Prompt the user to choose their favorite genre
        System.out.print("Choose your favorite genre (enter the corresponding number): ");
        int genreChoice = scanner.nextInt();
        
        // Convert the genre choice into the corresponding genre
        String genre;
        switch (genreChoice) {
            case 1:
                genre = "Action";
                break;
            case 2:
                genre = "Comedy";
                break;
            case 3:
                genre = "Drama";
                break;
            case 4:
                genre = "Fantasy";
                break;
            case 5:
                genre = "Sci-Fi";
                break;
            default:
                genre = "Unknown";
        }
        
        // Display the user's profile
        System.out.println("\nUser Profile created!");
        System.out.println("Name: " + name);
        System.out.println("Favorite Genre: " + genre);
    }
}

