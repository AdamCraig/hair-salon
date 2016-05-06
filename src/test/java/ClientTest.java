import org.sql2o.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ClientTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

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
}
