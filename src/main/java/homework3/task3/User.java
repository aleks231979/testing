package homework3.task3;

/**
 * Добавьте функцию в класс UserRepository, которая разлогинивает(прекращает сеанс работы в качестве
 * зарегистрированного пользователя) всех пользователей, кроме
 * администраторов. Для этого, вам потребуется расширить класс User новым свойством, указывающим,
 * обладает ли пользователь админскими правами. Протестируйте данную функцию.
 */

public class User {

    String name;
    String password;

    boolean isAuthenticate = false;
    boolean isAdmin = false;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void doAdmin() {
        this.isAdmin = true;
        this.isAuthenticate = true;
    }

    //3.6.
    public boolean authenticate(String name, String password) {
        return this.isAuthenticate;
    }

}