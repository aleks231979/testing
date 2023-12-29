package homework6;

import java.io.IOException;
import java.util.*;

public class UI {
    public static Scanner input = new Scanner(System.in);
    /**
     * Приём значений от пользователя, обработка некорректных значений.
     * return list - на выходе список целых натуральных чисел по параметрам пользователя
     * */

    public List<Integer> createListByUserParametrs() { //
        System.out.println("Введите длину списка:");
        int chek = 0;
        try {
            chek = getRuleNumberFromUser();
        } catch (InputMismatchException e) {
            System.out.println("Неверный формат ввода! Введите натуральное целое число");
        }
        System.out.println("Вводите элементы списка по 1 через нажатие Enter <__|:");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < chek; i++) {
            try {
                list.add(getRuleNumberFromUser());
            } catch (InputMismatchException e) {
                System.out.println("Неверный формат ввода! Введите натуральное целое число");
            }
        }
        return list;
    }
    /**
     * Прием корректного целого натурального числа от пользователя.
     * return chek возврат полученного числа в случае успешного ввода и проброс исключения
     * в случае некорректного ввода
     * */

    public int getRuleNumberFromUser() {
            int chek = input.nextInt();
            if (chek > 0) {
                return chek;
            } else {
                throw new InputMismatchException();
            }
    }
}
