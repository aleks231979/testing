package homework2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    private Car car;
    private  Motorcycle moto;

    @BeforeEach
    void init() {
        car = new Car("Audi", "Q8", 2020);
        moto = new Motorcycle("Suzuki", "Q8", 2020);

    }

    //Проверить, что экземпляр объекта Car также является экземпляром транспортного средства
    // (используя оператор instanceof).
    @Test
    void isTypeVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    //Проверить, что объект Car создается с 4-мя колесами.
    @Test
    void has4Wheels() {
        assertEquals(4, car.getNumWheels());
    }

    //Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    void has2Wheels() {
        assertEquals(2, moto.getNumWheels());
    }

    //Проверить, что объект Car развивает скорость 60 в режиме тестового вождения
    // (используя метод testDrive()).
    @Test
    void speedInTestDriveCar() {
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    //Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения
    //(используя метод testDrive()).
    @Test
    void speedInTestDriveMoto() {
        moto.testDrive();
        assertEquals(75, moto.getSpeed());
    }

    //Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения
    //транспорта) машина останавливается (speed = 0)
    @Test
    void testSpeedInParkCar() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    //Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения
    //транспорта) мотоцикл останавливается (speed = 0).
    @Test
    void testSpeedInParkMoto() {
        moto.testDrive();
        moto.park();
        assertEquals(0, moto.getSpeed());
    }
    @Test
    // При попытки вызвать метод testDrive() у несуществующего объекта корректно обрабатывается ошибка
    // NullPointerException. Аналогично будет работать с классом Motorcycle и методом park()
    // assertThrows(NullPointerException.class, () -> moto.park(),
        //                "Can`t do park without moto initializing");

    void test() {
        Car car = null;
        assertThrows(NullPointerException.class, () -> car.testDrive(),
                "Can`t do testDrive without car initializing");
    }
}