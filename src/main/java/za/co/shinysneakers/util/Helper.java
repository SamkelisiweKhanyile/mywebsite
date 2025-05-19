package za.co.shinysneakers.util;

import java.util.UUID;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Helper {
    public static boolean isNullOrEmpty(String s) {
        return s == null || s.isEmpty();
    }

    public static String generateId() {
        return UUID.randomUUID().toString();
    }

    // Or if you want numeric IDs
    public static String generateNumericId() {
        return String.valueOf(System.currentTimeMillis());
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        if (isNullOrEmpty(phoneNumber)) {
            return false;
        }

        // Checks for SA mobile numbers: e.g., 0725637252 or +27725637252
        String regex = "^(\\+27|0)[6-8][0-9]{8}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public static boolean isValidEmail(String email) {
        if (isNullOrEmpty(email)) {
            return false;
        }

        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean isValidPassword(String password) {
        if (isNullOrEmpty(password)) {
            return false;
        }

        // At least one digit, one letter, 8+ characters, no special characters
        String regex = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static boolean isZeroOrNegative(int number) {
        return number <= 0;
    }
}
