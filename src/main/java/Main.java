import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Bird playerBird = pickBird(input);
        int birdSpeed = playerBird.fly();
        int monsterSpeed = monsterSpeed(input);
        runGame(birdSpeed,monsterSpeed);

        input.close();
    }
    public static void runGame(int birdSpeed , int monsterSpeed)
    {
        if(birdSpeed > monsterSpeed)
        {
            System.out.println("The Bird lives to fly another day");
        }
        else
        {
            System.out.println("Oh NO!!!! the Bird is no more... Monster Wins!!!");
        }
        System.out.println("Monster Speed:" + monsterSpeed);
        System.out.println("Bird Speed:" + birdSpeed);
    }
    public static Bird pickBird(Scanner input)
    {
        int bird = 0;
        Bird player = new Bird();

            System.out.println("---------------------");
            System.out.println("Please Choose a bird:");
            System.out.println("Enter 1: Egale");
            System.out.println("Enter 2: Falcon");
            System.out.println("Enter 3: Hawk");
            System.out.println("Enter 4: Pigeon");
            System.out.println("Any other number for random bird");
            System.out.println("---------------------");

            try{
                bird = input.nextInt();
            }
            catch(Exception e)
            {
                System.out.println("Invalid Value");
                System.exit(0);
            }

        if(bird > 4 || bird < 1)
        {
            Random num = new Random();
            bird = num.nextInt(4)+1;
            System.out.println("Random bird selection...");
        }
        switch(bird)
        {
            case 1:
                Bird egale = new Egale();
                player = egale;
                break;
            case 2:
                Bird falcon = new Falcon();
                player = falcon;
                break;
            case 3:
                Bird hawlk = new Hawk();
                player = hawlk;
                break;
            case 4:
                Bird pigeon = new Pigeon();
                player = pigeon;
                break;
            default:
                System.out.println("Something went wrong...");
                break;
        }
        player.speak();
        return player;
    }
    public static int monsterSpeed(Scanner input)
    {
        int speed = 0;

            System.out.println("---------------------");
            System.out.println("Please Choose a monster speed:");

            try{
                speed = input.nextInt();
            }
            catch(Exception e)
            {
                System.out.println("Invalid Value");
                System.exit(0);
            }


        return speed;
    }
}
