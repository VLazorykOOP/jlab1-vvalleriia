import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Lab 1 : Task 1");
        /*
         * За введеними значеннями обчислити та вивести на екран значення виразу
         * 1 / x * y + 1 / (x * x + y * y) * (x - y)
         * Обчислення виконати у трьох варіантах:
         * 1) вхідні дані дійсного типу, результат – дійсного;
         * 2) вхідні дані цілого типу, результат – дійсного;
         * 3) вхідні дані дійсного типу, результат – цілого
         */
        
        Scanner scanner = new Scanner(System.in); //створюємо об'єкт класу сканер який буде считувати данні з консолі 
        
        System.out.println("Input x and y:"); //виводим в консоль 
        
        // 1: Вхідні дані дійсного типу, результат - дійсного:
        double x = scanner.nextDouble(), y = scanner.nextDouble();
        double result = 1 / x * y + 1 / (x * x + y * y) * (x - y);
        System.out.println("Result (дійсний тип): " + result);

        // 2: Вхідні дані цілого типу, результат - дійсного:
        int intX = (int) x, intY = (int) y;
        double result1 = 1.0 / intX * intY + 1.0 / (intX * intX + intY * intY) * (intX - intY);
        System.out.println("Result (дійсний тип з цілими вхідними даними): " + result1);

        // 3: Вхідні дані дійсного типу, результат - цілого:
        int result2 = (int) (1.0 / intX * intY + 1.0 / (intX * intX + intY * intY) * (intX - intY));
        System.out.println("Result (цілий тип): " + result2);
        scanner.close();
    }
}
