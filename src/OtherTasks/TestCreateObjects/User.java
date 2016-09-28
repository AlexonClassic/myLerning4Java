package OtherTasks.TestCreateObjects;

/**
 * Created by Олександр Шаповал on 23.09.2016.
 *
 * Тестовый объект User
 */

public class User {
    private  int userId;
    private  String userName;
    private  String userLastName;
    private  String userBirthday;
    private  int userAge;
    private  String userGender;
    private  String userCitizenship;
    private  String userLive;

    public User(int userId, String userName, String userLastName, String userBirthday, int userAge, String userGender, String userCitizenship, String userLive) {
        this.userId = userId;
        this.userName = userName;
        this.userLastName = userLastName;
        this.userBirthday = userBirthday;
        this.userAge = userAge;
        this.userGender = userGender;
        this.userCitizenship = userCitizenship;
        this.userLive = userLive;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserCitizenship() {
        return userCitizenship;
    }

    public void setUserCitizenship(String userCitizenship) {
        this.userCitizenship = userCitizenship;
    }

    public String getUserLive() {
        return userLive;
    }

    public void setUserLive(String userLive) {
        this.userLive = userLive;
    }

    @Override
    public String toString() {
        System.out.println();
        System.out.println("----------------------");
        return "UserID: "+ userId + ". User: " + userName + " " + userLastName + ". User Birthday: " + userBirthday + ", hi is " + userAge + " yars old. His gender is: " + userGender + ". User Citizenship is: " + userCitizenship + " and user live in: " + userLive + ".";
    }
}
