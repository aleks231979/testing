package homework3.task3;
/**
 * Добавьте функцию в класс UserRepository, которая разлогинивает(прекращает сеанс работы в качестве
 * зарегистрированного пользователя) всех пользователей, кроме
 * администраторов. Для этого, вам потребуется расширить класс User новым свойством, указывающим,
 * обладает ли пользователь админскими правами. Протестируйте данную функцию.
 */

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

 // Метод добавляет нового пользователя в список аутентифицированных пользователей
    public void addUser(User user) {
       if (!findByName(user.name)) {
           user.isAuthenticate = true;
           data.add(user);
       }
    }

    public void relogging() {
        for (User user : data) {
            if (!user.isAdmin) {
                user.isAuthenticate = false;
            }
        }

    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

}