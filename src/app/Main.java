package app;

public class Main {

    private static final String CURRENCY_EUR = "EUR";

    static String productName;
    static int productNumber;
    static int day;
    static double salesDay;
    static double total;

    public static void main(String[] args) {
        productName = "smartphone";
        productNumber = 1;
        salesDay = 2430.68;
        day = 5;
        total = day * salesDay;

        System.out.printf("Product No 1: %s,%ntotal sales for 5 days is %s, %.2f, %nsales by day is %s, %.2f. ",
                productName, CURRENCY_EUR, total, CURRENCY_EUR, salesDay);


        productName = "laptop";
        productNumber = 2;
        salesDay = 1498.12;
        day = 7;
        total = day * salesDay;

        System.out.printf("%nProduct No 2: %s,%ntotal sales for 7 days is %s, %.2f, %nsales by day is %s, %.2f. ",
                productName, CURRENCY_EUR, total, CURRENCY_EUR, salesDay);

    }

}
