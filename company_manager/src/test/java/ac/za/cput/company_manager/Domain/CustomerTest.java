package ac.za.cput.company_manager.Domain;

import ac.za.cput.company_manager.domain.Customer;
import ac.za.cput.company_manager.domain.Order;
import ac.za.cput.company_manager.domain.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/04/24.
 */
public class CustomerTest {

    Customer customer;
    Order order;
    List<Order> ordersList;
    List<Product> productList;
    List<Product> productList1;
    List<Order> ordersList1;
    Customer customer2;
    Order order1;


    @Before
    public void setUp() throws Exception {

        productList = new ArrayList<Product>();
        productList.add(new Product.Builder("001").productName("Chlorine").itemQty(5).productCost(50.00).productSellingPrice(80.00).build());
        productList.add(new Product.Builder("002").productName("Dishwasher").itemQty(3).productCost(22.00).productSellingPrice(36.00).build());

        order = new Order.Builder("255").orderDate("15-2-2014").totalSales(300.00).productList(productList).build();
        ordersList = new ArrayList<Order>();
        ordersList.add(order);

        customer = new Customer.Builder("12345").customerName("Harry").customerSurname("Potter").customerAddress("Hogwarts").emailAddress("HarryP@yahoo.com").phoneNumber("55512345").orderList(ordersList).build();

    }

    @Test
    public void testCustomerId() throws Exception {

        Assert.assertEquals("12345", customer.getCustomerID());
    }

    @Test
    public void testCustomerName() throws Exception {

        Assert.assertEquals("Harry", customer.getCustomerName());
    }

    @Test
    public void testCustomerSurname() throws Exception {

        Assert.assertEquals("Potter", customer.getCustomerSurname());
    }

    @Test
    public void testCustomerAddress() throws Exception {

        Assert.assertEquals("Hogwarts", customer.getCustomerAddress());
    }

    @Test
    public void testCustomerEmail() throws Exception {

        Assert.assertEquals("HarryP@yahoo.com", customer.getCutomerEmailAddress());
    }

    @Test
    public void testCustomerPhone() throws Exception {

        Assert.assertEquals("55512345", customer.getCustomerPhoneNumber());
    }

    @Test
    public void testCustomerOrdersList() throws Exception {

        Assert.assertEquals(ordersList, customer.getOrders());

    }
}
