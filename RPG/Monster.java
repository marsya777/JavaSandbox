/*this class represents the enemy. The monster can attack the hero
and take damage.*/

public class Monster{

    //declare variables
    private String name;
    private int health;
    private int attackPower;

    //constructor
    public Monster (String name,int health,int attackPower){
        this.name=name;
        this.health=health;
        this.attackPower=attackPower;
    }

    //getter
    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public boolean isAlive(){
        return health>0;
    }

    //method to calculate and display when the monster attacks the player
    public void attack (Hero hero){
        System.out.println();
        System.out.println(name+ " attacks you!");
        System.out.println("->You take "+attackPower+ " damage :(");

        hero.takeDamage(attackPower);
    }

    //method to calculate current health after dealing damage
    public void takeDamage(int damage){
        health-=damage;

        if(health<0){
            health=0;
        }
    }
}