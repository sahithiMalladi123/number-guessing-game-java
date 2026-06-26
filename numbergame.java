import java.util.*;
class Game
{
    public void numGame()
    {
     int choice;
      do{
        System.out.println("WELCOME TO NUMBER GUESSING GAME 🎯 ");
        Random obj=new Random();
        int a =obj.nextInt(1,101);  

        Scanner sc=new Scanner(System.in);
        System.out.println("Guess The Number Between 1 To 100");
        int attempts=0;
        int flag=0;
    
        while(true)
        { try{
            int b=sc.nextInt();
            attempts=attempts+1;
            if(a==b)
            {
                System.out.println("Congratulations ,You Guessed Correct 🎉");
                flag=1;
                break;
            }
            else if(a<b)
            {
                System.out.println("Lower");
            }
            else{
                System.out.println("Higher");
                }
             
                if(attempts>=5)
                {
                    System.out.println("Attempts Over");
                    break;
                }
                System.out.println("Enter Another Guess");
        }
        catch(InputMismatchException e)
        {
            System.out.println("invalid input");
            sc.nextLine();
        }
            }
    
        if(flag==1)
        {
            System.out.println("You Guessed Correct in " + attempts + " Attempts");
        }
        System.out.println("Do you want to play again  No-0/ Yes-1");
         choice=sc.nextInt();


        }while(choice==1);
        

}
}
class numberGame
{
    public static void main(String args[])
    {
        Game obj1=new Game();
        obj1.numGame();
    }
}
