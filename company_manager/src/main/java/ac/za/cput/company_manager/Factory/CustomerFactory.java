package ac.za.cput.company_manager.Factory;

import ac.za.cput.company_manager.domain.Customer;
import ac.za.cput.company_manager.domain.Orders;

import java.util.List;

public class CustomerFactory {
    
    public static Customer createCustomer(String customerName, String customerSurname, String customerAddress, String customerPhoneNumber, String customerEmail, List<Orders> ordersList)
    {
        Customer customer = new Customer.Builder(customerName).customerSurname(customerSurname).customerAddress(customerAddress).phoneNumber(customerPhoneNumber).emailAddress(customerEmail).orderList(ordersList).build();
        return customer;
    }
}
