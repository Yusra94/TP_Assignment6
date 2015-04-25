package ac.za.cput.company_manager.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by student on 2015/04/25.
 */
public class Product implements Serializable{

    private String productNumber;
    private String productName;
    private int qty;
    private double sellingPrice;
    private double cost;
    private List<RawMaterial> rawMaterialList;

    public Product() {
    }

    public Product(Builder builder) {
        this.productNumber = builder.productNumber;
        this.productName = builder.productName;
        this.sellingPrice = builder.sellingPrice;
        this.cost = builder.cost;
        this.qty = builder.qty;
        this.rawMaterialList = builder.rawMaterialList;
    }

    public String getProductName() {
        return productName;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double getCost() {
        return cost;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public int getQty() {
        return qty;
    }

    public List<RawMaterial> getRawMaterialList(){return  rawMaterialList;}

    public static class Builder
    {
        private String productNumber;
        private String productName;
        private double sellingPrice;
        private double cost;
        private int qty;
        private List<RawMaterial> rawMaterialList;

        public Builder(String value)
        {
            this.productNumber = value;
        }

        public Builder productName(String value)
        {
            this.productName = value;
            return this;
        }

        public Builder productSellingPrice(double value)
        {
            this.sellingPrice = value;
            return this;
        }

        public Builder productCost(double value)
        {
            this.cost = value;
            return this;
        }

        public Builder itemQty(int value)
        {
            this.qty = value;
            return this;
        }

        public Builder rawMaterialist(List<RawMaterial> value)
        {
            this.rawMaterialList = value;
            return this;
        }

        public Builder copy(Product value)
        {
            this.productNumber = value.productNumber;
            this.productName = value.productName;
            this.cost = value.cost;
            this.sellingPrice = value.sellingPrice;
            this.qty = value.qty;
            this.rawMaterialList = value.rawMaterialList;

            return this;
        }

        public Product build()
        {
            return new Product(this);
        }
    }
}
