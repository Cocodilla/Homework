package lesson1;
//Задача 6 Создать класс Rectangle с полями a,b (стороны), цвет, поверхность. Поля a,b являются обязательными для заполнения, остальные нет.
//Создать перегруженные версии конструкторов, с помощью которых можно проинициализировать объект разными способами, но каждый из которых включает обязательные поля.
//Создать метод print, который будет выводить значения полей.
//В мейне создать несколько объектов, задействуя все конструкторы и вывести информацию о них на консоль.
public class Main6 {

        public void main(String[] args) {

            lesson1.Rectangle rec1 = new lesson1.Rectangle(76, 74);
            lesson1.Rectangle rec2 = new lesson1.Rectangle(57,67, "гладкая");
            lesson1.Rectangle rec3 = new lesson1.Rectangle(88, 89,"чёрный","шероховатая");
            lesson1.Rectangle rec4 = new lesson1.Rectangle("белый",64 ,86);
        }

    }
    class Rectangle {
        int a;
        int b;
        String color;
        String surface;

        public void printInfo() {

            System.out.println(a + " " + b + " " + color + "" + surface + "");
        }

        public Rectangle(int a, int b) {
            this.b =b;
            this.a = a;
        }
        public Rectangle( String color, int a, int b) {
            this(a, b);
            this.color = color;
            printInfo();

        }
        public Rectangle(int a, int b, String surface) {
            this(a, b);
            this.surface=surface;
            printInfo();

        }

        public Rectangle(int a, int b, String color, String surface) {
            this(a, b, color);
            this.surface= surface;
            printInfo();

        }

    }


