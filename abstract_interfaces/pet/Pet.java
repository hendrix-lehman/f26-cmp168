abstract class Pet implements FoodEater {

  // member variables
  private String favoriteFood;
  private String favoriteToy;
  private int maintenanceLevel;
  private boolean goesOutside;

  // constructors
  public Pet() {
    // this() calls the constructor with parameters, passing default values
    this("unknown food", "unknown toy", 0, false);
    // this.favoriteFood = "unknown food";
    // this.favoriteToy = "unknown toy";
    // this.maintenanceLevel = 0;
    // this.goesOutside = false;
  }

  public Pet(String favoriteFood, String favoriteToy, int maintenanceLevel, boolean goesOutside) {
    this.favoriteFood = favoriteFood;
    this.favoriteToy = favoriteToy;
    this.maintenanceLevel = maintenanceLevel;
    this.goesOutside = goesOutside;
  }

  // abstract methods
  public abstract void play();

  // getter methods
  public String getFavoriteFood() {
    return favoriteFood;
  }

  public String getFavoriteToy() {
    return favoriteToy;
  }

  public int getMaintenanceLevel() {
    return maintenanceLevel;
  }

  public boolean goesOutside() {
    return goesOutside;
  }

  // setter methods
  public void setFavoriteFood(String favoriteFood) {
    this.favoriteFood = favoriteFood;
  }

  public void setFavoriteToy(String favoriteToy) {
    this.favoriteToy = favoriteToy;
  }

  public void setMaintenanceLevel(int maintenanceLevel) {
    this.maintenanceLevel = maintenanceLevel;
  }

  public void setGoesOutside(boolean goesOutside) {
    this.goesOutside = goesOutside;
  }

  // override methods
  @Override
  public String toString() {
    return String.format("Favorite Food: %s, Favorite Toy: %s, Maintenance Level: %d, Goes Outside: %b",
        favoriteFood, favoriteToy, maintenanceLevel, goesOutside);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    if (this == obj) {
      return true;
    }
    // TODO: fix casting issue
    Pet other = (Pet) obj;
    return favoriteFood.equals(other.favoriteFood) &&
        favoriteToy.equals(other.favoriteToy) &&
        maintenanceLevel == other.maintenanceLevel &&
        goesOutside == other.goesOutside;
  }

}

