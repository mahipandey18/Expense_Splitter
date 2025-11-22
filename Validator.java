public class Validator {

    public static boolean isValidName(String name) {
        return name != null && !name.trim().isEmpty();
    }

    public static boolean isValidAmount(double amount) {
        return amount > 0;
    }
}
