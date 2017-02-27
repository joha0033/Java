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
public class SalesPerson {
    
    private String name;
    private String address;
    private String city;
    private String state;
    private int zip;
    private String PhoneNumber;
    private double baseSalary;
    private double totalCommissionEarned;
    private double taxExemptions;

    public SalesPerson(String name, String address, String city, String state, int zip, String PhoneNumber, double baseSalary, double totalCommissionEarned, int taxExemptions) {
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
        this.baseSalary = baseSalary;
         while (baseSalary <= 0)
        {
            System.out.printf("Bad Data: %s is NOT a valid base salary.%n"
                    + "Change data for: %s: "
                    + "",getBaseSalary(), getName());
            baseSalary = inputInt.nextInt();
        }
         this.baseSalary = baseSalary;
        this.totalCommissionEarned = totalCommissionEarned;
        while (totalCommissionEarned <=0)
        {
            System.out.printf("Bad Data: %s is NOT a valid commission.%n"
                    + "Change data for: %s: "
                    + "",getTotalCommissionEarned(), getName());
            totalCommissionEarned = inputInt.nextInt();
        }
        this.totalCommissionEarned = totalCommissionEarned;
        this.taxExemptions = taxExemptions;
         while (taxExemptions <0)
        {
            System.out.printf("Bad Data: %s is NOT a valid tax exemption.%n"
                    + "Change data for: %s: "
                    + "",getTaxExemptions(), getName());
            taxExemptions = inputInt.nextInt();
        }
         this.taxExemptions = taxExemptions;
         
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

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getTotalCommissionEarned() {
        return totalCommissionEarned;
    }

    public void setTotalCommissionEarned(double totalCommissionEarned) {
        this.totalCommissionEarned = totalCommissionEarned;
    }

    public double getTaxExemptions() {
        return taxExemptions;
    }

    public void setTaxExemptions(int taxExemptions) {
        this.taxExemptions = taxExemptions;
    }
    
   public void displaySalesPerson(SalesPerson SalesPersonToDisplay)
    {
        
//        System.out.printf("Sales Person%nName: %s%nAddress: %s%nCity: %s%nState: %s%nZip: %s%nPhone Number: %s%n"
//                + "Base Salary: %s%nTotal Commission: %s%nTax Exemption: %s%n%n",
        System.out.printf("%-20s %-20s %-20s %-10s %-10s %-14s $%,-15.2f $%,-15.2f $%,-15.2f %n",
                SalesPersonToDisplay.getName(), 
                SalesPersonToDisplay.getAddress(), 
                SalesPersonToDisplay.getCity(),
                SalesPersonToDisplay.getState(), 
                SalesPersonToDisplay.getZip(), 
                SalesPersonToDisplay.getPhoneNumber(), 
                SalesPersonToDisplay.getBaseSalary(), 
                SalesPersonToDisplay.getTotalCommissionEarned(), 
                SalesPersonToDisplay.getTaxExemptions());
    }
}
