package games;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor_Game {
    public static void main(String[] args) {
        System.out.println("Please enter the Below Option");
        System.out.println("0. for Rock\n1. for Paper\n2. for Scissor");
        Scanner sc=new Scanner(System.in);
        int userInput=sc.nextInt();

        Random random = new Random();
        int sysInput=random.nextInt(3);

        if(userInput==sysInput){
            System.out.println("draw");
        }
        else if ((userInput==0 && sysInput==2) || (userInput==2 && sysInput==1) || (userInput==1 && sysInput==0)){
            System.out.println("You win");
        }
        else{
            System.out.println("You loose");
        }
        System.out.println("user Input = " +userInput);
        System.out.println("system Input = " +sysInput);
    }

}
