package OtherTasks.TestCreateObjects;

/**
 * Created by Олександр Шаповал on 26.09.2016.
 *
 * Тестовый объект User List
 */

public class UserList {
    private User[] list = new User[100];
    private int p = 0;

    public void add(User s) {
        list[p++] = s;
    }

    public User get(int n){
        return list[n];
    }

    public int find(String name) {
        for (int i = 0; i < p; i++) {
            if (list[i].getUserName().equalsIgnoreCase(name)){
                return i;
            }
        }

        return -1;
    }
}
