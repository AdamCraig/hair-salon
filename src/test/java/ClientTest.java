import org.sql2o.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ClientTest {

  @Before
  public void setUp() {
    DB.sql2o = new Sql2o("jdbc:postgresql://localhost:5432/hair_salon_test", null, null);
  }

  @After
  public void tearDown() {
    try(Connection con = DB.sql2o.open()) {
      String deleteClientsQuery = "DELETE FROM clients *;";
      String deleteStylistsQuery = "DELETE FROM stylists *;";
      con.createQuery(deleteClientsQuery).executeUpdate();
      con.createQuery(deleteStylistsQuery).executeUpdate();
    }
  }

  @Test
  public void client_instantiatesCorrectly_true() {
    Client myClient = new Client("Jane");
    assertEquals(true, myClient instanceof Client);
  }

  @Test
  public void getName_clientInstantiatesWithName_String() {
    Client myClient = new Client("Jane");
    assertEquals("Jane", myClient.getName());
  }

  @Test
  public void all_emptyAtFirst() {
    assertEquals(0, Client.all().size());
  }

  @Test
  public void equals_returnsTrueIfNamesAreTheSame() {
    Client firstClient = new Client("Bob");
    Client secondClient = new Client("Bob");
    assertTrue(firstClient.equals(secondClient));
  }

  @Test
  public void save_savesClientIntoDatabase_true() {
    Client myClient = new Client("Dave");
    myClient.save();
    assertTrue(Client.all().get(0).equals(myClient));
  }

  @Test
  public void find_findsClientInDatabase_true() {
    Client myClient = new Client("Bobert");
    myClient.save();
    Client savedClient = Client.find(myClient.getId());
    assertTrue(myClient.equals(savedClient));
  }
}
