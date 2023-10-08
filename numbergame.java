import java.util.*;
import java.util.Random;

class NumberGame
{
    
    static int randomNumber;
    
    static void game()
    {
         System.out.println("Enter no of attempts");
       
         Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           boolean flag = false;
         for(int i =1;i<=n;i++)
         {
              System.out.println("Enter the number to guess");
        
               int guess= sc.nextInt();
               if(randomNumber > guess)
               {
                    System.out.println("Guess is low");
                    
                }
                else if(randomNumber < guess)
                {
                    System.out.println("Guess is high");
                    }
                else
                {
                    flag =true;
                 System.out.println("YOU WON!!!!!!!");
                 break;
                }
                
            }
            if(flag == false)
            {
                System.out.println("ATTEMPTS OVER");
            }
        }
        
        
    
    
    
    

    public static void main(String[] args)
    {
        // Create an instance of the Random class
        Random r = new Random();

        // Generate a random number between 1 and 100
       randomNumber = r.nextInt(100)+1;

   
        game();
      
    }
}