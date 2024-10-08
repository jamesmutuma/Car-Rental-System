
package car;

import java.util.Scanner;

public class Car {

    
    private String Rate;
    private String licensePlate;
    private String model;
    private boolean isAvailable;
    
    //Create constructor 
    public Car (String Rate, String licensePlate, String model, boolean isAvailable)
    {
    this.Rate=Rate;
    this.licensePlate=licensePlate;
    this.model=model;
    this.isAvailable=isAvailable;
    
    }
    
    //generate getters and setters
    public String getRate(){
        return Rate;
    }
    public String setRate(){
        return Rate;
    }
    public String getlicensePlate(){
        return licensePlate;
    }
    public String setlicensePlate(){
        return licensePlate;
    }
    public String getmodel(){
        return model;
    }
    public String setmodel(){
        return model;
    }
    public boolean getisAvailable(){
        return isAvailable;
    }
    public boolean setisAvailable(){
        return isAvailable;
    }
    
     String getModel() {
       return model;//To change body of generated methods, choose Tools | Templates.
    }

    String getLicensePlate() {
        return licensePlate; //To change body of generated methods, choose Tools | Templates.
    }

    boolean isAvailable() {
        return isAvailable; //To change body of generated methods, choose Tools | Templates.
    }
    
    //Create Main Method
    public static void main(String[] args) {
  // Creating scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        CarManager carManager = new CarManager();
         String userInput;
         do {
            // Prompt for vehicle details
            System.out.print("Enter car price: ");
            String Rate = scanner.nextLine();

            System.out.print("Enter car model: ");
            String licensePlate = scanner.nextLine();
            
            System.out.print("Enter car model: ");
            String model = scanner.nextLine();
            
             System.out.print("Is the car electric? (true/false): ");
            boolean isAvailble = scanner.nextBoolean();
            scanner.nextLine();
         
         Car car=new Car(Rate, licensePlate, model, isAvailble);
         CarManager.add(car);
        
            

  // Ask if the user wants to add another vehicle
            System.out.print("Do you want to add another vehicle? (yes/no): ");
            userInput = scanner.nextLine();
        
    }
         while (userInput.equalsIgnoreCase("yes"));
        System.out.println("Cars added");
        scanner.close(); 
    }

   
   

}
