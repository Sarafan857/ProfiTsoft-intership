public class Cylinder extends  Figure{

  private double height;
  private double radius;

  public Cylinder(double height, double radius) {
    this.height = height;
    this.radius = radius;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public double calcVolume() {
    return Math.round(Math.PI * Math.pow(getRadius(), 2) * getHeight() * 100) / 100.0;
  }

  @Override
  public String toString() {
    return "Cylinder";
  }
}
