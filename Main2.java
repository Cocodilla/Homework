package lesson1;
//Задача 2 Создать класс BankAccount с полями
//
//сумму на счету
//номер счета (уникальное значение)
//процент на остаток (годовой процент)
//Создайте метод printInfo для вывода атрибутов счета
//
//Создайте массив счетов на 10 элементов и заполните его рандомно. Не забудьте, что номер счета при этом не должен повторяться.
//Создайте меню:
//1. Вывести все счета
//2. Вывести сумму на счете по номеру (юзер вводит номер)
//3. Сделать перевод. Юзер вводит номер счета-отправителя, номер счета-получателя и сумму перевода. Сделайте проверку, что баланса отправителя хватает для перевода
//4. Найти счет с самым большим процентом на остаток (найти целый объект)
//5. Найти счет, владелец которого заработает больше всех процентов, если будет держать деньги на нем целый год. Прибыль за год вычисляется по формуле сумма на счету * процент на остаток / 100
//6. Выход

import java.util.Random;
import java.util.Scanner;

public class Main2 {

    class BankAccount {
        Random rnd = new Random();
        int balance;
        int accountNumber = rnd.nextInt(10);
        int yearlyPercent;

        void printInfo() {

            System.out.println(balance + " " + accountNumber + " " + yearlyPercent + " ");
        }
    }
    public void main(String[] args) {

        BankAccount [] BankArray = new BankAccount[10];
        Random rnd = new Random();

        for (int i = 0; i <BankArray.length; i++) {
            BankAccount b = new BankAccount();
            b.yearlyPercent = rnd.nextInt(8) + 1;
            b.balance = rnd.nextInt(5000)+500;
            BankArray[i]=b;
        }


        Scanner scn = new Scanner(System.in);
        int input = 0;
        while(input!=6){
            System.out.println(" 1. Вывести все счета\n" +
                    "//2. Вывести сумму на счете по номеру (юзер вводит номер)\n" +
                    "//3. Сделать перевод. Юзер вводит номер счета-отправителя, номер счета-получателя и сумму перевода. Сделайте проверку, что баланса отправителя хватает для перевода\n" +
                    "//4. Найти счет с самым большим процентом на остаток (найти целый объект)\n" +
                    "//5. Найти счет, владелец которого заработает больше всех процентов, если будет держать деньги на нем целый год. Прибыль за год вычисляется по формуле сумма на счету * процент на остаток / 100\n" +
                    "//6. Выход");
            input = scn.nextInt();
            if(input == 1){
                for (int i = 0; i < BankArray.length; i++) {
                    BankArray[i].printInfo();
                }
            }
            else if(input == 2){
                System.out.print("Вывести сумму на счете по номеру ");
                String city = scn.next();
                for (int i = 0; i < BankArray.length; i++) {
                    if(BankArray[i].city.equals(city)) {
                        BankArray[i].printInfo();
                        //System.out.println(arr[i].name + " " + arr[i].lastname + " " + arr[i].seria + " " + arr[i].number + " " + arr[i].city);
                    }
                }
            }
            else if(input == 3){
                System.out.print("Enter lastname: ");
                String lastname = scn.next();
                for (int i = 0; i < BankArray.length; i++) {
                    if(BankArray[i].lastname.equals(lastname)) {
                        BankArray[i].printInfo();
                        //System.out.println(arr[i].name + " " + arr[i].lastname + " " + arr[i].seria + " " + arr[i].number + " " + arr[i].city);
                    }
                }
            }
            else if(input == 4){
                System.out.print("Enter lastname: ");
                String lastname = scn.next();
                for (int i = 0; i < BankArray.length; i++) {
                    if(BankArray[i].lastname.equals(lastname)) {
                        BankArray[i].printInfo();
                        //System.out.println(arr[i].name + " " + arr[i].lastname + " " + arr[i].seria + " " + arr[i].number + " " + arr[i].city);
                    }
                }
            }
            else if(input == 5){
                System.out.print("Enter lastname: ");
                String lastname = scn.next();
                for (int i = 0; i < BankArray.length; i++) {
                    if(BankArray[i].lastname.equals(lastname)) {
                        BankArray[i].printInfo();
                        //System.out.println(arr[i].name + " " + arr[i].lastname + " " + arr[i].seria + " " + arr[i].number + " " + arr[i].city);
                    }
                }
            }
            else if(input == 6){
                System.out.print("Enter lastname: ");
                String lastname = scn.next();

                    }
                }
            }

        }
    }

}
