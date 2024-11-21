public class Circle extends Shape {
  private double radius;
  // private double width;

  public Circle() {
    this.setType("Circle");
    this.radius = 1.0;
  }
  
  public Circle(double radius) {
    this.setType("Circle");
    this.radius = radius;
  }

  public double calcArea() {
    return Math.PI * this.radius * this.radius;
  }

  public double calcPerimeter() {
    return calcCircumference();
  }

  public double calcCircumference() {
    return 2 * Math.PI * this.radius;
  }

  public String toString() {
    String str = "Type: " + this.getType() + "\n";
    str += String.format("Area = %,.2f %n", calcArea());
    str += String.format("Circumference = %,.2f %n", calcPerimeter());
    return str;
  }

}