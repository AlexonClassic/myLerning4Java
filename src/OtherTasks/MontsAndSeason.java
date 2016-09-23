package OtherTasks;

import java.util.Scanner;

/**
 * Created by Олександр Шаповал on 22.06.2016.
 *
 * К какому сезону принадлежит месяц.
 */

class MontsAndSeason {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер месяца: ");
        int montsNumber = scanner.nextInt();
        System.out.println();

        SeasonPeriod(montsNumber);
        System.out.println("\n--------------------------\n");
        SeasonPeriodCase(montsNumber);
    }

    static void SeasonPeriod(int montsNumber) {
        String monts = " ";

        if (montsNumber == 12 || montsNumber == 1 || montsNumber == 2) {
            if (montsNumber == 12){
                monts = "Декабрь";
            }else if (montsNumber == 1){
                monts = "Январь";
            }else {
                monts = "Февраль";
            }
            System.out.println(monts + " относится к зиме");
        } else if (montsNumber == 3 || montsNumber == 4 || montsNumber == 5) {
            if (montsNumber == 3){
                monts = "Март";
            }else if (montsNumber == 4){
                monts = "Апрель";
            }else {
                monts = "Май";
            }
            System.out.println(monts + " относится к весне");
        } else if (montsNumber == 6 || montsNumber == 7 || montsNumber == 8) {
            if (montsNumber == 6){
                monts = "Июнь";
            }else if (montsNumber == 7){
                monts = "Июль";
            }else {
                monts = "Август";
            }
            System.out.println(monts + " относится к лету");
        } else if (montsNumber == 9 || montsNumber == 10 || montsNumber == 11) {
            if (montsNumber == 9){
                monts = "Сентябрь";
            }else if (montsNumber == 10){
                monts = "Октябрь";
            }else {
                monts = "Ноябрь";
            }
            System.out.println(monts + " относится к осени");
        }
    }

    static void SeasonPeriodCase(int montsNumberCase) {
        switch (montsNumberCase){
            case 12:
            case 1:
            case 2:
                System.out.println("Это - зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это - весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это - лето");
                break;
            default:
                System.out.println("Это - осень");
        }
    }
}