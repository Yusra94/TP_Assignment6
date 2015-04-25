package ac.za.cput.company_manager.domain;

import java.io.Serializable;
import java.util.List;

public class Customer implements Serializable{

    private String customerID;
    private String customerName;
    private String customerSurname;
    private String customerAddress;
    private String CustomerPhoneNumber;
    private String cutomerEmailAddress;
    private List<Order> orders;

    public Customer() {
    }

    public Customer(Builder builder) {
        this.customerID = builder.customerID;
        this.customerName = builder.customerName;
        this.customerSurname = builder.customerSurname;
        this.customerAddress = builder.customerAddress;
        this.CustomerPhoneNumber = builder.customerPhoneNumber;
        this.cutomerEmailAddress = builder.customerEmailAddress;
        this.orders = builder.orders;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public String getCustomerPhoneNumber() {
        return CustomerPhoneNumber;
    }

    public String getCutomerEmailAddress() {
        return cutomerEmailAddress;
    }

    public  List<Order> getOrders(){return orders;}

    public static class Builder
    {
        private String customerID;
        private String customerName;
        private String customerSurname;
        private String customerAddress;
        private String customerPhoneNumber;
        private String customerEmailAddress;
        private List<Order> orders;

        public Builder(String customerID)
        {
            this.customerID = customerID;
        }

        public Builder customerName(String name){

            this.customerName = name;
            return this;
        }
        public Builder customerSurname(String surname){

            this.customerSurname = surname;
            return this;
        }

        public Builder customerAddress( String address){

            this.customerAddress = address;
            return this;
        }

        public Builder phoneNumber(String phoneNumber){

            this.customerPhoneNumber = phoneNumber;
            return this;
        }

        public Builder emailAddress(String email){

            this.customerEmailAddress = email;
            return this;
        }

        public Builder orderList(List<Order> value)
        {
            this.orders = value;
            return this;
        }

        public Builder copy(Customer value)
        {
            this.customerID = value.customerID;
            this.customerName = value.customerName;
            this.customerAddress = value.customerAddress;
            this.customerEmailAddress = value.cutomerEmailAddress;
            this.customerPhoneNumber = value.CustomerPhoneNumber;
            this.orders = value.orders;
            return this;
        }

        public Customer build()
        {
            return new Customer(this);
        }


    }
}
