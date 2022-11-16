public class Cube extends Figure {

private double edge;

  public Cube(double edge) {
    this.edge = edge;
  }

  public double getEdge() {
    return edge;
  }

  public void setEdge(double edge) {
    this.edge = edge;
  }

  @Override
  public double calcVolume() {
    return Math.round(Math.pow(getEdge(), 3) * 100) / 100.0;
  }

  @Override
  public String toString() {
    return "Cube";
  }
}
