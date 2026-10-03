import java.util.Scanner;

public class ArrayTeamChallenge {

  public static void main(String[] args) {

    int[] scores = { 78, 92, 85, 67, 95, 88, 73, 90 };

    // Challenge 1:
    // Display every score in the array using a loop.
    for (int i = 0; i < scores.length; i++) {
      System.out.println(scores[i]);
    }

    // Challenge 2:
    // Calculate and display the average score.
    // Your solution should still work if more scores are added.
    int total = 0;

    for (int i = 0; i < scores.length; i++) {
      total += scores[i];
    }

    double average = (double) total / scores.length;

    System.out.println("Average Score: " + average);

    // Challenge 3:
    // Find and display the highest and lowest score in the array.
    // Do not simply print 95.
    int highest = scores[0];
    int lowest = scores[0];

    for (int i = 0; i < scores.length; i++) {
      if (scores[i] > highest) {
        highest = scores[i];
      }

      if (scores[i] < lowest) {
        lowest = scores[i];
      }
    }

    System.out.println("Highest Score: " + highest);
    System.out.println("Lowest Score: " + lowest);

    // Challenge 4:
    // Count and display how many scores are above the average.
    int aboveAverage = 0;

    for (int i = 0; i < scores.length; i++) {
      if (scores[i] > average) {
        aboveAverage++;
      }
    }

    System.out.println("Students Above Average: " + aboveAverage);

    // BONUS 1 - REVERSE ORDER:
    // Display the scores in reverse order.
    for (int i = scores.length - 1; i >= 0; i--) {
      System.out.println(scores[i]);
    }

    // BONUS 2 - SCORE SEARCH:
    // Ask the user to enter a score to search for.
    // Determine whether the score exists in the array.
    // Display the index of the first occurrence.
    // Count how many times the score appears.
    // If it is not found, display an appropriate message.
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a score to search for: ");
    int search = input.nextInt();

    int firstIndex = -1;
    int occurrences = 0;

    for (int i = 0; i < scores.length; i++) {
      if (scores[i] == search) {
        occurrences++;

        if (firstIndex == -1) {
          firstIndex = i;
        }
      }
    }

    if (occurrences > 0) {
      System.out.println("Score found.");
      System.out.println("First index: " + firstIndex);
      System.out.println("Number of occurrences: " + occurrences);
    } else {
      System.out.println("Score not found.");
    }

    input.close();
  }
}
