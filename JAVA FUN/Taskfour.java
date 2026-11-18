import java.util.Scanner;
public class Taskfour{
public static void main (String[]args) {
Scanner input = new Scanner(System.in);
int add = 0;
int sum = 0;
for (int count = 1; count <= 10; count++) {

System.out.println("Enter a Score");
int score = input.nextInt();
sum = sum + score;

if (count % 2 == 0){
add = add + count;
System.out.println("Sum of The Even Number is: " + add);
}
}
//System.out.println(sum);


}

}





