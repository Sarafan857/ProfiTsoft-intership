public class Cube extends Figure {

  private float edge;

  public Cube(float edge) {
    this.edge = edge;
  }

  public float getEdge() {
    return edge;
  }

  public void setEdge(float edge) {
    this.edge = edge;
  }

  @Override
  public float calcVolume() {
    return (float) Math.round(Math.pow(getEdge(), 3) * 100) / 100;
  }

  @Override
  public String toString() {
    return "Cube";
  }
}
