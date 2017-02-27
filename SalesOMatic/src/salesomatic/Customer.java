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
public class Customer 
{
    
    
    private String name;
    private String address;
    private String city;
    private String state;
    private int zip;
    private String PhoneNumber;
    
    Customer(String name, String address, String city, String state, int zip, String PhoneNumber) {
        Scanner inputInt = new Scanner(System.in);
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
            while (zip <= 9999 || zip >= 100000)
        {
            System.out.printf("Bad Data: %s is NOT a valid zip code.%n"
                    + "Change data for: %s: "
                    + "",getZip(), getName());
            zip = inputInt.nextInt();
            
        }
        this.zip=zip;
        this.PhoneNumber = PhoneNumber;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }
       public void displayCustomer(Customer CustomerToDisplay)
    {
        //System.out.printf("Name: %s%nAddress: %s%nCity: %s%nState: %s%nZip: %s%nPhone Number: %s%n%n",
        System.out.printf("%-20s %-20s %-20s %-10s %-10s %-15s%n",
                CustomerToDisplay.getName(), 
                CustomerToDisplay.getAddress(), 
                CustomerToDisplay.getCity(),
                CustomerToDisplay.getState(), 
                CustomerToDisplay.getZip(), 
                CustomerToDisplay.getPhoneNumber());
    }
    
} 

