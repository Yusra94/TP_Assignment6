package ac.za.cput.company_manager.domain;

import java.io.Serializable;

public class Manager implements Serializable{

    private String managerId;
    private String managerName;
    private String managerSurname;

    public Manager() {
    }

    public Manager(Builder builder) {
        this.managerId = builder.managerId;
        this.managerName = builder.managerName;
        this.managerSurname = builder.managerSurname;
    }

    public String getManagerId() {
        return managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public String getManagerSurname() {
        return managerSurname;
    }

    public static class Builder
    {

        private String managerId;
        private String managerName;
        private String managerSurname;

        public Builder(String id) {

            this.managerId = id;
        }

        public Builder managerName(String name)
        {
            this.managerName = name;
            return this;
        }

        public Builder managerSurname(String surname)
        {
            this.managerSurname = surname;
            return this;
        }

        public Builder copy(Manager value)
        {
            this.managerId = value.managerId;
            this.managerName = value.managerName;
            this.managerSurname = value.managerSurname;
            return this;
        }

        public Manager build()
        {
            return new Manager(this);
        }
    }

}
