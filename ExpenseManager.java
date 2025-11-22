import java.util.ArrayList;

public class ExpenseManager {

    private ArrayList<Friend> friends = new ArrayList<>();

    public void addFriend(String name) {
        friends.add(new Friend(name));
        System.out.println(name + " added successfully!");
    }

    public void addExpense(String paidBy, double amount) {

        if (friends.size() < 2) {
            System.out.println("Add at least two friends first.");
            return;
        }

        double splitAmount = amount / friends.size();

        for (Friend f : friends) {
            if (f.getName().equals(paidBy)) {
                f.updateBalance(amount - splitAmount);
            } else {
                f.updateBalance(-splitAmount);
            }
        }

        System.out.println("Expense added! Each owes ₹" + splitAmount);
    }

    public void showSummary() {
        System.out.println("\n===== SUMMARY =====");
        for (Friend f : friends) {
            if (f.getBalance() > 0)
                System.out.println(f.getName() + " will RECEIVE ₹" + f.getBalance());
            else if (f.getBalance() < 0)
                System.out.println(f.getName() + " OWES ₹" + Math.abs(f.getBalance()));
            else
                System.out.println(f.getName() + " is SETTLED.");
        }
        System.out.println("===================\n");
    }

    public void settleUp(String name) {
        for (Friend f : friends) {
            if (f.getName().equals(name)) {
                f.updateBalance(-f.getBalance()); // resets to zero
                System.out.println(name + " settled!");
                return;
            }
        }
        System.out.println("Friend not found.");
    }

    public ArrayList<Friend> getFriends() {
        return friends;
    }

    // required by Main when loading from FileHandler
    public void setFriends(ArrayList<Friend> list) {
        if (list == null) return;
        this.friends = list;
    }
}
