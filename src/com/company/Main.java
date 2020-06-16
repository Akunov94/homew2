package com.company;

public class Main {
    public static String walk(int age, int temperature) {
        String result = "";
        if(age < 20 || age > 45 && temperature < -20 || temperature > 30){
            System.out.println("Можно идти гулять");
        }else if(age > 20 && temperature <= 0 && temperature > 28){
            System.out.println("Можно идти гулять");
        }else if(age < 45 && temperature < -10 || temperature > 25){
            System.out.println("Можно идти гулять");
        }else
            System.out.println("Оставайтесь дома");

        return result;
    }
    public static void main(String[] args) {
    walk(26,31);
    walk(15,-21);
    walk(55,-11);
    walk(50,26);
    walk(30,18);

    walk2(generateRandomAge(), -11);
    }
    public static String walk2(int age, int temperature) {
        String result = "";
        if(age < 20 || age > 45 && temperature < -20 || temperature > 30){
            System.out.println("Можно идти гулять");
        }else if(age > 20 && temperature <= 0 && temperature > 28){
            System.out.println("Можно идти гулять");
        }else if(age < 45 && temperature < -10 || temperature > 25){
            System.out.println("Можно идти гулять");
        }else
            System.out.println("Оставайтесь дома");

        return result;
    }

    public static int generateRandomAge(){
        int a = 0;
        int b = 100;
        int random_number1 = a + (int) (Math.random() * b); // Генерация 1-го числа
        System.out.println("1-ое случайное число: " + random_number1);
        return random_number1;
    }
}
