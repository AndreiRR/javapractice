package phonebook;

import factory.ContactGenerator;
import java.util.ArrayList;
import java.util.List;

public class AddressBook {

  private static List<Contact> contactList = new ArrayList<>();

  /**
   * Method to generate a defined number of random contacts
   */
  public void generateSpecificNumberOfContacts() {
    ContactGenerator contactGenerator = new ContactGenerator();

    for (int i = 0; i < 10; i++) {
      contactList.add(contactGenerator.generateRandomSingleContact());
    }
  }

  /**
   * Method to display address book
   */
  public void printPhoneBook() {
    for (Contact contact : contactList) {
        System.out.println(contact);
    }
  }

  /**
  public void addNewContact() {
    EntryPoint entryPoint = new EntryPoint();
    while (readUserInput() != 0) {

      switch (entryPoint.readUserInput()) {
        // Populate address book with 10 random contacts
        case 1:
          if (contactList.isEmpty()) {
            addRandomContact(10);
            System.out.println("Your phone book contains " + contactList.size() + " contacts");

            printPhoneBook();
            System.out.println();

            displayMenu();
            readUserInput();
          }
      }
  }
}

//
//          // Complete all fields to create a contact
//        case 2:
//          while (selectMenuIndex == 2) {
//            createNewContact();
//            // Add another contact if user input is YES
//            while (selectedOption.equalsIgnoreCase("Yes")) {
//              createNewContact();
//
//              System.out.println("Enter day of birth: ");
//              dayOfBirth = LocalDate.parse(scanner.next());
//
//              System.out.println("Enter your month of birth: ");
//              monthOfBirth = LocalDate.parse(scanner.next());
//
//              System.out.println("Enter your year of birth: ");
//              yearOfBirth = LocalDate.parse(scanner.next());
//
//              // Format contact after is it saved
//              formatContact(firstName, lastName, phoneNumber, email, dayOfBirth, monthOfBirth,
//                  yearOfBirth);
//
//              System.out.println();
//              System.out.println("Would you like to ADD someone else? Yes, No");
//              selectedOption = scanner.next();
//              // if user input is NO
//            }
//            displayMenu();
//            selectedOption = scanner.next();
//            break;
//          }
//          break;
//
//        // Delete all contacts from address book
//        case 7:
//          deletePhoneBook();
//          System.out.println("Your phone book contains " + contactList.size() + " contacts");
//          break;
//
//        // Display address book size
//        case 5:
//          printPhoneBook();
//          System.out.println("Your phone book contains " + contactList.size() + " contacts");
//          displayMenu();
//          selectedOption = scanner.next();
//
//          // Edit contact
//        case 3:
//          while (selectMenuIndex == 3) {
//            printPhoneBook();
//            System.out.println();
//            System.out.println("Enter Last Name which you want to edit: ");
//            String lastNameToBeEdited = scanner.next();
//            editContact(lastNameToBeEdited);
//            System.out.println("Last name " + lastNameToBeEdited + " was successfully edited");
//            // Put edited contact in address book
//            System.out.println("Your phone book contains " + contactList.size() + " contacts");
//            break;
//          }
//
//          // Delete contact by its first name
//        case 4:
//          addRandomContact(5);
//          printPhoneBook();
//          System.out.println();
//          System.out.println("Enter First Name which you want to delete: ");
//          String firstNameForDelete = scanner.next();
//          System.out.println("Your phone book contains " + contactList.size() + " contacts");
//          deleteByFirstName(firstNameForDelete);
//          System.out.println("Your phone book contains " + contactList.size() + " contacts");
//          break;
//
//        // Search contact
//        case 8:
//          addRandomContact(3);
//          printPhoneBook();
//          System.out.println();
//          System.out.println("Search contact by first name");
//          String searchingByFirstName = scanner.next();
//          searchContact(searchingByFirstName);
//          break;
//      }
//      selectMenuIndex = scanner.nextInt();
//    }
//
//    System.out.println("Goodbye!");
//  }
//
//  /**
//   * Method to add new contact
//   */
//  public static void addNewContact(Contact contact) {
//    contactList.add(contact);
//  }
//
//  /**
//   * Method to delete single contact by first name
//   *
//   * @param firstName first name
//   */
//  private static void deleteByFirstName(String firstName) {
//    for (Iterator<Contact> iterator = contactList.iterator(); iterator.hasNext(); ) {
//      Contact temp = iterator.next();
//
//      // Add null checks for proper error handling.
//
//      if (temp.getFirstName().equalsIgnoreCase(firstName)) {
//        iterator.remove();
//        return;
//      }
//    }
//    System.out.println("No contact with first name " + firstName + " was found.");
//  }
//
//  /**
//   * Method to delete all contacts from phone book
//   */
//  public static void deletePhoneBook() {
//    if (!contactList.isEmpty()) {
//      contactList.clear();
//    }
//  }
//
//  /**
//   * Method to edit contact
//   */
//  public static void editContact(String lastName) {
//    Scanner sc = new Scanner(System.in);
//    for (int i = 0; i < contactList.size(); i++) {
//      Contact edit = contactList.get(i);
//      if (lastName.equals(edit.getLastName())) {
//        System.out.println("Enter new last name: ");
//        String newLastName = sc.next();
//        setLastName(newLastName);
//        return;
//      }
//    }
//  }
//
//  /**
//   * Method to edit single contact
//   */
//  public static void searchContact(String firstName) {
//    boolean hasMatch = false;
//    Scanner sc = new Scanner(System.in);
//    for (int i = 0; i < contactList.size(); i++) {
//      Contact edit = contactList.get(i);
//      if (firstName.equals(edit.getFirstName())) {
//        System.out.println("First name found");
//        hasMatch = true;
//        return;
//      } else {
//        System.out.println("Contact searched by its first name not found");
//      }
//    }
//  }

//
//  /**
//   * Method to add random contact
//   */
//  public static void addRandomContact(int contactsNumber) {
//    for (int i = 0; i < contactsNumber; i++) {
//      Contact contact = generateRandomSingleContact();
//      addNewContact(contact);
//    }
//  }
//
//  private static void setLastName(String newLastName) {
//    newLastName = newLastName;
//  }
}

