import java.util.Scanner;
public class Taskfive{
public static void main (String[]args) {
Scanner input = new Scanner(System.in);
int average = 0;
int sum = 0;
for (int count = 1; count <= 10; count++) {

System.out.println("Enter a Score");
int score = input.nextInt();

if (score > 0 && score <= 100) {
sum = sum + score;
average = sum / count;

}



}

System.out.println("Average of Scores is: " + average);

}

}





