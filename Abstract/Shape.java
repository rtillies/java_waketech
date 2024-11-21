public abstract class Shape {
  private String type;

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public abstract double calcArea();
  public abstract double calcPerimeter();

  public String toString() {
    String str = "Type: " + this.type + "\n";
    str += String.format("Area = %,.2f %n", calcArea());
    str += String.format("Perimeter = %,.2f %n", calcPerimeter());
    return str;
  }
}