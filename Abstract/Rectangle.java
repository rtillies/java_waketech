public class Rectangle extends Shape {
  private double length;
  private double width;
  
  public Rectangle() {
    this.setType("Rectangle");
    this.length = 1.0;
    this.width = 2.0;
  }
  
  public Rectangle(double length, double width) {
    this.setType("Rectangle");
    this.length = length;
    this.width = width;
  }

  public double calcArea() {
    return this.length * this.width;
  }

  public double calcPerimeter() {
    return 2 * this.length + 2 * this.width;
  }
}