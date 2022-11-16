public class Sphere extends Figure {

  private double radius;

  public Sphere(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public double calcVolume() {
    return Math.round((4/3.0) * Math.PI * Math.pow(getRadius(), 3) * 100) / 100.0;
  }

  @Override
  public String toString() {
    return "Sphere";
  }
}
