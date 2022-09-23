public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание1");
        char clientOS = 0;
        char releaseYear = 2018;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задание 2
        System.out.println("Задание2");
        clientOS = 1;
        releaseYear = 2017;
        if (clientOS == 1 && releaseYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && releaseYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && releaseYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && releaseYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }


        //Задание 3
        System.out.println("Задание3");
        int year = 1504;
        if ((year % 4==0) && (year % 100 != 0) || (year % 400 == 0) ) {
            System.out.println(year + " год високосный");
        }
        else {
            System.out.println(year + " год не високосный");
        }


        //Задание 4
        System.out.println("Задание4");
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1" );
        }
        else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        }
        else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        }
        else {
            System.out.println("Доставка невозможна");
        }


        //Задание 5
        System.out.println("Задание4");
        int monthNumber = 8;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Месяц " + monthNumber + " принадлежит к зимнему сезону");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц " + monthNumber + " принадлежит к весеннему сезону");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц " + monthNumber + " принадлежит к летнему сезону");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц " + monthNumber + " принадлежит к осеннему сезону");
                break;
            default:
                System.out.println("Данные введены некорректно ");
        }


        }
    }
