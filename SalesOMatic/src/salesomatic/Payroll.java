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
public final class  Payroll {
    private double federalTaxRate;
    private double stateTaxRate;

    public Payroll(double federalTaxRate, double stateTaxRate) {
        
        Scanner input = new Scanner(System.in);
        this.federalTaxRate = federalTaxRate;
        
        if (federalTaxRate <= 0 || federalTaxRate >= 100) 
        {
            System.out.printf("Bad Data: %%%s is NOT a valid tax  federal rate.%n"
                    + "Change data: ", getFederalTaxRate());
            federalTaxRate = input.nextDouble();
        }
           
        this.federalTaxRate = federalTaxRate;
        
        this.stateTaxRate = stateTaxRate;
        {
        if (stateTaxRate <= 0 || stateTaxRate >= 100) {
            System.out.printf("Bad Data: %%%s is NOT a valid tax state rate.%n"
                    + "Change data: ", getStateTaxRate());
            stateTaxRate = input.nextDouble();
            
        }
        this.stateTaxRate = stateTaxRate;
        }
    }

    public double getFederalTaxRate() {
        return federalTaxRate;
    }

    public void setFederalTaxRate(double federalTaxRate) {
        this.federalTaxRate = federalTaxRate;
    }

    public double getStateTaxRate() {
        return stateTaxRate;
    }

    public void setStateTaxRate(double stateTaxRate) {
        this.stateTaxRate = stateTaxRate;
    }
    
    public void processPayroll(SalesPerson employee)
            {
                
                double taxable = employee.getBaseSalary()+employee.getTotalCommissionEarned();
                double fedTax = taxable*(this.federalTaxRate/100);
                double stTax = taxable*(this.stateTaxRate/100);
                double taxSum = fedTax+stTax;
                double exemptions = 5000;
                        
                double takeHome = taxable-(taxSum-exemptions);
//              
                System.out.printf("%-20s $%,-12.2f $%,-12.2f $%,-12.2f $%,-12.2f $%,-12.2f $%,-13.2f $%,-13.2f %n"
                        + "", employee.getName(), employee.getBaseSalary(), 
                        employee.getTotalCommissionEarned(),
                        taxable, fedTax, stTax, exemptions, takeHome
                        );
                
            }
       public void displayPayroll(Payroll PayrollToDisplay)
    {
        System.out.printf("%%%-14.0f %%%-20.0f%n%n", 
                PayrollToDisplay.getFederalTaxRate(), 
                PayrollToDisplay.getStateTaxRate());
    }

   
}
