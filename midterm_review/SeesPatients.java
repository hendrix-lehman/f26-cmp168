interface SeesPatients {

  public static final int MAX_PATIENTS = 100;

  public void addPatient(Patient patient) throws PatientException;
  public Patient[] getPatients();
  public String getPatientsAsString();
  public boolean isPatient(Patient patient);

}
