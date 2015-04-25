package ac.za.cput.company_manager.domain;

import java.io.Serializable;
import java.util.List;

public class FinishedProduct implements Serializable{

    private String productNumber;
    private String productName;
    private int literQty5;
    private int literQty10;
    private int literQty25;
    private String dateProduced;
    private List<RawMaterial> rawMaterialList;

    public FinishedProduct() {
    }

    public FinishedProduct(Builder builder) {
        this.productNumber = builder.productNumber;
        this.productName = builder.productName;
        this.literQty5 = builder.literQty5;
        this.literQty10 = builder.literQty10;
        this.literQty25 = builder.literQty25;
        this.dateProduced = builder.dateProduced;
        this.rawMaterialList = builder.rawMaterialList;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public int getLiterQty5() {
        return literQty5;
    }

    public int getLiterQty10() {
        return literQty10;
    }

    public int getLiterQty25() {
        return literQty25;
    }

    public String getDateProduced() {
        return dateProduced;
    }

    public List<RawMaterial> getRawMaterialList() {
        return rawMaterialList;
    }

    public static class Builder
    {
        private String productNumber;
        private String productName;
        private int literQty5;
        private int literQty10;
        private int literQty25;
        private String dateProduced;
        private List<RawMaterial> rawMaterialList;

        public Builder(String productNumber) {
            this.productNumber = productNumber;
        }

        public Builder productName(String productName)
        {
            this.productName = productName;
            return this;
        }



        public Builder fiveLiter(int five)
        {
            this.literQty5 = five;
            return this;
        }

        public Builder tenLiter(int ten)
        {
            this.literQty10 = ten;
            return this;
        }

        public Builder twentyFiveLiter(int twentyFive)
        {
            this.literQty25 = twentyFive;
            return this;
        }

        public Builder productionDate(String date)
        {
            this.dateProduced = date;
            return this;
        }

        public FinishedProduct build()
        {
            return new FinishedProduct(this);
        }
    }
}
