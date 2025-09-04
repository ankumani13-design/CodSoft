import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] currencies = {"USD", "EUR", "INR", "WON", "YEN"};

        double[][] rates = {
            {88.17, 0.86, 88.17, 1396.23,  148.52}, 
            {1.16,102.66  ,102.65, 1625.50,  172.93},
            {0.011, 0.97, 1, 15.82, 1.68},  
            {0.72,0.62,0.63  ,0.063, 0.11},  
            {0.0068,0.0063,0.56,  9.20,0.59}      
        };

        System.out.println("Choose base currency: \n1-USD\n 2-EUR\n 3-INR\n 4-WON\n 5-YEN\n");
        int from = sc.nextInt() - 1; 
        System.out.println("Choose target currency: 1-USD, 2-EUR, 3-INR, 4-WON, 5-YEN");
        int to = sc.nextInt() - 1;

        System.out.print("Enter amount to convert: ");
        double amount = sc.nextDouble();

        double converted = amount * rates[from][to];
        System.out.printf("%.2f %s = %.2f %s\n", amount, currencies[from], converted, currencies[to]);

        sc.close();
    }
}
