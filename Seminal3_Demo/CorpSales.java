import java.util.Scanner;

public class CorpSales {
    public static void main(String[] args) {
        final int DIVS = 3;
        final int QTRS = 4;
        double totalSales = 0;

        double[][] sales = new double[DIVS][QTRS];

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter the following sales data: ");

        for (int div = 0; div < DIVS; div++) {
            for (int qtr = 0; qtr < QTRS; qtr++) {
                System.out.printf("Division %s, Quater %s: $", (div + 1), (qtr + 1));
                sales[div][qtr] = kb.nextDouble();
            }
        }

        System.out.println();

        for (int div = 0; div < DIVS; div++)
        {
            for (int qtr = 0; qtr < QTRS; qtr++)
            {
                totalSales += sales[div][qtr];
            }
        }

        System.out.printf("Total company sales: $%,.2f", totalSales);
    }
}
