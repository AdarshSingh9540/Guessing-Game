import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rn = new Random();
        int ran = rn.nextInt(1,10);
        System.out.println("Welcome To Guessing Game");
        System.out.println("Guess a Number Between(1 to 10)");

        boolean found = false;
        do{
            int n = in.nextInt();

            if(ran==n){
                System.out.println("Bruh..! You Enter Correct Number");
                found = true;
            } else if (ran<n) {
                System.out.println("Oops! You Enter Greater No. ");
            }else{
                System.out.println("Oops! YOu Enter Smaller No. ");
            }

        }while (!found);
    }

}
