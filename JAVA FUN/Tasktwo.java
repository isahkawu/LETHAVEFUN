import java.util.Scanner;
public class Tasktwo{
public static void main (String[]args) {
Scanner input = new Scanner(System.in);
int average = 0;
int sum = 0;
for (int count = 1; count <= 10; count++) {
System.out.println("Enter a Score");
int score = input.nextInt();

sum = sum + score;
 average = sum/count;
}
//System.out.println("Sum is: " + sum);
System.out.println("Average is: " + average);

}
}
