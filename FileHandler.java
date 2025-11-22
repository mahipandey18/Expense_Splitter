import java.io.*;
import java.util.ArrayList;

public class FileHandler {

    private static final String FILE_NAME = "expenses_data.txt";

    public static void saveData(ArrayList<Friend> friends) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Friend f : friends) {
                // escape commas in names (simple)
                String name = f.getName().replace(",", "");
                bw.write(name + "," + f.getBalance());
                bw.newLine();
            }
            System.out.println("Data saved successfully!");
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    public static ArrayList<Friend> loadData() {
        ArrayList<Friend> list = new ArrayList<>();

        File file = new File(FILE_NAME);
        if (!file.exists()) {
            // No previous data — return empty list
            System.out.println("No previous data found.");
            return list;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length < 2) continue; // skip malformed lines
                String name = data[0];
                double balance = 0.0;
                try {
                    balance = Double.parseDouble(data[1]);
                } catch (NumberFormatException e) {
                    // keep 0.0 if parse fails
                }
                Friend f = new Friend(name);
                f.updateBalance(balance); // set balance
                list.add(f);
            }
            System.out.println("Data loaded successfully!");
        } catch (IOException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }

        return list;
    }
}
