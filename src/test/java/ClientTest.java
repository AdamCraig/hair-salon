import org.sql2o.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ClientTest {

  @Test
  public void client_instantiatesCorrectly_true() {
    Client myClient = new Client("Jane");
    assertEquals(true, myClient instanceof Client);
  }
}
