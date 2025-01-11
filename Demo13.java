import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    String name;
    String phoneNumber;
    String abcId;

    // Constructor to initialize contact details
    public Contact(String name, String phoneNumber, String abcId) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.abcId = abcId;
    }

    // Method to display the contact details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("ABC ID: " + abcId);
        System.out.println();
    }
}

public class Demo13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store contacts
        ArrayList<Contact> contactList = new ArrayList<>();

        // Predefined names
        String[] names = {"Sanjay", "Akhil", "Sathwik", "Bharath", "Akshay"};

        // Loop to take input for 5 individuals
        for (String name : names) {
            System.out.println("Enter details for: " + name);
            
            System.out.print("Enter phone number: ");
            String phoneNumber = scanner.nextLine();
            
            System.out.print("Enter ABC ID: ");
            String abcId = scanner.nextLine();
            
            // Create a new Contact object and add it to the list
            contactList.add(new Contact(name, phoneNumber, abcId));
            System.out.println();
        }

        // Display all contacts with their details
        System.out.println("Contact details:");
        for (Contact contact : contactList) {
            contact.display();
        }

        scanner.close();
    }
}
