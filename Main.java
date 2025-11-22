import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();

        // Load saved data
        manager.setFriends(FileHandler.loadData());

        while (true) {

            System.out.println("===== EXPENSE SPLITTER =====");
            System.out.println("1. Add Friend");
            System.out.println("2. Add Expense");
            System.out.println("3. Show Summary");
            System.out.println("4. Settle Up");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException ime) {
                sc.nextLine(); // consume bad token
                System.out.println("Please enter a valid number.");
                continue;
            }
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter friend name: ");
                    String name = sc.nextLine();

                    if (!Validator.isValidName(name)) {
                        System.out.println("Invalid name! Try again.");
                        break;
                    }

                    manager.addFriend(name);
                    break;

                case 2:
                    ArrayList<Friend> list = manager.getFriends();

                    if (list.size() < 2) {
                        System.out.println("Add at least 2 friends first.\n");
                        break;
                    }

                    System.out.println("Who paid?");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + ". " + list.get(i).getName());
                    }

                    System.out.print("Choose index: ");
                    int index;
                    try {
                        index = sc.nextInt();
                    } catch (InputMismatchException ime) {
                        sc.nextLine();
                        System.out.println("Please enter a valid index.");
                        break;
                    }
                    sc.nextLine();

                    if (index < 1 || index > list.size()) {
                        System.out.println("Invalid index!");
                        break;
                    }

                    String paidBy = list.get(index - 1).getName();

                    System.out.print("Enter amount: ");
                    double amt;
                    try {
                        amt = sc.nextDouble();
                    } catch (InputMismatchException ime) {
                        sc.nextLine();
                        System.out.println("Please enter a valid amount.");
                        break;
                    }
                    sc.nextLine();

                    if (!Validator.isValidAmount(amt)) {
                        System.out.println("Amount must be > 0!");
                        break;
                    }

                    manager.addExpense(paidBy, amt);
                    break;

                case 3:
                    // use ReportGenerator
                    ReportGenerator.generateSummary(manager.getFriends());
                    break;

                case 4:
                    System.out.print("Enter friend name: ");
                    String nm = sc.nextLine();
                    manager.settleUp(nm);
                    break;

                case 5:
                    System.out.println("Saving data...");
                    FileHandler.saveData(manager.getFriends());
                    System.out.println("Thank you for using Expense Splitter!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
