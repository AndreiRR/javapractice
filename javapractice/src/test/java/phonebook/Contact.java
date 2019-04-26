package phonebook;

import java.time.LocalDate;

public class Contact {

  private String firstName;
  private String lastName;
  private String phoneNumber;
  private String email;
  private LocalDate dateOfBirth;

  // Custom constructor
  public Contact(String firstName,String lastName,String phoneNo,String email,LocalDate dateOfBirth) {
    setFirstName(firstName);
    setLastName(lastName);
    setPhoneNumber(phoneNo);
    setEmail(email);
    setDateOfBirth(dateOfBirth);
  }

  // Implicit constructor
  public Contact() {
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
  this.lastName = lastName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  @Override
  public String toString() {
    return "Contact{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        ", email='" + email + '\'' +
        ", day='" + dateOfBirth.getDayOfMonth() + '\'' +
        ", month='" + dateOfBirth.getMonth() + '\'' +
        ", year='" + dateOfBirth.getYear() + '\'' +
        '}';
  }
}