mport java.util.Scanner;

public class BiayaServisAkun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int accountNumber = 55555; 
        int statusCode = 1;        

        System.out.print("Masukkan account number: ");
        int inputAccount = Integer.parseInt(sc.nextLine());

        System.out.print("Masukkan amount of sale: ");
        float amountOfSale = Float.parseFloat(sc.nextLine());

       if (inputAccount == accountNumber && statusCode == 1) {
        System.out.println("Invoice Produced");
        System.out.println("Account Number : " + inputAccount);
        System.out.println("Amount of Sale : " + amountOfSale);
        } else {
            System.out.println("\nError: Account tidak ditemukan atau status tidak valid!");
        }
    }
}