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
public class Sale {

//    - downPayment: double
//- salePrice: double
//- incentiveAmount: double
//- carTaxRate: double
//- totalPrice: double
    private double downPayment;
    private double salePrice;
    private double incentiveAmount;
    private double carTaxRate;
    private double totalPrice;

    public Sale(double downPayment, double salePrice, double incentiveAmount, double carTaxRate, double totalPrice) {
        Scanner inputInt = new Scanner(System.in);
        this.downPayment = downPayment;
        //this.downPayment = getSalePrice()*.03;
        while (downPayment <= 0) {
            System.out.printf("Bad Data: %s is NOT a valid down payment.%n"
                    + "Change data: "
                    + "", getDownPayment());
            downPayment = inputInt.nextInt();
        }
        this.downPayment = downPayment;
        this.salePrice = salePrice;
        while (salePrice <= 0) {
            System.out.printf("Bad Data: %s is NOT a valid sale price.%n"
                    + "Scroll up to find price and change data: ", getSalePrice());
            salePrice = inputInt.nextInt();
        }
        this.salePrice = salePrice - downPayment;

        this.incentiveAmount = incentiveAmount;
        while (incentiveAmount <= 0) {
            System.out.printf("Bad Data: %s is NOT a valid incentive amount.%n"
                    + "Change data: ", getIncentiveAmount());
            incentiveAmount = inputInt.nextInt();
        }
        this.incentiveAmount = incentiveAmount;
        this.carTaxRate = carTaxRate;
        if (carTaxRate <= 0 || carTaxRate >= 100) {
            System.out.printf("Bad Data: %%%s is NOT a valid tax rate.%n"
                    + "Change data: ", getCarTaxRate()*100);
            carTaxRate = inputInt.nextDouble();
            carTaxRate = carTaxRate/100;
        }
        this.carTaxRate = carTaxRate;
        this.totalPrice = this.salePrice + (carTaxRate * (this.salePrice));
     
        
    }

    public double getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(double downPayment) {
        //this.salePrice = price.getInvoicePrice();
        this.downPayment = downPayment;
    }

    public double getSalePrice() {
        //this.salePrice = price.getInvoicePrice();
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
//        while (salePrice <= 0)
//            System.out.printf("Bad Data: %s is NOT a valid down payment.%n"
//                    + "Change data: ", getSalePrice());
//        salePrice = = inputInt.nextInt()
        this.salePrice = salePrice;
    }

    public double getIncentiveAmount() {
        return incentiveAmount;
    }

    public void setIncentiveAmount(double incentiveAmount) {
        this.incentiveAmount = incentiveAmount;
    }

    public double getCarTaxRate() {
        return carTaxRate;
    }

    public void setCarTaxRate(double carTaxRate) {
        this.carTaxRate = carTaxRate;
    }

    public double getTotalPrice() {
        //return totalPrice;
        return (salePrice - downPayment) * .03 + salePrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    public void processSale(Car carSold,SalesPerson salesmanThatSoldCar)
	{
            
		double totalPrice = carSold.getManufacturerSuggestedRetailPrice() - 
                        this.getDownPayment() - this.getIncentiveAmount();
		double tax = totalPrice*this.getCarTaxRate();
                //this.totalPrice=totalPrice+tax;
                double totalAndTax = totalPrice+tax;
                //System.out.printf("Here: %s %n", totalPrice);
                System.out.printf("$%,-15.2f $%,-19.2f $%,-13.2f%n", totalPrice, tax, totalAndTax);
	}
    
    public void processReceipt(Car carSold, Customer buyer, SalesPerson seller)
    {
       String buyerName = buyer.getName();
       String sellerName = seller.getName();
       String sold = carSold.getMake() + " " + carSold.getModel();
       
       double msrp = carSold.getManufacturerSuggestedRetailPrice();
       double moneyDown = this.downPayment;
       
               
       double totalPrice = carSold.getManufacturerSuggestedRetailPrice() - 
                        this.getDownPayment() - this.getIncentiveAmount();
		double tax = totalPrice*this.getCarTaxRate();
                double totalAndTax = totalPrice+tax; 
                      System.out.printf("%-20s %-20s %-20s $%,-14.2f $%,-14.2f $%,-14.2f $%,-14.2f $%,-14.2f %n", buyerName, sold, sellerName, msrp,
                        moneyDown, this.incentiveAmount, tax, totalAndTax);
       
    }
//
    
 
}
