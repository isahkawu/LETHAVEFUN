import java.util.Scanner;
public class Tasksix{
public static void main (String[]args) {
Scanner input = new Scanner(System.in);
int average = 0;
int sum = 0;
for (int count = 1; count <= 10; count++) {

System.out.println("Enter a Score");
int score = input.nextInt();

if (score % 2 == 0) {


sum = sum + score;
average = sum / count;

}

System.out.println("the Average score of the Even Numbers collected is:  " + average);
}



}

}





