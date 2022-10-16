package lesson1;

public class Character {

    String name;
    String characterClass;
    int damage;

    public void Character2 (String name, String characterClass,int damage){
        this.name = name;
        this.characterClass = characterClass;
        this.damage = damage;
    }
    void printInfo(){
        System.out.println(name + " " + characterClass + " " + damage + "");
    }



}

