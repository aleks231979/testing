package homework3;

public class Task2 {
    //Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли
    //переданное число в интервал (25;100)
    public boolean numberInInterval(int n) {
        if (n > 25 && n < 100) {
            return true;
        } else {
            return false;
        }
    }
}
