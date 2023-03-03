import java.util.*;

public class TShirtSizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] sizes = new String[n];
        for (int i = 0; i < n; i++) {
            sizes[i] = sc.next();
        }
        int m = sc.nextInt();
        String[] requests = new String[m];
        for (int i = 0; i < m; i++) {
            requests[i] = sc.next();
        }
        sc.close();

        // Create a set to store available sizes
        Set<String> availableSizes = new HashSet<>(Arrays.asList(sizes));

        // Check if all requests can be fulfilled
        for (String request : requests) {
            boolean fulfilled = false;
            for (String size : availableSizes) {
                if (size.equals(request) || size.compareTo(request) > 0) {
                    fulfilled = true;
                    break;
                }
            }
            if (!fulfilled) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}