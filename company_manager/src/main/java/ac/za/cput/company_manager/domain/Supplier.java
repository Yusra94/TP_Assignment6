package ac.za.cput.company_manager.domain;

import java.io.Serializable;
import java.util.List;

public class Supplier implements Serializable{

    private String supplierId;
    private String supplierName;
    private String supplierPhoneNumber;
    private String supplierEmail;
    private String supplierAddress;
    private List<RawMaterial> rawMaterialList;

    public Supplier() {
    }

    public Supplier(Builder builder) {
        this.supplierId = builder.supplierId;
        this.supplierName = builder.supplierName;
        this.supplierPhoneNumber = builder.supplierPhoneNumber;
        this.supplierEmail = builder.supplierEmail;
        this.supplierAddress = builder.supplierAddress;
        this.rawMaterialList = builder.rawMaterialList;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getSupplierPhoneNumber() {
        return supplierPhoneNumber;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public List<RawMaterial> getRawMaterialList(){return rawMaterialList;}

    public static class Builder
    {
        private String supplierId;
        private String supplierName;
        private String supplierPhoneNumber;
        private String supplierEmail;
        private String supplierAddress;
        private List<RawMaterial> rawMaterialList;

        public Builder(String id)
        {
            this.supplierId = id;
        }

        public Builder supplierName(String name)
        {
            this.supplierName = name;
            return this;
        }

        public Builder supplierPhoneNumber(String phone)
        {
            this.supplierPhoneNumber = phone;
            return this;
        }

        public Builder supplierEmail(String email)
        {
            this.supplierEmail = email;
            return this;
        }

        public Builder supplierAddress(String address)
        {
            this.supplierAddress = address;
            return this;
        }

        public Builder rawMaterialList(List<RawMaterial> value)
        {
            this.rawMaterialList = value;
            return this;
        }

        public Builder copy(Supplier value)
        {
            this.supplierId = value.supplierId;
            this.supplierName = value.supplierName;
            this.supplierAddress = value.supplierAddress;
            this.supplierEmail = value.supplierEmail;
            this.supplierPhoneNumber = value.supplierPhoneNumber;
            this.rawMaterialList = value.rawMaterialList;
            return  this;
        }

        public Supplier build()
        {
            return new Supplier(this);
        }
    }
}
