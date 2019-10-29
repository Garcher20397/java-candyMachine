/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candymachine;
import java.util.Scanner;
/**
 * 
 * @author mlarrubia
 */
//Grant "The Legend" Archer Period 2 
public class CandyMachine {
static Scanner kb = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to FHS's Computer Candy machine!");  
        System.out.println("    All candy provided is virtual");
        System.out.println();
        System.out.println("How much money do ya got? >");
        double money = kb.nextDouble();
           System.out.println("$" + money + ", that's all?");
           System.out.println("Well, let me tell ya what we got here.");
           System.out.println();
        System.out.println("A       $0.65   Twix");
        System.out.println("B       $0.50   Chips");
        System.out.println("C       $0.75   Nutter Butter");
        System.out.println("D       $0.65   Peanut Butter Cup");
        System.out.println("E       $0.55   Juicy Fuit Gum");
        
        System.out.println("So, what u want homie? > ");
        char choice = kb.next().charAt(0);
        
        if(choice == 'A'){
            if(money >= 0.65){
                System.out.println("You picked Twix");
                System.out.println("Thank you your change is: $" + (money - 0.65));
            }
            else{
                System.out.println("You a Broke boi please leave");
            }
        }
        if(choice == 'B'){
            if(money >= 0.50){
                System.out.println("You picked Chips");
                System.out.println("Thank you your change is: $" + (money - 0.50));
            }
            else{
                System.out.println("You a Broke boi please leave");
            }
        }
        if(choice == 'C'){
            if(money >= 0.75){
                System.out.println("You picked Nutter Butter");
                System.out.println("Thank you your change is: $" + (money - 0.75));
            }
            else{
                System.out.println("You a Broke boi please leave");
            }
        }
        if(choice == 'D'){
            if(money >= 0.65){
                System.out.println("You picked Peanut Butter Cup");
                System.out.println("Thank you your change is: $" + (money - 0.65));
            }
            else{
                System.out.println("You a Broke boi please leave");
            }
        }
        if(choice == 'E'){
            if(money >= 0.55){
                System.out.println("You picked Juicy Fruit Gum");
                System.out.println("Thank you your change is: $" + (money - 0.55));
            }
            else{
                System.out.println("You a Broke boi please leave");
            }
        }
    }
    
}
