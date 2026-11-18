import java.util.Scanner;
public class Taskfive{
public static void main (String[]args) {
Scanner input = new Scanner(System.in);
int add = 0;
int sum = 0;
for (int count = 1; count <= 10; count++) {

System.out.println("Enter a Score");
int score = input.nextInt();

if (score % 2 == 0) {
sum = sum + score;


}

System.out.println("the Score and Sum of the Even Numbers collected is:  " + sum);
}



}

}





