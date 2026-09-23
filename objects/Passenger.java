class Passenger {
  private String name;
  private int birthYear;
  private double weight;
  private char gender;
  private int numCarryOn;

  private static int passengerCount = 0;
 
  public Passenger() {
    this.name = "";
    this.birthYear = 1900;
    this.weight = 0.0;
    this.gender = 'u';
    this.numCarryOn = 0;
  }

  public Passenger(String name, int birthYear, double weight, char gender, int numCarryOn) {
    this.name = name;
    this.birthYear = birthYear;
    // this.weight = weight; // TODO: validate weight to be non-negative
    // this.gender = gender; // TODO: should we validate gender to be 'm' or 'f' only?
    // this.numCarryOn = numCarryOn;
    setWeight(weight);
    setGender(gender);
    setNumCarryOn(numCarryOn);
    incrementPassengerCount();
  }

  public int calculateAge(int currentYear) {
    if(currentYear < birthYear) {
      return -1; // Invalid year
    }
    return currentYear - birthYear;
  }

  public void gainWeight() {
    weight += 1.0;
  }

  public void gainWeight(double amount) {
    // what if the input amount is negative? Should we allow that?
    //
    //
    if (amount < 0) {
      System.out.println("Invalid weight gain amount. It must be positive.");
      return;
    }
    weight += amount;
  }

  // getters
  public String getName() {
    return name;
  }

  public int getBirthYear() {
    return birthYear;
  }

  public double getWeight() {
    return weight;
  }

  public char getGender() {
    return gender;
  }

  public int getNumCarryOn() {
    return numCarryOn;
  }

  public boolean isFemale() {
    return gender == 'f';
  }

  public boolean isMale() {
    return gender == 'm';
  }

  public void loseWeight() {
    if (weight > 0) {
      weight -= 1.0;
    } else {
      System.out.println("Weight cannot be negative.");
    }
  }

  public void loseWeight(double amount) {
    if (amount < 0) {
      System.out.println("Invalid weight loss amount. It must be positive.");
      return;
    }
    if (weight - amount < 0) {
      System.out.println("Weight cannot be negative. The amount to lose is too high.");
      return;
    }
    weight -= amount;
  }

  public void printDetails() {
    System.out.printf("Name: %20s | Year of Birth: %4d | Weight: %10.2f | Gender: %c | NumCarryOn: %2d\n",
        name, birthYear, weight, gender, numCarryOn);
  }

  public static int getPassengerCount() {
    return passengerCount;
  }

  private static void incrementPassengerCount() {
    passengerCount++;
  }

  public static void decrementPassengerCount() {
    if (passengerCount > 0) {
      passengerCount--;
    }
  }

  @Override
  public String toString() {
    return String.format("Name: %s, Year of Birth: %d, Weight: %.2f, Gender: %c, NumCarryOn: %d",
        name, birthYear, weight, gender, numCarryOn);
  }

  // setters
  public void setName(String name) {
    this.name = name;
  }

  public void setBirthYear(int birthYear) {
    this.birthYear = birthYear;
  }

  public void setWeight(double weight) {
    // if (weight < 0) {
      // weight = -1.0; // Invalid weight, set to -1.0 to indicate an error
      // return;
    // }
    this.weight = (weight < 0) ? -1 :  weight;
  }

  public void setGender(char gender) {
    // if (gender != 'm' && gender != 'f') {
      // gender = 'u'; // Invalid gender, set to 'u' for unknown
      // return;
    // }
    this.gender = (gender != 'm' && gender != 'f') ? 'u' : gender;
  }

  public void setNumCarryOn(int numCarryOn) {
    if (numCarryOn < 0) {
      this.numCarryOn = 0; // Invalid number of carry-ons, set to 0
    } else if (numCarryOn > 2) {
      this.numCarryOn = 2; // Maximum number of carry-ons is 2
    } else {
      this.numCarryOn = numCarryOn;
    }
  }

}

