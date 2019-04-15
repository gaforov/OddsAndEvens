package me.gaforov;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's play a game called \"Odds and Evens\"");
        System.out.println("What is your name? ");
        String name = input.next();
        System.out.println("Hello " + name+", which do you choose? \"(O)dds or (E)vens\"?");
        String user = input.next();
        boolean oddOrEvenPick = user.equalsIgnoreCase("e");
        if (user.equalsIgnoreCase("e")){
            System.out.println(name + " has picked evens! The computer will be odds.");
        } else if (user.equalsIgnoreCase("o")){
            System.out.println(name + " has picked odds! The computer will be evens.");
            System.out.println("=============");
        }
        System.out.println("How many \"fingers\" do you put out?");
        int fingers = input.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays " + computer + " \"fingers\"");
        System.out.println("========================");
        int sum = fingers + computer;
        System.out.println(fingers + " + " + computer );

        boolean oddOrEven = sum%2 == 0;
        if (sum%2==0){
            System.out.println(sum+" is ...evans!");
        } else {
            System.out.println(sum + " is ...odds!");
            System.out.println("========================");
        }
        if (oddOrEvenPick==oddOrEven){
            System.out.println(name + " wins!");
        }else {
            System.out.println("Computer wins!");
        }
    }
}
