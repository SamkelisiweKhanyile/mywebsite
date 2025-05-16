package za.co.shinysneakers.domain;

public class HomeAddress {
    private Long addressId;
    private String streetNumber;
    private String streetName;
    private String suburb;
    private String city;
    private String provice;
    private String country;
    private int postalCode;


    protected HomeAddress() {
    }
        private HomeAddress(Builder builder){
        this.addressId = builder.addressId;
        this.streetNumber = builder.streetNumber;
        this.streetName = builder.streetName;
        this.suburb = builder.suburb;
        this.city = builder.city;
        this.provice = builder.provice;
        this.country = builder.country;
        this.postalCode = builder.postalCode;
    }
        public Long getAddressId() { return addressId;}
        public String getStreetNumber() {return streetNumber;}
        public String getStreetName() {return streetName;}
        public String getSuburb() {return suburb;}
        public String getCity() {return city;}
        public String getProvice() {return provice;}
        public String getCountry() {return country;}
        public int getPostalCode() {return postalCode;}


    public static class Builder {
        private Long addressId;
        private String streetNumber;
        private String streetName;
        private String suburb;
        private String city;
        private String provice;
        private String country;
        private int postalCode;


        public Builder addressId(Long addressId) {
            this.addressId = addressId;
            return this;
        }

        public Builder streetNumber(String streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        public Builder streetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder suburb(String suburb) {
            this.suburb = suburb;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder provice(String provice) {
            this.provice = provice;
            return this;
        }

        public Builder country(String country) {
            this.country = country;
            return this;
        }

        public Builder postalCode(int postalCode) {
            this.postalCode = postalCode;
            return this;

        }

        @Override
        public String toString() {
            return "HomeAddress{" +
                    "addressId='" + addressId + '\'' +
                    ", streetNumber='" + streetNumber + '\'' +
                    ", streetName='" + streetName + '\'' +
                    ", suburb='" + suburb + '\'' +
                    ", city='" + city + '\'' +
                    ", provice='" + provice + '\'' +
                    ", country='" + country + '\'' +
                    ", postalCode='" + postalCode + '\'' +
                    '}';
        }

        public HomeAddress build() {
            return new HomeAddress(this);
        }

    }}

