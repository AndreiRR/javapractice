package factory;

import java.time.LocalDate;
import phonebook.Contact;
import static org.apache.commons.lang3.RandomStringUtils.*;

/**
 * This class has the scope to generate contact
 */
public class ContactGenerator {

  public ContactGenerator() {
  }

  /**
   * Method to generate random single contact
   *
   * @return single contact
   */
  public Contact generateRandomSingleContact() {
    String firstName = randomAlphabetic(6);
    String lastName = randomAlphabetic(6);
    String phoneNumber = randomNumeric(10);
    String email = randomAlphabetic(3) + "@" + randomAlphabetic(3) + ".com";

    int dayOfBirth = (int) (Math.random() * 27 + 1);
    int monthOfBirth = (int) (Math.random() * 11 + 1);
    int yearOfBirth = (int) (Math.random() * 118 + 1900);

    return new Contact(firstName, lastName, phoneNumber, email,
        LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth));
  }
}
