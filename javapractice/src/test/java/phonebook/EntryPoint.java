package phonebook;

import java.time.LocalDate;
import java.util.Scanner;

public class EntryPoint {
  private static AddressBook addressBook = new AddressBook();

  public static void main(String[] args) {
    // Create 10 contacts
    addressBook.generateSpecificNumberOfContacts(10);

    // Print contacts to console
    addressBook.printPhoneBook();

    // Remove the 3rd and 8th contacts
    addressBook.deleteContactByIndex();

//    displayMenu();
//    readUserInput();
  }

  /**
   * Method to read user input
   */
  public static void readUserInput() {
    Scanner scan = new Scanner(System.in);

    String s = scan.next();
    int i = scan.nextInt();
  }

  /**
   * Method to print menu options
   */
  public static void displayMenu() {
    Scanner scanner = new Scanner(System.in);


    System.out.println(" 0. Exit. ");
    System.out.println(" 1. Add 10 random contacts. ");
    System.out.println(" 2. Add single random contact. ");
    System.out.println(" 3. Edit contact. ");
    System.out.println(" 4. Delete contact by first name. ");
    System.out.println(" 5. Display all contacts. ");
    System.out.println(" 6. Delete contact by first name. ");
    System.out.println(" 7. Delete all contacts. ");
    System.out.println(" 8. Search contact by first name. ");

    int selectedOption = scanner.nextInt();
    scanner.nextLine();
  }

  /**
   * Method to format contact
   */
  public void formatContact(String firstName, String lastName, String phoneNumber,
      String email, LocalDate dayOfBirth, LocalDate monthOfBirth, LocalDate yearOfBirth) {

    StringBuilder stringBuilder = new StringBuilder();
    System.out.println(
        "Contact with : " + stringBuilder.append("\n").append("\nFIRST NAME: " + firstName)
            .append("\nLAST NAME: " + lastName)
            .append("\n").append("PHONE NO :" + phoneNumber).append("\n").append("EMAIL: " + email)
            .append("\nDAY OF BIRTH: " + dayOfBirth)
            .append("\nMONTH OF BIRTH :" + monthOfBirth)
            .append("\nYEAR OF BIRTH :" + yearOfBirth)
            .append("\n")
            .append("\nwas successfully saved"));
  }
}
