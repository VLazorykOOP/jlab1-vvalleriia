import java.util.Scanner;

// Задано текст, слова в якому розділені пробілами і 
// розділовими знаками. 
// Розробити програму, яка вилучає з цього тексту всі слова найбільшої довжини. 
// (Слів найбільшої довжини може бути декілька). 
// Друкує текст, що залишився після вилучення слів.

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input text ");
        String text = in.nextLine();
        String[] words = text.split("[ ,.:;-?!]+");
        int max = words[0].length();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > max) {
                max = words[i].length();
            }

        }
        text = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != max) {
                text = text + words[i]+ " ";
            }
        }
        System.out.println(text);

    }
}
