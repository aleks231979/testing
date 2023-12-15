package homework2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    //Проверить, что экземпляр объекта Car также является экземпляром транспортного средства
    // (используя оператор instanceof).
    @Test
    void isTypeVehicle() {
        Car car = new Car("Audi", "Q8", 2020);
        assertTrue(car instanceof Vehicle);
    }

    //Проверить, что объект Car создается с 4-мя колесами.
    @Test
    void has4Wheels() {
        Car car = new Car("Audi", "Q8", 2020);
        assertEquals(4, car.getNumWheels());
    }

    //Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    void has2Wheels() {
        Motorcycle moto = new Motorcycle("Suzuki", "Q8", 2020);
        assertEquals(2, moto.getNumWheels());
    }

    //Проверить, что объект Car развивает скорость 60 в режиме тестового вождения
    // (используя метод testDrive()).
    @Test
    void speedInTestDriveCar() {
        Car car = new Car("Audi", "Q8", 2020);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    //Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения
    //(используя метод testDrive()).
    @Test
    void speedInTestDriveMoto() {
        Motorcycle moto = new Motorcycle("Suzuki", "Q8", 2020);
        moto.testDrive();
        assertEquals(75, moto.getSpeed());
    }

    //Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения
    //транспорта) машина останавливается (speed = 0)
    @Test
    void testSpeedInParkCar() {
        Car car = new Car("Audi", "Q8", 2020);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    //Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения
    //транспорта) мотоцикл останавливается (speed = 0).
    @Test
    void testSpeedInParkMoto() {
        Motorcycle moto = new Motorcycle("Suzuki", "Q8", 2020);
        moto.testDrive();
        moto.park();
        assertEquals(0, moto.getSpeed());
    }

    //

    @Test
    void testDrive() {
    }

    @Test
    void park() {
    }
}