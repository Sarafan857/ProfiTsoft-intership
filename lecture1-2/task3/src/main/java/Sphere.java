public class Sphere extends Figure {

  private float radius;

  public Sphere(float radius) {
    this.radius = radius;
  }

  public float getRadius() {
    return radius;
  }

  public void setRadius(float radius) {
    this.radius = radius;
  }

  @Override
  public float calcVolume() {
    return (float) Math.round((4/3.0) * Math.PI * Math.pow(getRadius(), 3) * 100) / 100;
  }

  @Override
  public String toString() {
    return "Sphere";
  }
}
