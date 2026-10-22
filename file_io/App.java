import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.PrintWriter;
import java.io.FileWriter;

class App {

  public static int getUserInput(Scanner scanner) throws Exception {
   // capturing keyboard input 
    try {
      System.out.print("Tell me a number between 1 and 10: ");
      return scanner.nextInt();

    } catch (Exception e) {
      throw new Exception("Exception getting input from scanner: " + e.getMessage());
      // System.out.println("Error initializing scanner: " + e.getMessage());
      // return -1; // return -1 to indicate an error
    } 
   }

  public static int getRandomNumber() {
    Random random = new Random();
    return random.nextInt(10) + 1; // generates a random number between 1 and 10
  }

  public static boolean isCorrectGuess(int guess, int number) {
    return guess == number;
  }

  public static int readRandomNumberFromFile(String filePath) throws Exception {
    // read the last line of the file and return it as an integer
    // try {
    //   Path path = Path.of(filePath);
    //   String lastLine = Files.readAllLines(path).get(Files.readAllLines(path).size() - 1);
    //   return Integer.parseInt(lastLine);
    // } catch (Exception e) {
    //   throw new Exception("Error reading random number from file: " + e.getMessage());
    // }
    
    // use Scanner class
    try {
      File file = new File(filePath);
      Scanner scanner = new Scanner(file);
      int lastNumber = -1;
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        lastNumber = Integer.parseInt(line);
      }
      scanner.close();
      return lastNumber;
    } catch (Exception e) {
      throw new Exception("Error reading random number from file: " + e.getMessage());
    }
  }

  public static int writeRandomNumberToFile(String filePath) throws Exception {
    Random random = new Random();
    int randomNumber = random.nextInt(10) + 1; // generates a random number between 1 and 10

    // // write the random number to a file called random_number.txt
    // try {
    //   Path path = Path.of(filePath);
    //   Files.writeString(path, String.valueOf(randomNumber) + System.lineSeparator(), java.nio.file.StandardOpenOption.CREATE, java.nio.file.StandardOpenOption.APPEND);
    // } catch (Exception e) {
    //   throw new Exception("Error writing random number to file: " + e.getMessage());
    // }

    // use PrintWriter class
    try {
      FileWriter fileWriter = new FileWriter(filePath, true); // true to append
      PrintWriter writer = new PrintWriter(fileWriter);
      writer.println(randomNumber);
      writer.close();
    } catch (Exception e) {
      throw new Exception("Error writing random number to file: " + e.getMessage());
    }

    return randomNumber;
  }

  public static void logGuessToFile(String filePath, int guess, int number, boolean isCorrect) throws Exception {
    try {
      FileWriter fileWriter = new FileWriter(filePath, true); // true to append
      PrintWriter writer = new PrintWriter(fileWriter);
      writer.println("User guessed: " + guess + ", Random number: " + number + ", Correct: " + isCorrect);
      writer.close();
    } catch (Exception e) {
      throw new Exception("Error logging guess to file: " + e.getMessage());
    }
  }

  public static void main(String[] args) {

    try {

      // the identifier is the variable name referencing the file, in this case, it is "file"
      // the path is the location of the file, in this case, it is "random_number.txt"
     
      // int number = readRandomNumberFromFile("random_number.txt");
      writeRandomNumberToFile("random_number.txt");
      int number = readRandomNumberFromFile("random_number.txt");

      System.out.println("Random number is: " + number);

      // capture keyboard input from user
      Scanner keyboardScanner = new Scanner(System.in);
      int guess = getUserInput(keyboardScanner);
      if (guess == -1) {
        System.out.println("Invalid input. Exiting the game.");
        return; // exit if there was an error in input
      }

      // Use random to generate a random number between 1 and 10
      // and save it to a file called random_number.txt
      // then we get the random number from the file and compare it to the user's guess
      // every guess should be appended to a log file called guesses.log
      // in the log file, we should log the user's guess, the random number, and whether the guess was correct or not

      // process the input and generate a random number to compare against
      // int number = getRandomNumber();
      int tries = 1;
      while (!isCorrectGuess(guess, number)) {
        if (tries == 3) {
          break; // exit the loop if the user has used all tries
        }

        System.out.println("Try again!");
        logGuessToFile("guesses.log", guess, number, false);
        guess = getUserInput(keyboardScanner);
        tries++;
      }

      boolean isCorrect = isCorrectGuess(guess, number);
      logGuessToFile("guesses.log", guess, number, isCorrect);

      // output the result of the game
      if (!isCorrect) {
        System.out.println("Sorry, you've used all your tries. The correct number was: " + number);
      } else {
        System.out.println("You guessed it!");
      }
    } catch (Exception e) {
      System.out.println("Something went wrong: " + e.getMessage());
    }
  }
}

