package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import play.db.ebean.Model;

@Entity
public class UserRetrival extends Model {

  private static final long serialVersionUID = 1L;

  @Id
  private Long id;
  private Long timestamp = System.currentTimeMillis();

  public static Finder<Long, UserRetrival> find() {
    return new Finder<Long, UserRetrival>(Long.class, UserRetrival.class);
  }

}
