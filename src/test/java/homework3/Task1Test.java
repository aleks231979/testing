package homework3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    // Метод проверяет работу evenOddNumber по отбору чет и нечет аргумента
    void evenOddNumber() {
        Task1 task1 = new Task1();
        assertTrue(task1.evenOddNumber(2));
        assertFalse(task1.evenOddNumber(3));
    }

}