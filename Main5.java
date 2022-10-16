package lesson1;
//Задача 5 Создать класс Cat с полями имя, возраст, любимое блюдо. Поле имя является обязательным, остальные нет.
//Создать несколько перегруженных конструкторов, которые будут связаны между собой для инициализации полей.
//Создать метод print, который будет выводить на консоль значения всех полей.
//В мейне создать несколько объектов класса Cat, задействовав все конструкторы, вывести с помощью метода print значения полей каждого объекта
public class Main5 {

    public void main(String[] args) {

        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Мурзик", "Корм", 5);
        Cat cat3 = new Cat("Рыжик", "молоко");
        Cat cat4 = new Cat("Тузик", "мясо");
    }

}
class Cat {
    String name;
    int age;
    String food;

    public void printInfo() {
        System.out.println(name + " " + age + " " + food + "");
    }

            public Cat(String name, String food) {
            this.name = name;
            this.food = food;
        }

    public Cat(String name, String food, int age) {
            this(name, food);
            this.age = age;

        }
    public Cat(String name) {
            this.name = name;

        }
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    }

