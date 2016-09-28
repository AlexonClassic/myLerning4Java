package OtherTasks.TestCreateObjects;

import java.util.Scanner;

/**
 * Created by Олександр Шаповал on 23.09.2016.
 *
 * Тестовая проба создания объекта User
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------");
        System.out.print("How many users you want to create? ");
        int userNumber = scanner.nextInt();

        int userId = 0;
        String userName = "";
        String userLastName = "";
        String userBirthday = "";
        int userAge = 0;
        String userGender = "";
        String userCitizenship = "";
        String userLive = "";

        for (int i = 0; i < userNumber; i++) {
            System.out.println("----------------------");
            System.out.print("Enter User ID: ");
            userId = scanner.nextInt();
            System.out.print("Enter User Name: ");
            userName = scanner.next();
            System.out.print("Enter User Last name: ");
            userLastName = scanner.next();
            System.out.print("Enter User Birthday: ");
            userBirthday = scanner.next();
            System.out.print("Enter User age: ");
            userAge = scanner.nextInt();
            System.out.print("Enter User Gender: ");
            userGender = scanner.next();
            System.out.print("Enter User Citizenship: ");
            userCitizenship = scanner.next();
            System.out.print("Enter where User live: ");
            userLive = scanner.next();
        }

        User user = new User(userId, userName, userLastName, userBirthday, userAge, userGender, userCitizenship, userLive);

//            System.out.println("----------------------");
//            System.out.print("Enter User ID: ");
//            user.setUserId(scanner.nextInt());
//            System.out.print("Enter User Name: ");
//            user.setUserName(scanner.next());
//            System.out.print("Enter User Last name: ");
//            user.setUserLastName(scanner.next());
//            System.out.print("Enter User Birthday: ");
//            user.setUserBirthday(scanner.next());
//            System.out.print("Enter User age: ");
//            user.setUserAge(scanner.nextInt());
//            System.out.print("Enter User Gender: ");
//            user.setUserGender(scanner.next());
//            System.out.print("Enter User Citizenship: ");
//            user.setUserCitizenship(scanner.next());
//            System.out.print("Enter where User live: ");
//            user.setUserLive(scanner.next());

        System.out.println(user);
        System.out.println();

        final UserList sl = new UserList();
        sl.add(new User(userId, userName, userLastName, userBirthday, userAge, userGender, userCitizenship, userLive));
        sl.add(new User(userId, userName, userLastName, userBirthday, userAge, userGender, userCitizenship, userLive));

        int n = sl.find("Vova");
        System.out.println(sl.get(n).getUserBirthday().toString());
    }
}
