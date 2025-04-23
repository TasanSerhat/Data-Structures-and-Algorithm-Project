import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OrderTree tree = new OrderTree(); 
        Scanner scanner = new Scanner(System.in);

        System.out.println("***Welcome to the Order Management System***");

        boolean loop = true; 

        while (loop) {
            // Menü Seçenekleri
            System.out.println("\nMenu:");
            System.out.println("1. Add Orders");
            System.out.println("2. Cancel Orders");
            System.out.println("3. Query Orders");
            System.out.println("4. Print Tree");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1": // Sipariş Ekleme
                    System.out.print("Enter orders (e.g., Elma:3, Muz:2): ");
                    String addInput = scanner.nextLine();
                    tree.addOrder(addInput);
                    break;

                case "2": // Sipariş İptali
                    System.out.print("Enter products to cancel (comma-separated): ");
                    String cancelInput = scanner.nextLine();
                    tree.cancelOrder(cancelInput); 
                    break;
                    
                case "3": // Sorgulama
                    System.out.print("Enter products to query (comma-separated): ");
                    String queryInput = scanner.nextLine();
                    int result = tree.queryProductSet(queryInput);
                    System.out.println("Result: " + result);
                    break;

                case "4": // Ağacı Yazdır
                    System.out.println("Current Tree Structure:");
                    tree.printTree(); 
                    break;

                case "5": // Çıkış
                    loop = false; // Döngüden çık
                    System.out.println("Exiting the program..");
                    break;

                default: // Geçersiz Giriş
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close(); 
    }
}
// Hazırlayan: Serhat Talha Taşan ve Rıbar Bayram
