public class Cylinder extends  Figure{

  private float height;
  private float radius;

  public Cylinder(float height, float radius) {
    this.height = height;
    this.radius = radius;
  }

  public float getHeight() {
    return height;
  }

  public void setHeight(float height) {
    this.height = height;
  }

  public float getRadius() {
    return radius;
  }

  public void setRadius(float radius) {
    this.radius = radius;
  }

  @Override
  public float calcVolume() {
    return (float) Math.round(Math.PI * Math.pow(getRadius(), 2) * getHeight() * 100) / 100;
  }

  @Override
  public String toString() {
    return "Cylinder";
  }
}
