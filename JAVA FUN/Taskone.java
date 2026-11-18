import java.util.Scanner;
public class Taskone{
public static void main (String[]args) {
Scanner input = new Scanner(System.in);

int sum = 0;
for (int count = 1; count <= 10; count++) {
System.out.println("Enter a Score");
int score = input.nextInt();

sum = sum + score;
}
System.out.println(sum);



}
}
