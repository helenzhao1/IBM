import java.util.*;

public class ValidateDataset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // consume the newline character
        List<String> errorCodes = new ArrayList<>();
        boolean allValid = true;
        for (int i = 0; i < n; i++) {
            String[] record = sc.nextLine().split(" ");
            boolean isValid = Boolean.parseBoolean(record[1]);
            if (!isValid) {
                allValid = false;
                errorCodes.add(record[2]);
            }
        }
        sc.close();

        if (allValid) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
            System.out.println(String.join(" ", errorCodes));
        }
    }
}