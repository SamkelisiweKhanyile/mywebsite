package za.co.shinysneakers.Factory;

import za.co.shinysneakers.domain.Customer;
import za.co.shinysneakers.util.Helper;

public class CustomerFactory {
    public static Customer createCustomer(String firstName, String lastName, String email, String mobile) {
        if (Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName) ||
                Helper.isNullOrEmpty(email) || Helper.isNullOrEmpty(mobile)) {
            return null;
        }

        return new Customer.Builder()
                .setCustomerId(Helper.generateId())
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setMobile(mobile)
                .build();
    }
}