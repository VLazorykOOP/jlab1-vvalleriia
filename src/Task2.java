import java.util.Scanner;
import java.lang.Math;

// Задано дійсні число r і масив A(n), n <= 200.
//  Розробити програму, яка підраховує скільки точок з координатами (a1,a2), 
// (a3,a4), ...,(a2n-1 a2n) належать кругові радіуса r з центром
// на початку координат.

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input r ");
        int r = in.nextInt();
        System.out.println("Input n ");
        int n = in.nextInt(), count = 0;
        if (n > 200) {
            System.out.println("Error: n<=200 ");
            in.close();
            return;
        }
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        double t;
        for (int i = 0; i < n; i++) {
            t = Math.sqrt(a[i] * a[i] + a[++i] * a[i]);
            System.out.println(t);
            if (t <= r) {
                count++;
            }
        }
        System.out.println("кількість точок які належать "+count);
        in.close();

    }
}