import java.util.Scanner;

public class StudentRegistration {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Enter surname and initials: ");
        String nameInput = input.nextLine();
        
        System.out.print("Enter student number: ");
        String studentNumber = input.nextLine();
        
       
        boolean isValid = true;
        
        
        if (studentNumber.length() != 8) {
            isValid = false;
        } else {
            
            for (int i = 0; i < studentNumber.length(); i++) {
                if (!Character.isDigit(studentNumber.charAt(i))) {
                    isValid = false;
                    break;
                }
            }
        }
        
        // Process based on validation
        if (isValid) {
            // Extract surname (part before the space)
            String surname = "";
            int spacePos = nameInput.indexOf(" ");
            
            if (spacePos != -1) {
                surname = nameInput.substring(0, spacePos);
            } else {
                surname = nameInput;
            }
            
            // Create username
            String username = surname.toLowerCase() + "@tut4life.ac.za";
            
            // Display output EXACTLY as shown in the sample
            System.out.println("\nStudent Details");
            System.out.println("Surname and Initials: " + nameInput.toUpperCase());
            System.out.println("Student Number: " + studentNumber);
            System.out.println("Username: " + username);
            
        } else {
            // Display error message
            System.out.println("\nInvalid student number! It must contain exactly 8 digits.");
        }
        
        input.close();
    }
}