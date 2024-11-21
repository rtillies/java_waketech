public class ShapeDemo {

  public static void main(String[] args) {
    Shape rect = new Rectangle(4, 5);
    Shape circle = new Circle(2.5);
    Shape triangle = new Triangle(5, 12, 13);

    System.out.println(rect);
    System.out.println(circle);
    System.out.println(triangle);
  }
}