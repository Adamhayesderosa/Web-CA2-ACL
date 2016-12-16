package models;

import views.formdata.UserFormData;

import java.util.ArrayList;
import java.util.List;

public class User {
  private long id;
  private String fullName;
  private String phoneNumber;
  private String emailAddress;
  private String message;

  public User() {
  }

  public User(long idIn, String fullNameIn, String phoneNumberIn, String emailAddressIn, String messageIn) {
    setId(id);
    fullName = fullNameIn;
	phoneNumber = phoneNumberIn;
	emailAddress = emailAddressIn;
	message = messageIn;
  }

  private long getId() {
    return id;
  }

  private void setId(long id) {
    this.id = id;
  }

  public String toString() {
    return String.format("[User full name: '%s' Phone number: '%s' Email Address: %s Message: %s]", this.getName(),
        this.get(), this.hobbies, this.level, this.gpa, this.getMajors());
  }

rn the name
   */
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullNameIn) {
	fullName = fullNameIn;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    phoneNumber = phoneNumberIn;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    emailAddress = emailAddressIn;
  }

    public String getMessage() {
    return message;
  }

  public void setMessage(String messageIn) {
    message = messageIn;
  }

  public static UserFormData makeUserFormData(long id) {
    for (User user : allUsers) {
      if (user.getId() == id) {
        return new UserFormData(user.fullName, user.phoneNumber, user.emailAddress, user.message);
      }
    }
    throw new RuntimeException("Couldn't find user");
  }
  

  /**
   * Returns a Student instance created from the form data.
   * Assumes that the formData has been validated.
   * The ID field is not assigned or managed in this application.
   * @param formData The student form data.
   * @return A student instance. 
   */
  public static User makeInstance(UserFormData formData) {
    User user = new User();
    user.fullName = formData.fullName;
    user.phoneNumber = formData.phoneNumber;
	user.emailAddress = formData.emailAddress;
    user.message = formData.message;
    return user;
  }
  
  
  /** Fake a database of User. */
  private static List<User> allUsers = new ArrayList<>();

  //Incase we want to add users.
/*  static {.
    allStudents.add(new Student(1L, "Joe Good", "mypassword", GradeLevel.findLevel("Freshman"), GradePointAverage.findGPA("4.0")));
    // Valid student with optional data.
    allStudents.add(new Student(2L, "Alice Good", "mypassword", GradeLevel.findLevel("Sophomore"), GradePointAverage.findGPA("4.0")));
    getById(2L).addHobby(Hobby.findHobby("Biking"));
    getById(2L).addHobby(Hobby.findHobby("Surfing"));
    getById(2L).addMajor(Major.findMajor("Chemistry"));
    getById(2L).addMajor(Major.findMajor("Physics"));
    // Invalid student. Password is too short.
    allStudents.add(new Student(3L, "Frank Bad", "pass", GradeLevel.findLevel("Freshman"), GradePointAverage.findGPA("4.0")));
  }
 */
 
  public static User getById(long id) {
    for (User student : allUsers) {
      if (user.getId() == id) {
        return user;
      }
    }
    throw new RuntimeException("Couldn't find student");
  }

}