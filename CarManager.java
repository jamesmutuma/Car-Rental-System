package car;

import java.util.ArrayList;
import java.util.List;

public class CarManager {

    static void add(Car car) {
        
    }
    private List<Car> carList;

    // Constructor to initialize the car list
    public CarManager() {
        carList = new ArrayList<>();
    }

    // Method to add a car to the list
    public void addCar(Car car) {
        carList.add(car);
        System.out.println("Car added: " + car.getModel() + " (" + car.getLicensePlate() + ")");
    }

    // Method to display all added cars
    public void displayCars() {
        if (carList.isEmpty()) {
            System.out.println("No cars added.");
            return;
        }

        System.out.println("Cars in the system:");
        for (Car car : carList) {
            System.out.println("Model: " + car.getModel() +
                               ", License Plate: " + car.getLicensePlate() +
                               ", Rate: " + car.getRate() +
                               ", Available: " + (car.isAvailable() ? "Yes" : "No"));
        }
    }
}
