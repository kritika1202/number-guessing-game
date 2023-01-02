import java.util.*;
import java.util.Random;

public class NumberGuessingGame {

    static Scanner s = new Scanner(System.in);
    static Random r =new Random();
    static int input , random, diff; 
    static int output=" ";

    public static void main(String args[]){
        random = r.nextInt(21);
        System.out.println("\n welcome to random number guesser");
        System.out.print("Enter the level [E/M/H] : ");
        char level=s.next().charAt(0);
        switch(level){
            case 'E':
               diff =15;
               Game e =new Game();
               e.game();
               break;

            case 'M':
            diff =10;
            Game m = new Game();
            m.game();
            break;

            case 'H':
            diff = 5;
            Game h = new Game();
            h.game();
            break;

            default:
            System.out.print("Error occured due to wrong difficulty selection !!");


        }
    }
    public static class Game{
        public void game(){
            for(int i =1; i<diff;i++){
                System.out.print("Enter a number between 0 to 20 : ");
                input=s.nextInt();
                if(random==input){
                    output = "you won!"; 
                    break; 
                }
                else if(random>input){
                    System.out.println("try again a larger value !");
                    System.out.println(diff-i + "trials left.");
                    output = "you lost!";
                    continue;
                }
                else if(random<input){
                    System.out.println("try again a smaller value !");
                    System.out.println(diff-i + "trials left.");
                    output = "you lost!";
                    continue;

                }

                else{
                    output = "you lost";
                }
            }
                System.out.println(output);
                System.out.println("the number is" + random +"\n");
            }
        }
    }
            
                    


                


