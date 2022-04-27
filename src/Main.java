import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        task1(2000);
        task2(1, 2014);
        task3(110);
        task4("abccffggtt");

        int [] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        task5(arr);
        System.out.println(Arrays.toString(arr));



    }



    //Задание 1

    public static void task1(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }
    // Задание 2

    public static void task2(int client, int clientyear) {

        if (client == 0 && clientyear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (client == 0 && clientyear >= 2015) {
            System.out.println("Установите приложение для iOS по ссылке.");
        } else if (client == 1 && clientyear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (client == 1 && clientyear >= 2015) {
            System.out.println("Установите приложение для Android по ссылке.");
        }
    }
    // Задание 3

    public static void task3(int deliveryDistance) {

        if (deliveryDistance <= 20) {
            System.out.println("Для доставки потебуется 1 день.");
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Для доставки потебуется 2 дня.");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Для доставки потебуется 3 дня.");
        } else {
            System.out.println("Доставка не возможна.");
        }
    }

    //Задание 4
    public static void task4(String line) {
        for (int i = 0; i < line.length() - 1; i++)
            if (line.charAt(i) == line.charAt(i + 1)) {
                System.out.println("Дубль найден " + line.charAt(i));
                return;
            }

        System.out.println("Дубль не найден");
    }

    //Задание 5
    public static void task5(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=arr[arr.length-1-i];
        }
    }
}



