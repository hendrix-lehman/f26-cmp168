class Dog extends Pet implements Communicator, Comparable<Dog> {
  // member variables
  private String name;
  private double weight;
  private double height;
  private boolean isVaccinated;
  private int ageInDogYears;

  private static int numDogs = 0;
  private int dogNumber;

  // constructors
  public Dog() {
    // this("doggy Doe", 0.0, 0.0, false, 0);
    super();
    this.name = "doggy Doe";
    this.weight = 0.0;
    this.height = 0.0;
    this.isVaccinated = false;
    this.ageInDogYears = 0;
    dogNumber = numDogs;
    numDogs++;
  }

  public Dog(String name) {
    this(name, 0.0, 0.0, false, 0);
  }

  public Dog(String name, double weight, double height) {
    this(name, weight, height, false, 0);
  }

  public Dog(String name, boolean isVaccinated, int age) {
    this(name, 0.0, 0.0, isVaccinated, age);
  }

  public Dog(String name, double weight, double height, boolean isVaccinated, int age) {
    super("dog food", "ball", 5, true);
    this.name = name;
    this.weight = weight;
    this.height = height;
    this.isVaccinated = isVaccinated;
    this.ageInDogYears = age;
    dogNumber = numDogs;
    numDogs++;
  }

  // getter methods
  public String getName() {
    return name;
  }

  public double getWeight() {
    return weight;
  }

  public double getHeight() {
    return height;
  }

  public boolean getIsVaccinated() {
    return isVaccinated;
  }

  public int getAgeInDogYears() {
    return ageInDogYears;
  }

  // setter methods
  public void setName(String name) {
    this.name = name;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public void setIsVaccinated(boolean isVaccinated) {
    this.isVaccinated = isVaccinated;
  }

  public void setAgeInDogYears(int ageInDogYears) {
    this.ageInDogYears = ageInDogYears;
  }

  // override methods
  @Override
  public void play() {
    System.out.println("WOOF! Let's play with " + getFavoriteToy() + "!");
  }

  @Override
  public void eat() {
    System.out.println("Yum! I love eating " + getFavoriteFood() + "!");
  }

  @Override
  public void eat(Food f) {
    System.out.println("Yum! I love eating " + f.getName() + "!");
  }

  @Override
  public double metabolizeFood(Food f) {
    System.out.println("Metabolizing " + f.getName() + "...");
    System.out.println("Calories: " + f.getCalories());
    System.out.println("Metabolism rating: " + METABOLISM_RATING_MEDIUM);
    System.out.println("Calories metabolized: " + f.getCalories() / METABOLISM_RATING_MEDIUM);
    return f.getCalories() / METABOLISM_RATING_MEDIUM;
  }

  @Override
  public void speak() {
    System.out.println("Woof!");
  }

  @Override
  public void speak(String s) {
    System.out.println("Woof! " + s);
  }

  @Override
  public int compareTo(Dog other) {

    if (this.dogNumber > other.dogNumber) {
      return 1;
    } else if (this.dogNumber < other.dogNumber) {
      return -1;
    } 

    return 0;
  }

  @Override
  public String toString() {
    String og = super.toString();
	  String s =  "Dog [name=" + name + ", weight=" + weight + ", height=" + height + ", " ;

	  if(isVaccinated){		//instead of including “true/false” in the returned String
	  	s += "is vaccinated";		
    }else{
	  	s += "is not vaccinated";
	  }

  	s+=	", ageInDogYears=" + ageInDogYears + "]";

    s+= "\n" + og;  //include the toString() of the superclass

  	return s;
  }

  @Override
  public boolean equals(Object obj) {
    boolean og = super.equals(obj);
    if (obj == null) {
      return false;
    }
    if (this == obj) {
      return true;
    }
    // in order for two objects of type Dog to be equal,
    // they must have the same ageInDogYears, isVaccinated status, and name
    // the height and weight must be within 0.05 of each other
    if (obj instanceof Dog) {
      Dog other = (Dog) obj;
      if (this.ageInDogYears == other.ageInDogYears) {
        if (Math.abs(this.height - other.height) < 0.05) {
          if (Math.abs(this.weight - other.weight) < 0.05) {
            if (this.isVaccinated == other.isVaccinated) {
              if (this.name != null && other.name != null) {
                if (this.name.equals(other.name)) {
                  return true;
                }
              }
            }
          }
        }
      }
    }
    return false;
  }

}
