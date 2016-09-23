package OtherTasks.source_it_web.task;

import java.util.Scanner;

/**
 * @Autor Sergey Pensov
 */

public class Task3 {
    /* ********************************
    * ???????????? ?????? ? 1 *
    * ????????(?): ??. ??. ??-123 *
    * ?????? ?????? ???????? *
    ******************************** */

    public static void doThis() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vvedite ima:");
        String name = scanner.nextLine();
        System.out.print("Enter last name:");
        String lastName = scanner.nextLine();
        System.out.print("Enter middle name:");
        String middleName = scanner.nextLine();
        System.out.print("Enter group number:");
        String groupNumber = scanner.nextLine();
        String[] firstStringArray = new String[3];
        String[] endStringArray = new String[5];
        firstStringArray[0] = " Laboratornaia rabota # 1 ";
        firstStringArray[1] = " Vy`polnil(a): st. gr. " + groupNumber + " ";
        firstStringArray[2] = " " + lastName + " " + name + " " + middleName + " ";
        int maxLength = getMaxLength(firstStringArray) + 2;
        endStringArray[0] = getTitleString(maxLength);
        endStringArray[1] = getNewString(firstStringArray[0], maxLength);
        endStringArray[2] = getNewString(firstStringArray[1], maxLength);
        endStringArray[3] = getNewString(firstStringArray[2], maxLength);
        endStringArray[4] = getTitleString(maxLength);
        render(endStringArray);
    }

    private static int getMaxLength(String[] strings) {
        int max = 0;
        for (String string : strings) {
            if (max < string.length()) max = string.length();
        }
        return max;
    }

    private static String getNewString(String str, int length) {
        str = "*" + str;
        for (int i = str.length(); i < length - 1; i++)
            str += " ";
        str += "*";
        return str;
    }

    private static String getTitleString(int length) {
        String str = "";
        for (int i = 0; i < length; i++)
            str += "*";
        return str;
    }

    private static void render(String[] strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }

}