import java.util.ArrayList;

public class ReportGenerator {

    public static void generateSummary(ArrayList<Friend> friends) {

        System.out.println("\n===== EXPENSE REPORT =====");

        for (Friend f : friends) {
            if (f.getBalance() > 0)
                System.out.println(f.getName() + " should RECEIVE ₹" + f.getBalance());
            else if (f.getBalance() < 0)
                System.out.println(f.getName() + " OWES ₹" + Math.abs(f.getBalance()));
            else
                System.out.println(f.getName() + " is SETTLED.");
        }

        System.out.println("==========================\n");
    }
}
