
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void rowsColumns() {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
            System.out.println("Type number for rows : ");
            int inputRows = scanner.nextInt();
            System.out.println("Type number for columns : ");
            int inputColumns = scanner.nextInt();
            int [] [] tablica = new int[inputRows][inputColumns];

            for (int i = 0; i < tablica.length; i++) {
               for (int j = 0; j < tablica[i].length; j++) {
                   System.out.println("Podaj liczbe do uzupełnienia tablicy:");
                   int a = scanner.nextInt();
                   tablica[i][j] = a;
               }
                System.out.println(Arrays.deepToString(tablica));
           }
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                sum += tablica[i][j];
            }
        }
        System.out.println("średnia elemetow: " + sum/(inputRows * inputColumns));
        System.out.println("suma wszystki elemetów tablicy: " + sum);
       }
    public static void main(String[] args) {
        rowsColumns();
    }
}