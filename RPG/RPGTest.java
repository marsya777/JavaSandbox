/*Main program class which accepts user keyboard input and controls the battle. */

import java.util.Scanner;
public class RPGTest {
    
    public static void main (String[]args){
        Scanner sc=new Scanner (System.in);

        Hero hero = new Hero ("Knight", 100,25);
        Monster monster = new Monster ("Goblin",80,15);

        System.out.println("=============================================");
        System.out.println("                 RPG BATTLE                  ");
        System.out.println("=============================================");
        System.out.println("FIGHT !!!");

        System.out.println("Your hero : "+hero.getName());
        System.out.println("Enemy : "+monster.getName());

        while (hero.isAlive() && monster.isAlive()){
            System.out.println("\n---------------------------------");
            System.out.println(hero.getName()+"'s HP : "+hero.getHealth());
            System.out.println(monster.getName()+"'s HP : "+monster.getHealth());

            System.out.println("\nQuick! What should we do, "+hero.getName()+" ?");
            System.out.println("1. Attack");
            System.out.println("2. Heal");
            System.out.println("3. Run away");

            System.out.println();
            System.out.print("Enter choice : ");
            int choice = sc.nextInt();
            System.out.println();

            if(choice==1){
                hero.attack(monster);
            }
            else if (choice==2){
                hero.heal();
            }
            else if (choice==3){
                System.out.println("You ran away...\nGAME OVER.");
                break;
            }
            else{
                System.out.println("Invalid choice! Try again.");
                continue;
            }

            if (!monster.isAlive()){
                break;
            }

            monster.attack(hero);

            if(!hero.isAlive()){
                break;
            }
        }

        System.out.println("\n==========================================");
        System.out.println("                  SUMMARY                   ");
        System.out.println("\n==========================================");

        if(!hero.isAlive()){
            System.out.println("You were defeated.. :( \nGame Over!");
        }
        else if(!monster.isAlive()){
            System.out.println("You defeated the Goblin! \nVICTORY IS OURS!");
        }
        else{
            System.out.println("You escaped.. \nBATTLE ENDED.");
        }

        System.out.println();
        System.out.println("Final Hero HP : "+hero.getHealth());
        System.out.println("Final Monster HP : "+monster.getHealth());
        System.out.println("\n==========================================");

        sc.close();
    }

}
