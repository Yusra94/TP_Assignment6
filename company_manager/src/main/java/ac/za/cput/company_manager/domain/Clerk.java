package ac.za.cput.company_manager.domain;


import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Clerk implements Employee,Serializable{

    String employeeId;
    String employeeName;
    String employeeSurname;
    String employeeAddress;
    String employeePhoneNumber;
    String employeeEmail;
    double employeeSalary;
    String hireDate;

    public Clerk() {
    }

    public Clerk(Builder builder){
        this.employeeId = builder.employeeId;
        this.employeeName = builder.employeeName;
        this.employeeSurname = builder.employeeSurname;
        this.employeeAddress = builder.employeeAddress;
        this.employeePhoneNumber = builder.employeePhoneNumber;
        this.employeeEmail = builder.employeeEmail;
        this.employeeSalary = builder.employeeSalary;
        this.hireDate = builder.hireDate;
    }

    public String getEmployeeId() {
        return this.employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeSurname() {
        return employeeSurname;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public String getEmployeePhoneNumber() {
        return employeePhoneNumber;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public String getHireDate()
    {
        return hireDate;
    }

    public static class Builder
    {
        String employeeId;
        String employeeName;
        String employeeSurname;
        String employeeAddress;
        String employeePhoneNumber;
        String employeeEmail;
        double employeeSalary;
        String hireDate;

        public Builder(String employeeId)
        {
            this.employeeId = employeeId;
        }

        public Builder employeeName(String employeeName)
        {
            this.employeeName = employeeName;
            return this;
        }

        public Builder employeeSurname( String employeeSurname)
        {
            this.employeeSurname = employeeSurname;
            return this;
        }

        public Builder employeeAddress(String employeeAddress)
        {
            this.employeeAddress = employeeAddress;
            return this;
        }

        public Builder employeePhoneNumber( String employeePhoneNumber)
        {
            this.employeePhoneNumber = employeePhoneNumber;
            return this;
        }

        public Builder employeeEmail(String employeeEmail)
        {
            this.employeeEmail = employeeEmail;
            return this;
        }

        public Builder employeeSalary(double employeeSalary)
        {
            this.employeeSalary = employeeSalary;
            return this;
        }

        public Builder hireDate(String hireDate)
        {
            this.hireDate = hireDate;
            return this;
        }

        public Builder copy(Clerk value)
        {
           this.employeeId = value.employeeId;
            this.employeeName = value.employeeName;
            this.employeeSurname = value.employeeSurname;
            this.employeeAddress = value.employeeAddress;
            this.employeeEmail = value.employeeEmail;
            this.employeePhoneNumber = value.employeePhoneNumber;
            this.employeeSalary = value.employeeSalary;
            this.hireDate = value.hireDate;
            return this;
        }

        public Clerk build()
        {
            return new Clerk(this);
        }


    }
}

