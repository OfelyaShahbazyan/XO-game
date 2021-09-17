package xogame.models;

public class Coordinate {
  public final int x;
  public final int y;

  public Coordinate(int x, int y) {
    if (x < 0 || x > 2 || y < 0 || y > 2) {
      throw new IllegalArgumentException("Coordinate out of bounds");
    }

    this.x = x;
    this.y = y;
  }

  public String toString() {
    return "(" + x + ", " + y + ")";
  }
}
