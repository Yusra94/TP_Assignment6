package ac.za.cput.company_manager.Domain;

import ac.za.cput.company_manager.domain.FinishedProduct;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/04/24.
 */
public class FinishedProductTest {

    FinishedProduct finishedProduct;

    @Before
    public void setUp() throws Exception {

        finishedProduct = new FinishedProduct.Builder("01").productName("Alk-Det").fiveLiter(3).tenLiter(8).twentyFiveLiter(2).productionDate("21-04-2015").build();
    }

    @Test
    public void testProductName() throws Exception {

        Assert.assertEquals("Alk-Det", finishedProduct.getProductName());
    }

    @Test
    public void testFiveL() throws Exception {

        Assert.assertEquals(3, finishedProduct.getLiterQty5());
    }

    @Test
    public void testTenL() throws Exception {

        Assert.assertEquals(8, finishedProduct.getLiterQty10());
    }

    @Test
    public void testTwentyFiveL() throws Exception {

        Assert.assertEquals(2, finishedProduct.getLiterQty25());
    }

    @Test
    public void testProductionDate() throws Exception {

        Assert.assertEquals("21-04-2015",finishedProduct.getDateProduced());
    }

}
