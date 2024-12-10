package app;

public class Main {

    private static final String CURRENCY_EUR = "EUR";
    private static final int SMARTPHONE_DAYS = 5;
    private static final int LAPTOP_DAYS = 7;

    static String productName;
    static int productNumber;
    static double dailySales;
    static double totalSales;

    public static void main(String[] args) {
        productName = "smartphone";
        productNumber = 1;
        dailySales = 2430.68;
        totalSales = SMARTPHONE_DAYS * dailySales;

        System.out.printf("Product No %d: %s,%ntotal sales for %d days is %s, %.2f, %nsales by day is %s, %.2f. ",
                productNumber, productName, SMARTPHONE_DAYS, CURRENCY_EUR, totalSales, CURRENCY_EUR, dailySales);


        productName = "laptop";
        productNumber = 2;
        dailySales = 1498.12;
        totalSales = LAPTOP_DAYS * dailySales;

        System.out.printf("%nProduct No %d: %s,%ntotal sales for %d days is %s, %.2f, %nsales by day is %s, %.2f. ",
                productNumber, productName, LAPTOP_DAYS, CURRENCY_EUR, totalSales, CURRENCY_EUR, dailySales);



    }

}
