package xogame.game_over;

import xogame.models.Coordinate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CoordinateTest {
  @Test
  public void theXCannotBeNegative() {
    assertThrows(IllegalArgumentException.class, () -> new Coordinate(-1, 0));
  }

  @Test
  public void theYCannotBeNegative() {
    assertThrows(IllegalArgumentException.class, () -> new Coordinate(0, -1));
  }

  @Test
  public void theXCannotBeGreaterThan2() {
    assertThrows(IllegalArgumentException.class, () -> new Coordinate(3, 0));
  }

  @Test
  public void theYCannotBeGreaterThan2() {
    assertThrows(IllegalArgumentException.class, () -> new Coordinate(0, 3));
  }

  @Test
  public void theStringRepresentationOfTheCoordinateMustBeTheCoordinatesInParentsWithCommas() {
    assertEquals("(0, 0)", new Coordinate(0, 0).toString());
  }
}
