package ac.za.cput.company_manager.domain;

import java.io.Serializable;
import java.util.List;

public class RawMaterial implements Serializable{

    private String rawMaterialId;
    private String rawMaterialName;
    private double rawMaterialCost;
    private int rawMaterialQtyOnHand;

    public RawMaterial() {
    }

    public RawMaterial(Builder builder) {
        this.rawMaterialId = builder.rawMaterialId;
        this.rawMaterialName = builder.rawMaterialName;
        this.rawMaterialCost = builder.rawMaterialCost;
        this.rawMaterialQtyOnHand = builder.rawMaterialQtyOnHand;
    }

    public String getRawMaterialId() {
        return rawMaterialId;
    }

    public String getRawMaterialName() {
        return rawMaterialName;
    }

    public double getRawMaterialCost() {
        return rawMaterialCost;
    }

    public int getRawMaterialQtyOnHand() {
        return rawMaterialQtyOnHand;
    }

    public static class Builder {
        private String rawMaterialId;
        private String rawMaterialName;
        private double rawMaterialCost;
        private int rawMaterialQtyOnHand;

        public Builder(String id) {
            this.rawMaterialId = id;

        }

        public Builder rawMaterialName(String name) {
            this.rawMaterialName = name;
            return this;
        }

        public Builder rawMatrialCost(double cost) {
            this.rawMaterialCost = cost;
            return this;
        }

        public Builder rawMaterialQtyOnHand(int qty)
        {
            this.rawMaterialQtyOnHand = qty;
            return this;
        }

        public Builder copy(RawMaterial value)
        {
            this.rawMaterialId = value.rawMaterialId;
            this.rawMaterialName = value.rawMaterialName;
            this.rawMaterialCost = value.rawMaterialCost;
            this.rawMaterialQtyOnHand = value.rawMaterialQtyOnHand;
            return this;
        }

        public RawMaterial build()
        {
            return new RawMaterial(this);
        }
    }
}
