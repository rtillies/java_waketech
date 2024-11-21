package sandbox;

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

  /* Private Methods */
  private boolean hasID() {
    return this.id != null;
  }

  // private boolean noIDerror() {
  //   if (this.id != null) {
  //     System.err.println("** This car has no ID");
  //     return true;
  //   }
  //   return false;
  // }

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
  /* 
   * returns positive number if this car value > other car value
   * returns negative number if this car value < other car value
   * returns zero if this car value == other car value
   */
  int compareMPG(Car otherCar) {
    int value = this.getMpg();
    int otherValue = otherCar.getMpg();
    if (value > otherValue) return 1;
    else if (value == otherValue) return 0;
    else return -1;
    // return this.getMpg() - otherCar.getMpg();
  }

  int compareMiles(Car otherCar) {
    int value = this.getMileage();
    int otherValue = otherCar.getMileage();
    if (value > otherValue) return 1;
    else if (value == otherValue) return 0;
    else return -1;
    // return this.getMileage() - otherCar.getMileage();
  }

  int comparePrice(Car otherCar) {
    double value = this.getSalesPrice();
    double otherValue = otherCar.getSalesPrice();
    if (value > otherValue) return 1;
    else if (value == otherValue) return 0;
    else return -1;
    // return (int)(this.getSalesPrice() - otherCar.getSalesPrice());
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
    if (!hasID()) {
      System.err.println("** This car has no ID");
    } else if (this.mpg > 0) {
      System.err.println("** Cannot change MPG on " + this.id);
    } else {
      this.mpg = mpg;
    }
  }

  public void setCost(double cost) {
    if (!hasID()) {
      System.err.println("** This car has no ID");
    } else if (this.cost > 0) {
      System.err.println("** Cannot change cost on " + this.id);
    } else {
      this.cost = cost;
    }
  }

  public void setSalesPrice(double salesPrice) {
    if (!hasID()) {
      System.err.println("** This car has no ID");
    } else {
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
    str += String.format("Cost:        $%,10.2f %n", this.cost);
    str += "Sold?        " + (this.sold ? "Yes" : "No") + "\n";

    if(isSold()) {
      str += String.format("Sales Price: $%,10.2f %n", this.salesPrice);
      str += String.format("Price Sold:  $%,10.2f %n", this.priceSold);
      str += String.format("Profit:      $%,10.2f %n", this.profit);
    }

    return str;
  }
}