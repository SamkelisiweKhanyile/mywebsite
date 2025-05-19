package za.co.shinysneakers.Factory;

import za.co.shinysneakers.domain.HomeAddress;
import za.co.shinysneakers.util.Helper;

public class HomeAddressFactory {
    public static HomeAddress createHomeAddress(String streetNumber, String streetName, String suburb,
                                                String city, String province, String country, int postalCode) {

        if (Helper.isNullOrEmpty(streetNumber) || Helper.isNullOrEmpty(streetName)) {
            return null;
        }
        if (Helper.isNullOrEmpty(suburb) || Helper.isNullOrEmpty(city)) {
            return null;
        }
        if (Helper.isNullOrEmpty(province) || Helper.isNullOrEmpty(country)) {
            return null;
        }
        if (Helper.isZeroOrNegative(postalCode)) {
            return null;
        }

        return new HomeAddress.Builder()
                .addressId(Helper.generateId())
                .streetNumber(streetNumber)
                .streetName(streetName)
                .suburb(suburb)
                .city(city)
                .provice(province)
                .country(country)
                .postalCode(postalCode)
                .build();
    }
}