class Patient {

  // member variables, fields, attributes or properties
  private static int numPatients = 0;
  private String name;
  private int birthYear;
  private int patientNumber;
  private String ailment;

  // constructor
  public Patient(String name, int birthYear, String ailment) {
    this.name = name;
    this.birthYear = birthYear;
    this.ailment = ailment;
    numPatients++;
    this.patientNumber = numPatients;
  }

  // getters
  public String getName() {
    return name;
  }

  public int getBirthYear() {
    return birthYear;
  }

  public int getPatientNumber() {
    return patientNumber;
  }

  public String getAilment() {
    return ailment;
  }

  @Override
  public String toString() {
    String output = String.format(
      "Patient [name= %20s | birthYear= %04d | patient number= %06d | ailment= %20s\n", 
      name, birthYear, patientNumber, ailment
    );
    System.out.println(output);
    return output;
  }

  @Override
  public boolean equals(Object obj) {
    // the object passed in may be null, so we need to check for that first
    if (obj == null) {
      return false;
    }

    // if it is not null, then it may be the same object
    // if this object and the obj passed in are the same object, return true
    if (this == obj) {
      return true;
    }

    // if it is not the same object, then same type but different equality parameters 
    if (obj instanceof Patient) {
      Patient other = (Patient) obj;
      return this.name.equals(other.name) 
          && this.birthYear == other.birthYear 
          && this.ailment.equals(other.ailment);
    }

    return false;
  }

}
