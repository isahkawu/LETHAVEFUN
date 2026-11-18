import java.util.Scanner;
public class Phase2one {
public static void main (String [] args) {

Scanner input = new Scanner(System.in);

System.out.println("Enter a Score");
 int score = input.nextInt();
 
for ( score = 2; score <= 10; score++) {

int counter = 0;


 
	
for (int count = 1; count <= score; count++){

if (score % count == 0) {

  counter++;
}

}
	
if (counter == 2) {
 
System.out.println(score);

}	
	

}

}
}

