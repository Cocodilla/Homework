package lesson1;

//Задача 1 Создать класс Character (персонаж игры) с полями
//
//название персонажа
//класс персонажа (войн, маг, лекарь)
//урон персонажа
//Создайте метод printInfo для вывода атрибутов персонажа
//
//В мейне создайте массив на 5 объектов класса Character, заполните его объектами класса Character.
//Заполнение можете сделать вручную, либо в цикле.
//
//После заполнения выведите на консоль информацию о всех персонажах (их название, класс, урон).
//
//Далее выполните задачи:
//1. Юзер вводит с консоли требуемый класс персонажа, программа должна вывести из массива всех персонажей, чей класс совпадает с введенным с консоли.
//2. Юзер вводит с консоли урон, которым должен обладать персонаж. Выведите на консоль всех персонажей, чей урон больше или равен введенному с консоли
//3. Юзер вводит класс и урон. Выведите всех персонажей, чей класс совпадает с введенным и чей урон больше или равен введенному.




import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Character[] arr = new Character[5];
        Random rnd = new Random();
        String[] names = {"Punisher", "Storm", "Winner", "Lucia", "MagicalWand"};
        String[] characterClass = {"Warrior", "Mage", "Healer"};

        for (int i = 0; i <arr.length; i++) {

            Character c = new Character();
            c.damage = rnd.nextInt(9000) + 10;
            int nameIndex = rnd.nextInt(names.length);
            c.name = names[nameIndex];
            int characterClassIndex = rnd.nextInt(characterClass.length);
            c.characterClass = characterClass[characterClassIndex];
            arr[i] = c;
            arr[i].printInfo();

        }

        Scanner scn = new Scanner(System.in);
        System.out.println("Введите имя персонажа");
        String input = scn.next();
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].name.equals(input)) {
            arr[i].printInfo();
        }
        }
        System.out.println("Введите урон персонажа");
        int input2 = scn.nextInt();
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]<=input2)) {
                arr[i].printInfo();
            }
            System.out.println("Введите класс и урон персонажа");
            String input3 = scn.next();
            int input4 = scn.nextInt();
            for (int i = 0; i < arr.length ; i++) {
                if (arr[i].name.equals(input)) {
                    arr[i].printInfo();
                }

    }



        }
    }
}



