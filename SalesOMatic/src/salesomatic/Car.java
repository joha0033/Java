/*
 * Name: Austin Robert Johnston

 * Course: COP2551

 * Semester: Fall 2015

 * I pledge on my honor that this work is that of my own. 
 * If I’m found to be in violation of the Academic Integrity
 * policies as outlined in the course syllabus, I understand
 * I will receive an unforgiveable F for this course regardless 
 * of withdrawal status.

 */
package salesomatic;

import java.util.Scanner;

/**
 *
 * @author joha0033
 */
public class Car {
    
    
     private String make;
     private String model;
     private int yearOfManufacture;
     private String vehicleIdentificationNumber;
     private double invoicePrice;
     private double manufacturerSuggestedRetailPrice;
     private String color;
     private double miles;
     
     
     
     

   public Car(String make, String model, int yearOfManufacture, String vehicleIdentificationNumber, double invoicePrice, double manufacturerSuggestedRetailPrice, String color, double miles) 
    {
        Scanner inputInt = new Scanner(System.in);
    
       
       
//        Scanner inputInt = new Scanner(System.in);
        this.make = make;
        this.model = model;
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
        
        this.yearOfManufacture = yearOfManufacture;
         while (yearOfManufacture < 1900 || yearOfManufacture > 9999)
          {
               System.out.printf("Bad Data: %s is NOT a valid year of manufacturing.%n"
                    + "Change data for: %s, %s, %s: "
                    + "",getYearOfManufacture(), getMake(), getModel(), 
                    getVehicleIdentificationNumber());
               yearOfManufacture = inputInt.nextInt();
          }

        
        this.yearOfManufacture = yearOfManufacture;
        
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
        this.invoicePrice = invoicePrice;
        while (invoicePrice < 0)
        {
        System.out.printf("Bad Data: %s is NOT a valid invoice price.%n"
                    + "Change data for: %s, %s, %s: "
                    + "",getInvoicePrice(), getMake(), getModel(), 
                    getVehicleIdentificationNumber());
               invoicePrice = inputInt.nextInt();
        }
        this.invoicePrice = invoicePrice;
        this.manufacturerSuggestedRetailPrice = manufacturerSuggestedRetailPrice;
        
        while (manufacturerSuggestedRetailPrice <= 0)
        {
        System.out.printf("Bad Data: %s is NOT a valid retail price.%n"
                    + "Change data for: %s, %s, %s: "
                    + "",getManufacturerSuggestedRetailPrice(), getMake(), getModel(), 
                    getVehicleIdentificationNumber());
               manufacturerSuggestedRetailPrice = inputInt.nextInt();
        }
        
        this.manufacturerSuggestedRetailPrice = manufacturerSuggestedRetailPrice;
        this.color = color;
        this.miles = miles;
        while (miles <= 0)
        {
             System.out.printf("Bad Data: %s is NOT valid mileage.%n"
                    + "Change data for: %s, %s, %s: "
                    + "",getMiles(), getMake(), getModel(), 
                    getVehicleIdentificationNumber());
               miles = inputInt.nextInt();
        }
        this.miles = miles;
        
        //_______________________________________//
           
        
             
        
    }    
    

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
      
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getVehicleIdentificationNumber() {
        return vehicleIdentificationNumber;
    }

    public void setVehicleIdentificationNumber(String vehicleIdentificationNumber) {
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
    }

    public double getInvoicePrice() {
        return invoicePrice;
    }

    public void setInvoicePrice(double invoicePrice) {
        
        this.invoicePrice = invoicePrice;
    }

    public double getManufacturerSuggestedRetailPrice() {
        return manufacturerSuggestedRetailPrice;
    }

    public void setManufacturerSuggestedRetailPrice(double manufacturerSuggestedRetailPrice) {
        this.manufacturerSuggestedRetailPrice = manufacturerSuggestedRetailPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }
    
        public void displayCar(Car carToDisplay)
    {
        System.out.printf("%-10s %-15s %-15d %-20s $%,-14.2f $%,-14.2f %-15s %,-15.1f%n",
                carToDisplay.getMake(), 
                carToDisplay.getModel(), 
                carToDisplay.getYearOfManufacture(),
                carToDisplay.getVehicleIdentificationNumber(), 
                carToDisplay.getInvoicePrice(),
                carToDisplay.getManufacturerSuggestedRetailPrice(), 
                carToDisplay.getColor(),
                carToDisplay.getMiles());
    }
    
    
     
     
    
}
