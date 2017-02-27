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
public class SalesOMatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // we'll begin by initalizing some objects with data by calling
        // the constructor with keyword new
        // we could pass variables into the constructor, but we'll just use
        // literals for now to make the classes easier to test; just assume
        // that in the lines prior to here that we retrieved these literals
        Car carInInventory1 = new Car("Ford", "Fiesta", 2015, "1ABC39223V634", 14500, 18750, "Pink", 3.2);
        Car carInInventory2 = new Car("Jeep", "Wrangler", 2015, "1482924V634", 20250, 29000, "Yellow", 6);
        Car carInInventory3 = new Car("Dodge", "Charger", 2016, "ZOOMZOOMZOOM", 26650, 37500, "Black", .1);
        Car carInInventory4 = new Car("Kia", "Altima", 2015, "1038101023CHEAP", 9500, 15000, "White", 3.4);
        Car carInInventory5 = new Car("DMC", "DeLorean", 1, "ABC123ABC12399", -12.1, -1, "Gray", -92.7);
        // display debugging prompt
        System.out.printf("Line 30: Cars with good data initalized with constructor. Dumping results.");
 
        // output data stored in instances of class using some static methods
        printLine();
        printCarHeader();

        carInInventory1.displayCar(carInInventory1);
        carInInventory2.displayCar(carInInventory2);
        carInInventory3.displayCar(carInInventory3);
        carInInventory4.displayCar(carInInventory4);
        carInInventory5.displayCar(carInInventory5);
        //---------------------------//
        
        printLine();
 
        waitForUser();
        
        //Car carInInventory1 = new Car("Ford", "Fie sta", 2015, "1ABC39223V634", 14500, 18750, "Pink", 3.2);
        Customer Customer1 = new Customer("Jim Morrison", "520 Pine Street", "Neptune Beach", "FL", 32266, "(904) 305-9090");
        Customer Customer2 = new Customer("Osama Obama", "1600 Penn. Avenue", "Washington DC", "VA", 56879, "911");
        Customer Customer3 = new Customer("Cher Bono", "777 Hevean Blvd", "St. Louis", "MI", 43344, "(405) 867-9080");
        Customer Customer4 = new Customer("Roger Rabbit", "666 My Dr.", "Looneyvile", "ME", 11011, "411");
        //Customer BadCustomer = new Customer("Jay Leno", "4560 Magnolia St", "atlantic Beach", "FL", 333, "(305) 305-9090");

        //waitForUser();
        printLine();
        System.out.printf("<Load Customers>%n%n");
        printCustomerHeader();
        Customer1.displayCustomer(Customer1);
        Customer2.displayCustomer(Customer2);
        Customer3.displayCustomer(Customer3);
        Customer4.displayCustomer(Customer4);
        //BadCustomer.displayCustomer(BadCustomer);
        
        printLine();
 
        waitForUser();
        
        SalesPerson SalesPerson1 = new SalesPerson("Anthony Thompson", "210 Pointsietta St", "Atlantic Beach", "FL", 32266, "(407) 960-0464", 30000, 25000, 5000);
        SalesPerson SalesPerson2 = new SalesPerson("Larry Bird", "12 Main St", "Boston", "MA", 69010, "(788) 324-9898", 100000, 10000, 5000);
        SalesPerson SalesPerson3 = new SalesPerson("Ari Gold", "692 Beverly Ave", "Neptune Beach", "FL", 32266, "(350) 786-5848", 45000, 30000, 5000);
        SalesPerson SalesPerson4 = new SalesPerson("Jesus Christ", "120 Magnolia Ave", "Neptune Beach", "FL", 32266, "(398) 566-2309", 35000, 20000, 5000);
        //SalesPerson BadSalesPerson = new SalesPerson("Marty Owens", "692 Pine St", "Neptune Beach", "FL", 322, "(350) 786-5848", -45000, -30000, 5000);
        printLine();
        System.out.printf("<Load Sale Force>%n%n");
        printSalesPersonHaeder();
        SalesPerson1.displaySalesPerson(SalesPerson1);
        SalesPerson2.displaySalesPerson(SalesPerson2);
        SalesPerson3.displaySalesPerson(SalesPerson3);
        SalesPerson4.displaySalesPerson(SalesPerson4);
        //BadSalesPerson.displaySalesPerson(BadSalesPerson);
        
        printLine();
        
        
        
        //Sale BadSale = new Sale(-1, -10000, -90, -.03, -10);
        Sale Sale2 = new Sale(1200, 29000, 1000, .07, 0);
        Sale Sale3 = new Sale(1000, 37500, 1500, .07, 0);
        Sale Sale4 = new Sale(1000, 15000, 1000, .07, 0);
        Sale Sale1 = new Sale(3000, 1000, 1000, .07, 0);
        Payroll Payroll1 = new Payroll(18, 9);
        
        waitForUser();
        printLine();
        System.out.printf("<Load Sales Receipt>%n%n");
        printReceiptHeader();
        Sale2.processReceipt(carInInventory2, Customer4, SalesPerson1);
        Sale3.processReceipt(carInInventory3, Customer1, SalesPerson3);
        Sale4.processReceipt(carInInventory4, Customer3, SalesPerson2);
        Sale1.processReceipt(carInInventory4, Customer2, SalesPerson4);
        //BadSale.processReceipt(carInInventory5, BadCustomer, BadSalesPerson);
        
        printLine();
        waitForUser();
       printPayrollTaxHeader();
        Payroll1.displayPayroll(Payroll1);
        System.out.printf("<Load Payroll Information>%n%n");
        printPayrollHeader();
        Payroll1.processPayroll(SalesPerson1);
        Payroll1.processPayroll(SalesPerson2);
        Payroll1.processPayroll(SalesPerson3);
        Payroll1.processPayroll(SalesPerson4);
    }
 
    /**
     * This method outputs a line of dashes to the console for formatting
     * purposes
     */
    public static void printLine()
    {
        System.out.printf("%n%n---------------------------------------------------%n%n");
    }
 
    /**
     * This method outputs the header for our car display table
     */
    public static void printCarHeader()
    {
        System.out.printf("%-10s %-15s %-15s %-20s %-15s %-15s %-15s %-15s%n", "Make", "Model", "Year", "VIN", "Invoice", "MSRP", "Color", "Miles");
    
    }
 
    public static void printCustomerHeader()
    {
        System.out.printf("%-20s %-20s %-20s %-10s %-10s %-15s%n", "Name", "Address", "City", "State", "Zip", "Phone");
    }
    public static void printSalesPersonHaeder()
    {
        System.out.printf("%-20s %-20s %-20s %-10s %-10s %-15s %-15s %-15s %-15s %n", "Name", "Address", "City", "State", "Zip", "Phone", "Salary", "Commission", "Exemptions");
    }
    public static void printReceiptHeader()
    {
        System.out.printf("%-20s %-20s %-20s %-15s %-16s %-15s %-15s %-15s %n", "Buyer","Car", "Seller", "MSRP", "Money Down", "Incentive", "Taxes", "Total");
    }
    
    public static void printPayrollHeader()
    {
       System.out.printf("%-20s %-13s %-13s %-13s %-13s %-13s %-13s %-15s %n","Sales Person", "Base Salray", "Commission", "Taxable", "Fed Taxes", "State Taxes", "Tax Exemptions", "Take Home Pay");
    }
    
    public static void printPayrollTaxHeader()
    {
            System.out.printf("%-14s %-20s%n", "Fed Tax", "State Tax");
    }
    
    public static void printProcessSale()
    {
         System.out.printf("%-16s %-20s %-17s %n", "Discount Price", "State Tax", "Total Owed");
    }
 
    /**
     * A simple method for allowing breaks between steps in the program: the
     * user must press any key to continue the processing of the application
     */
    public static void waitForUser()
    {
        System.out.printf("Press any key to continue. . .%n");
        new Scanner(System.in).nextLine(); // no need to store this instance in a variable
        
    }
 

}
    

