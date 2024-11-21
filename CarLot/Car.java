
public class Car {
  
  private String id;
  private int mileage;
  private int mpg;
  private double cost;
  private double salesPrice;
  private boolean sold;
  private double priceSold;
  private double profit;

  /* CONSTRUCTORS */
  public Car() {}

  public Car(String id, int mileage, int mpg, double cost, double salesPrice) {
    this.id = id;
    this.mileage = mileage;
    this.mpg = mpg;
    this.cost = cost;
    this.salesPrice = salesPrice;
    this.sold = false;
    this.priceSold = 0.0;
    this.profit = 0.0;
  }

  /* ACCESSORS */
  public String getID() {
    return this.id;
  }

  public int getMileage() {
    return this.mileage;
  }

  public int getMpg() {
    return this.mpg;
  }

  public double getCost() {
    return this.cost;
  }

  public double getSalesPrice() {
    return this.salesPrice;
  }

  public boolean isSold() {
    return this.sold;
  }

  public double getPriceSold() {
    return this.priceSold;
  }

  public double getProfit() {
    return this.profit;
  }

  /* COMPARATORS */
  public int compareMPG(Car otherCar) {
    return this.mpg - otherCar.mpg;
  }

  public int compareMiles(Car otherCar) {
    return this.mileage - otherCar.mileage;
  }

  public int comparePrice(Car otherCar) {
    return (int)(this.salesPrice - otherCar.salesPrice);
  }
  /* MUTATORS */
  public void setID(String id) {
    this.id = id;
  }

  public void setMileage(int mileage) {
    this.mileage = mileage;
  }

  public void setMPG(int mpg) {
    this.mpg = mpg;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  public void setSalesPrice(double salesPrice) {
    this.salesPrice = salesPrice;
  }

  public void sellCar(double priceSold) {
    if (this.cost > 0) {
      this.sold = true;
      this.priceSold = priceSold;
      this.profit = this.priceSold - this.cost;
    }
  }
  
  /* toString method */
  public String toString() {
    String str = "";
    str += "Car ID:  " + this.id + "\n";
    str += "Mileage: " + this.mileage + "\n";
    str += "MPG:     " + this.mpg + "\n";
    str += String.format("Cost: $%,.2f %n", this.cost);
    str += "Sold? " + (this.sold ? "Yes" : "No") + "\n";

    if(isSold()) {
      str += String.format("Sales Price: $%,.2f %n", this.salesPrice);
      str += String.format("Price Sold: $%,.2f %n", this.priceSold);
      str += String.format("Profit: $%,.2f %n", this.profit);
    }

    return str;
  }
}