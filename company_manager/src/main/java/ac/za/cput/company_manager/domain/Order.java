package ac.za.cput.company_manager.domain;

import java.util.List;

public class Order {

    private String orderNumber;
    private String orderDate;
    private double totalSales;
    private List<FinishedProduct> finishedProductList;
    private List<Product> productList;

    public Order() {
    }

    public Order(Builder builder) {
        this.orderNumber = builder.orderNumber;
        this.orderDate = builder.orderDate;
        this.totalSales = builder.totalSales;
        this.finishedProductList = builder.finishedProductList;
        this.productList = builder.productList;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public List<FinishedProduct> getFinishedProduct(){return finishedProductList;}

    public String getOrderDate() {
        return orderDate;
    };

    public double getTotalSales() {
        return totalSales;
    }

    public List<Product> getProductList(){return productList;}

    public static class Builder
    {
        private String orderNumber;
        private String orderDate;
        private double totalSales;
        private List<FinishedProduct> finishedProductList;
        private List<Product> productList;

        public Builder(String orderNumber) {
            this.orderNumber = orderNumber;
        }

        public Builder orderDate(String orderDate)
        {
            this.orderDate = orderDate;
            return this;
        }

        public Builder totalSales(double total)
        {
            this.totalSales = total;
            return this;
        }

        public Builder productList(List<Product> value)
        {
            this.productList = value;
            return this;
        }

        public Builder copy(Order value)
        {
            this.orderNumber = value.orderNumber;
            this.finishedProductList = value.finishedProductList;
            this.orderDate = value.orderDate;
            this.totalSales = value.totalSales;
            this.productList = value.productList;
            return this;
        }

        public Order build()
        {
            return new Order(this);
        }
    }
}


