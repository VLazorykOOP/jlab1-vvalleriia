import java.util.Scanner;

// Задана матриця X(n,n), n<=15. 
// Розробити програму, яка будує логічний вектор L(n) за правилом: 
// L(i)=true, якщо в i-му рядку цієї матриці кількість від’ємних елементів більша 
// від кількості додатних, інакше – L(i)=false.

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        System.out.println("Input n");
        int n = in.nextInt(), count = 0;
        if (n > 15) {
            System.out.println("Error n<=15");
            in.close();
            return;
        }
        int[][] x = new int[n][n];
        boolean[] l = new boolean[n];
        System.out.println("Input elements of array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                x[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
            if (x[i][j]<0){
                count++;
            }
            }if (count>n-count){
                l[i] = true;
            }
            count = 0;
        }
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         System.out.print(x[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        for (int i=0; i < n; i++){
            System.out.print(l[i]+" ");
        }
    in.close();

    }
}
