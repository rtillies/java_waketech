public class Triangle extends Shape {
  // private double base;
  // private double height;
  private double side1;
  private double side2;
  private double side3;
    
  public Triangle() {
    this.setType("Triangle");
    this.side1 = this.side2 = this.side3 = 2.0;
  }
  
  public Triangle(double side1, double side2, double side3) {
    this.setType("Triangle");
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  /*
  * In order to find the area of triangle with 3 sides, we use the Heron's Formula. 
  * Using this, the area of a triangle (A) with 3 sides a, b, and c is calculated using the formula
  * A = √[s(s-a)(s-b)(s-c)], where 's' is the semi-perimeter of the triangle given by s = (a + b + c)/2.
  */
  
  public double calcArea() {
    // return this.base * this.height / 2;
    double semi = calcPerimeter() / 2;
    return Math.sqrt(semi * (semi - side1) * (semi - side2) * (semi - side3));

  }

  public double calcPerimeter() {
    return this.side1 + this.side2 + this.side3;
  }
}