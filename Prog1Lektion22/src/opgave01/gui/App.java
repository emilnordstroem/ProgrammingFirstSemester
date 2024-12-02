package opgave01.gui;

import javafx.application.Application;
import opgave01.application.controller.Controller;
import opgave01.application.model.Company;
import opgave01.application.model.Customer;

public class App {
    public static void main(String[] args) {
        initStorage();
        Application.launch(StartWindow.class);
    }
    /**
     * Initializes the storage with some objects.
     */
    public static void initStorage() {
        Company ibm = Controller.createCompany("IBM", 37);
        Company amd = Controller.createCompany("AMD", 40);
        Controller.createCompany("NVIDIA", 45);
        Controller.createCompany("GOOGLE", 32);

        // Opgave 2 - Customer class
        Customer emilStoeve = Controller.createCustomer("Mr.", "Emil Nordstrøm Støve");
        Customer mariaThorKristiansen = Controller.createCustomer("Ms.", "Maria Thor-Kristiansen");
        Controller.addCustomerToCompany(emilStoeve, amd);
        Controller.addCustomerToCompany(mariaThorKristiansen, ibm);

        // Opgave 1 - Added employmentYear as argument
        Controller.createEmployee("Bob Dole", 210, 2020, amd);
        Controller.createEmployee("Alice Schmidt", 250, 1997, ibm);
        Controller.createEmployee("George Down", 150, 2023, amd);

        Controller.createEmployee("Rita Uphill", 300);
    }
}
