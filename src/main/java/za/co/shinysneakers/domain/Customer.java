package za.co.shinysneakers.domain;

public class Customer {
    private String customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;

    protected  Customer(){
    }
    private Customer(Builder builder){
        this.customerId = builder.customerId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.mobile = builder.mobile;
    }
    public String getCustomerId() {return customerId;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getEmail() {return email;}
    public String getMobile() {return mobile;}

    @Override
    public String toString() {
        return "Customer { " +
                "customerId='" + customerId + '\''+
                ", firstName='" + firstName + '\''+
                ", lastName='" + lastName = + '\''+
                ", email='" + email = + '\''+
                ", mobile='" + mobile = + '\''+
                '}';
    }
    public static class Builder{
        private String customerId;
        private String firstName;
        private String lastName;
        private String email;
        private String mobile;

        public Builder setCustomerId(String customerId){
            this.customerId = customerId;
            return this;
        }
        public Builder setFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public Builder setLastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public Builder setEmail(String email){
            this.email = email;
            return this;
        }
        public Builder setMobile(String mobile){
            this.mobile = mobile;
            return this;
        }
        public Builder copy(Customer customer){
            this.customerId = customer.customerId;
            this.firstName = customer.firstName;
            this.lastName = customer.lastName;
            this.email = customer.email;
            this.mobile = customer.mobile;
            return this;
        }

        public Customer build(){return new Customer(this);}


    }
}
