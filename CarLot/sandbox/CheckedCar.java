package sandbox;

public class CheckedCar {
  
  private String id;
  private int mileage;
  private int mpg;
  private double cost;
  private double salesPrice;
  private boolean sold;
  private double priceSold;
  private double profit;

  /* CONSTRUCTORS */
  public CheckedCar() {}

  public CheckedCar(String id, int mileage, int mpg, double cost, double salesPrice) {
    this.id = id;
    this.mileage = mileage;
    this.mpg = mpg;
    this.cost = cost;
    this.salesPrice = salesPrice;
    this.sold = false;
    this.priceSold = 0.0;
    this.profit = 0.0;
  }

  /* Private Methods */
  private boolean hasID() {
    return this.id != null;
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
  int compareMPG(CheckedCar otherCar) {
    return this.mpg - otherCar.mpg;
  }

  int compareMiles(CheckedCar otherCar) {
    return this.mileage - otherCar.mileage;
  }

  int comparePrice(CheckedCar otherCar) {
    return (int)(this.salesPrice - otherCar.salesPrice);
  }

  /* MUTATORS */
  public void setID(String id) {
    if (!hasID()) {
      this.id = id;
    }
    System.err.println("** ID Exists: " + this.id);
  }

  public void setMileage(int mileage) {
    if (!hasID()) {
      System.err.println("** This car has no ID");
    } else if (this.mileage > 0) {
      System.err.println("** Cannot change mileage on " + this.id);
    } else {
      this.mileage = mileage;
    }
  }

  public void setMPG(int mpg) {
    if (hasID() && this.mpg <= 0) {
      this.mpg = mpg;
    }
  }

  public void setCost(double cost) {
    if (hasID() && this.cost <= 0) {
      this.cost = cost;
    }
  }

  public void setSalesPrice(double salesPrice) {
    if(hasID()) {
      this.salesPrice = salesPrice;
    }
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
    str += "Car ID:      " + this.id + "\n";
    str += "Mileage:     " + this.mileage + "\n";
    str += "MPG:         " + this.mpg + "\n";
    // str += "Car ID:  " + this.id + "\n";
    // str += "Mileage: " + this.mileage + "\n";
    // str += "MPG:     " + this.mpg + "\n";
    str += String.format("Cost:        $%,10.2f %n", this.cost);
    str += "Sold?        ";
    str += (this.sold ? "Yes" : "No") + "\n";

    if(isSold()) {
      str += String.format("Sales Price: $%,10.2f %n", this.salesPrice);
      str += String.format("Price Sold:  $%,10.2f %n", this.priceSold);
      str += String.format("Profit:      $%,10.2f %n", this.profit);
    }

    return str;
  }
}