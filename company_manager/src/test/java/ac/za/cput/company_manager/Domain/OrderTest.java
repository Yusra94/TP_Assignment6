package ac.za.cput.company_manager.Domain;

import ac.za.cput.company_manager.domain.Order;
import ac.za.cput.company_manager.domain.Product;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/04/24.
 */
public class OrderTest {

    Order order;
    Product product;
    List<Product> productList;

    @Before
    public void setUp() throws Exception {

        product = new Product.Builder("01").productName("Product1").itemQty(2).productSellingPrice(50.00).productCost(25.00).build();
        productList = new ArrayList<Product>();
        productList.add(product);
        order = new Order.Builder("12345").totalSales(1500).orderDate("25-02-2015").productList(productList).build();

    }

    @Test
    public void testOrderId() throws Exception {
        org.junit.Assert.assertEquals("12345",order.getOrderNumber());

    }

    @Test
    public void testTotalSales() throws Exception {
        org.junit.Assert.assertEquals(1500.00, order.getTotalSales(),2);

    }

    @Test
    public void testOrderDate() throws Exception {
        org.junit.Assert.assertEquals("25-02-2015", order.getOrderDate());

    }

    @Test
    public void testOrderList() throws Exception {

        org.junit.Assert.assertEquals(productList, order.getProductList());

    }
}
