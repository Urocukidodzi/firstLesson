


public class Main {

    public static void main(String[] args) {

        // task 2
        byte aByte = 100;
        short aShort = 550;
        int aInt = 1500;
        long aLong = 55000L;

        float aFloat = 0.5F;
        double aDouble = 0.05;

        char aChar = 'Z';

        boolean bool = true;

        String ln = "Hello my friend";

        System.out.println("task3 = "+ task3(10F,2F,2.5F,1.1F));
        System.out.println("task4 = "+ task4(10, 8));
        task5(10);
        System.out.println("task6 = "+ task6(10));
        task7("Вадим");
        task8(2008);
    }
    //Task 3
    public static double task3 (float a, float b, float c, float d){
        double result = a * (b + (c / d));
        return result;
    }

    public static boolean task4(int a, int b){
        int sum = a+b;
        if (sum >= 10 && sum <=20 ){
            return true;
        }
        return false;
    }
    public static void task5(int num){
        if (num <0){
            System.out.println("Negative number");
        }
        System.out.println("Positive number");
    }
    public static boolean task6(int num){
        if (num <0){
            return true; // true если отрицательное
        }
        return false; // false если положительное
    }
    public static void task7(String name){
        System.out.println("Привет "+name);
    }
    public static void task8(int year){

        if (year % 4 == 0 && !(year % 100 ==0)||year % 400 ==0){
            System.out.println("Год "+year+" високосный");
        } else {System.out.println("Год "+year+" не високосный");}


    }

}
