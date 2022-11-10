//Two Enhacement of GuesserGame as follows
//One is Gussing number range 0 to 10 both Player and Guesser
//Two is add final round 
import java.util.*;
class Guesser{
    int guessNum;
    int  guessNum(){
       Scanner scan=new Scanner(System.in);
       System.out.println("Guesser Please Guess The Number");
       guessNum=scan.nextInt();
       return guessNum;
    }
}
class Player{
	int playerNum;
	    int  playerNum(){
	Scanner Scan=new Scanner(System.in);
	System.out.println("Player Guess The Number"); 
	playerNum=Scan.nextInt();
	return playerNum;
	}
}
class Umpire{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	void collectNumFromGuesser() 
	{
		Guesser g=new Guesser();
		  numFromGuesser=g.guessNum();
	}
	void collectNumFromPlayer() 
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.playerNum();
		numFromPlayer2=p2.playerNum();
		numFromPlayer3=p3.playerNum();
	}
	void compare() 
	{   
     
        if(numFromGuesser>=0 && numFromGuesser<=10)
      { 
        if((numFromPlayer1>=0 && numFromPlayer1<=10) &&
        (numFromPlayer2>=0 && numFromPlayer2<=10) &&
        (numFromPlayer3>=0 && numFromPlayer3<=10)) 
    {
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3) 
			{
				System.out.println("All Player Won the game");
			}
			else if(numFromGuesser==numFromPlayer2)
			{
				System.out.println("player 1 and player 2 won the game");
                      System.out.println(" final between player 1 and 2");
                      Scanner scan=new Scanner(System.in);
                      System.out.println("Guesser Please Guess The Number");
                      int keyG=scan.nextInt();
                      System.out.println("Player please Guess The Number");
                      System.out.println("Player 1 guess the number");
                      int keyp1=scan.nextInt();
                      System.out.println("player 2 Guess the number");
                      int keyp2=scan.nextInt();
                      if(keyG>=0 && keyG<=10)
                      {
                        if((keyp1>=0 && keyp1<=10) && (keyp2>=0 && keyp2<=10))  
                          {
                           if(keyG==keyp1 && keyp1!=keyp2){
                            System.out.println("Player 1 finally won");
                           }
                           else if(keyG==keyp2 && keyp1!=keyp2){
                            System.out.println("player 2 finally won");
                          }                         
                          else if(keyp1==keyp2 && keyG==keyp1 && keyG==keyp2){
                            System.out.println("Both Player Won The Game");
                          }
                         else{
                            System.out.println("finally lost");
                         }
                        }
                        else{
                            System.out.println("Player number 0 to 10");
                        }
                        }
                        else{
                            System.out.println("Guesser number 0 to 10");
                        }
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("player 1 and player 3 won the game");
                System.out.println(" final between player 1 and 3");
                Scanner scan=new Scanner(System.in);
                System.out.println("Guesser Please Guess The Number");
                int keyG=scan.nextInt();
                System.out.println("Player please Guess The Number");
                System.out.println("Player 1 guess the number");
                int keyp1=scan.nextInt();
                System.out.println("player 3 Guess the number");
                int keyp2=scan.nextInt();
                if(keyG>=0 && keyG<=10)
                {
                  if((keyp1>=0 && keyp1<=10) && (keyp2>=0 && keyp2<=10))  
                    {
                     if(keyG==keyp1 && keyp1!=keyp2){
                      System.out.println("Player 1 finally won");
                     }
                     else if(keyG==keyp2 && keyp1!=keyp2){
                      System.out.println("player 3 finally won");
                    }                         
                    else if(keyp1==keyp2 && keyG==keyp1 && keyG==keyp2){
                      System.out.println("Both Player Won The Game");
                    }
                   else{
                      System.out.println("finally lost");
                   }
                  }
                  else{
                      System.out.println("Player number 0 to 10");
                  }
                  }
                  else{
                      System.out.println("Guesser number 0 to 10");
                  }
			}
			else 
			{
			System.out.println("Player 1 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer2) 
		{
			if(numFromGuesser==numFromPlayer3) 
			{
				System.out.println("player 2 and player 3 won the game");
                System.out.println(" final between player 2 and 3");
                Scanner scan=new Scanner(System.in);
                System.out.println("Guesser Please Guess The Number");
                int keyG=scan.nextInt();
                System.out.println("Player please Guess The Number");
                System.out.println("Player 2 guess the number");
                int keyp1=scan.nextInt();
                System.out.println("player 3 Guess the number");
                int keyp2=scan.nextInt();
                if(keyG>=0 && keyG<=10)
                {
                  if((keyp1>=0 && keyp1<=10) && (keyp2>=0 && keyp2<=10))  
                    {
                     if(keyG==keyp1 && keyp1!=keyp2){
                      System.out.println("Player 2 finally won");
                     }
                     else if(keyG==keyp2 && keyp1!=keyp2){
                      System.out.println("player 3 finally won");
                    }                         
                    else if(keyp1==keyp2 && keyG==keyp1 && keyG==keyp2){
                      System.out.println("Both Player Won The Game");
                    }
                   else{
                      System.out.println("finally lost");
                   }
                  }
                  else{
                      System.out.println("Player number 0 to 10");
                  }
                  }
                  else{
                      System.out.println("Guesser number 0 to 10");
                  }
			}
			else 
			{
			System.out.println("player 2 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("player 3 won the game");
		}
		else
		{
			System.out.println("game lost");
		}
     }
       else{
       System.out.println("Player Please Guess The Number Between 0 to 10");
       }   
    }
    else
    {
     System.out.println("Guesser Please Guess The Number Between 0 to 10");
    }
	}
}
public class GuesserGame {
	public static void main(String[] args) {
            Umpire u=new Umpire();
           u.collectNumFromGuesser();            
            u.collectNumFromPlayer();
            u.compare();
	}

}