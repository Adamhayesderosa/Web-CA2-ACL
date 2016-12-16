package views.formdata;

//import play.data.validation.ValidationError;

public class StudentFormData {

  public String fullName = "";
  public String phoneNumber = "";
  public String emailAddress = "";
  public String message = "";
  
  public UserFormData() {
  }

  public UserFormData(String fullNameIn, String phoneNumberIn, String emailAddressIn, String messageIn) {
	fullName = fullNameIn;
	phoneNumber = phoneNumberIn;
	emailAddress = emailAddressIn
	message = messageIn;
  }
}