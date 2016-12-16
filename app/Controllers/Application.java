package controllers;

import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.formdata.UserFormData;
import views.html.Index;

public class Application extends Controller {

  public static Result getIndex(long id) {
    StudentFormData studentData = (id == 0) ? new StudentFormData() : models.Student.makeStudentFormData(id);
    Form<StudentFormData> formData = Form.form(StudentFormData.class).fill(studentData);
    return ok(Index.render(
      formData
    ));
  }

  public static Result postIndex() {

    // Get the submitted form data from the request object, and run validation.
    Form<UserFormData> formData = Form.form(UserFormData.class).bindFromRequest();

    if (formData.hasErrors()) {
      // Don't call formData.get() when there are errors, pass 'null' to helpers instead. 
      flash("error", "Please correct errors above.");
      return badRequest(Index.render(formData));
    }
    else {
      // Convert the formData into a Student model instance.
      User user = User.makeInstance(formData.get());
      flash("success", "User instance created/edited: " + user);
      return ok(Index.render(formData));
    }
  }
}
