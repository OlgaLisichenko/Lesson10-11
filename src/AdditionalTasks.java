import java.util.Arrays;

public class AdditionalTasks {

    public static void task1() {
        System.out.println("_____ Additional Task 1 _____");
        String str = "Дана строка произвольной длины с произвольными словами. " +
                "Найти самое короткое слово в строке и вывести его на экран. " +
                "Найти самое длинное слово в строке и вывести его на экран. " +
                "Если таких слов несколько, то вывести последнее из них.";

        String minLengthWord = null;

        char[] a = str.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 'А' || a[i] > 'я') {
                a[i] = ' ';
            }
        }
        String s = String.valueOf(a);

        String[] array1 = s.toLowerCase().split(" ");

        boolean sorted = false;   // сортировка пузырьком
        String temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array1.length - 1; i++) {
                if (array1[i].length() > array1[i + 1].length()) {
                    temp = array1[i];
                    array1[i] = array1[i + 1];
                    array1[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].isEmpty() || !array1[i].isBlank()) {
                if (array1[i].length() <= array1[i + 1].length()) {
                    minLengthWord = array1[i];
                    break;
                }
            }
        }
        System.out.println("Отсортированный массив строк: \n" + Arrays.toString(array1));
        System.out.println("Самое длинное слово в строке: " + array1[array1.length - 1]);
        System.out.println("Самое короткое слово в строке: " + minLengthWord);
    }


    public static void task2() {
        System.out.println("_____ Additional Task 2 _____");
        String str = "Каждая буква в строке должна быть задублирована";
        char s[] = str.toCharArray();

        for (int i = 0, j = 0; i < s.length && j < s.length; i++, j++) {
            System.out.print(s[i]);
            System.out.print(s[j]);
        }
    }
}