# Car-Rental-System
Overview
The Car Management System is a Java-based application designed to manage car details. It allows users to add cars, view the list of added cars, and manage their availability status. The system is structured using classes to encapsulate the functionality and data associated with cars.

Features
Add Car: Users can input details for a new car, including its rate, license plate, model, and availability status.
Display Cars: Users can view a list of all cars added to the system, along with their details.
Availability Check: The system tracks whether a car is available or not.
Components
1. Car Class
Attributes:

rate: The rental price of the car.
licensePlate: The car's license plate number.
model: The model of the car.
isAvailable: A boolean indicating if the car is currently available for rent.
Constructor: Initializes a new Car object with the provided attributes.

Methods:

Getters and setters for each attribute.
main: The entry point of the application where user interaction occurs.
2. CarManager Class
Attributes:

carList: A list that stores instances of the Car class.
Constructor: Initializes the carList as an empty ArrayList.

Methods:

addCar(Car car): Adds a new car to the carList and confirms the addition.
displayCars(): Prints the details of all cars in the list. If no cars are added, it notifies the user.
How to Use the System
Running the Application:

Compile and run the Car class. This will start the application.
Adding Cars:

When prompted, enter the car's rental rate, license plate, model, and availability status (true/false).
After entering the details, the system will confirm that the car has been added.
Continue Adding Cars:

The user will be prompted to add another car. Enter "yes" to continue or "no" to finish.
Viewing Cars:

Once the user decides not to add more cars, the system will display a list of all added cars, including their details.
