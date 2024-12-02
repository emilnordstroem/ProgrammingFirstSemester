package opgave04;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        // Scanner + Request for prompt from user (whole numbers).
        Scanner user_input = new Scanner(System.in);
        System.out.print("Insert your monthly salary (rounded) without taxes in DKK: ");

        // Prompt saved in int variable and calculation of yearly taxable income
        int monthly_taxable_income = user_input.nextInt();
        int yearly_taxable_income = monthly_taxable_income * 12;

        // Deduction amount + top taxation barrier
        int deduction = 48000;
        int top_taxation_barrier = 568900;

        if(yearly_taxable_income > deduction) { // If-statement for catching users who is edible for taxation

            // Two variables for tax-rate (0.37) and top-taxation-rate (0.15)
            double tax_rate = 0.37;
            double top_tax_rate = 0.15;

            // If the income is below or equal to the top taxation barrier, calculate tax at 37%
            if (yearly_taxable_income <= top_taxation_barrier) {
                double tax_of_income = (yearly_taxable_income - deduction) * tax_rate;

                // Log to console: result of calculations
                System.out.println("Yearly taxable income: " + yearly_taxable_income);
                System.out.println("Yearly tax amount: " + tax_of_income);

            } else if (yearly_taxable_income > top_taxation_barrier){ // Income exceeds the top taxation barrier
                // Tax for the portion of income below the top taxation barrier
                double tax_of_income = (yearly_taxable_income - deduction) * tax_rate;

                // Extra tax for the income above the top taxation barrier
                double top_taxable_income = (yearly_taxable_income - top_taxation_barrier) * top_tax_rate;

                // Log to console: result of calculations
                System.out.println("Yearly taxable income: " + yearly_taxable_income);
                System.out.print("Yearly tax amount: " + (tax_of_income + top_taxable_income));
                System.out.println(" (top taxation accounted: " + top_taxable_income + ")");
            }

        } else { // else, the user is not edible for taxation
            System.out.println("User does not qualify for taxation.");
        }
    }

    public static int calculateTax(int monthlyIncome) {
        return -1;
    }
}
