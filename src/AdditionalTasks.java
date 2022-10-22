import java.util.Arrays;

public class AdditionalTasks {

    public static void task1() {
        System.out.println("_____ Additional Task 1 _____");
        String str = "Дана строка произвольной длины с произвольными словами. " +
                "Найти самое короткое слово в строке и вывести его на экран. " +
                "Найти самое длинное слово в строке и вывести его на экран. " +
                "Если таких слов несколько, то вывести последнее из них.";

        String s = replaceCharactersWithSpaces(str);
        String[] array = s.split(" ");
        bubbleSorting(array);
        String maxLengthWord = array[array.length - 1];
        String minLengthWord = findShortestWord(array);

        System.out.println("Отсортированный массив строк: \n" + Arrays.toString(array));
        System.out.println("Самое длинное слово в строке: " + maxLengthWord);
        System.out.println("Самое короткое слово в строке: " + minLengthWord);
    }

    public static String replaceCharactersWithSpaces(String str) {
        char[] a = str.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 'А' || a[i] > 'я') {
                a[i] = ' ';
            }
        }
        return String.valueOf(a);
    }

    public static String[] bubbleSorting(String[] array1) {
        boolean sorted = false;
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
        return array1;
    }

    public static String findShortestWord(String[] array) {
        String minLengthWord = null;
        for (int i = 0; i < array.length; i++) {
            if (!array[i].isEmpty() || !array[i].isBlank()) {
                if (array[i].length() < array[i + 1].length()) {
                    minLengthWord = array[i];
                    break;
                }
            }
        }
        return minLengthWord;
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