import java.util.List;
import org.sql2o.*;

public class Stylist {
  private int id;
  private String name;

  public Stylist(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  public static List<Stylist> all() {
    String sql = "SELECT * FROM stylists;";
    try(Connection con = DB.sql2o.open()) {
      return con.createQuery(sql)
      .executeAndFetch(Stylist.class);
    }
  }
}
