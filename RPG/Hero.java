/*this class represents a player which stores the hero's name, health
and attack power.*/
public class Hero{

    //declaring variables 
    private String name;
    private int health;
    private int attackPower;
    private int maxHealth;

    //constructor
    public Hero(String name,int health, int attackPower){
        this.name=name;
        this.health=health;
        this.attackPower=attackPower;
        this.maxHealth=health; //highest Health of Knight

    }

    //getter method
    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public int getAttackPower(){
        return attackPower;
    }

    public boolean isAlive(){
        return health>0;
    }

    //method when player's attack and deal with some damage
    public void attack (Monster monster){

        System.out.println();
        System.out.println(name+" attack the monster!");
        System.out.println("->You deal "+attackPower+" damage !!");

        //call method when taking damage
        monster.takeDamage(attackPower);
    }

    //method to calculate current health after dealing damage
    public void takeDamage(int damage){
        health-=damage;

        if(health<0){
            health=0;
        }
    }

    //method to calculate new health score when receiving heals
    public void heal(){
        int healAmount=20;

        System.out.println("HP before healing : "+health);
        health+=healAmount;

        System.out.println("HP after heal : "+health);

        if(health>maxHealth){
            health=maxHealth;
        }


        System.out.println(name + " heals for 20HP! Yay!");
        System.out.println("Health after max check : "+health);
    }

}