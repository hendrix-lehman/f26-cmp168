interface Playful {
  static final int MAX_PLAY_TIME = 60; // in minutes
 
  void play();

  default void playWith(Playful other) {
    System.out.println("Playing with " + other);
  }
}
