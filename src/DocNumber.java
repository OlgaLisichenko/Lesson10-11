public class DocNumber {

    //Вывести на экран в одну строку два первых блока по 4 цифры.
    public static void outputTwoBlocksInOneLine(String s) {
        String a = s.substring(0, 4);
        String b = s.substring(9, 13);
        System.out.println("The first two blocks of 4 digits: " + String.join(" ", a, b));
    }

    //Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменится на *).
    public static void replaceWithAsterisks(String s) {
        char[] a = s.toCharArray();
        for (int i = 0; i < 17; i++) {
            if (a[i] >= 'A' && a[i] <= 'z') {
                a[i] = '*';
            }
        }
        System.out.println(a);
    }

    //Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
    public static void printLettersToLowerCase(String s) {
        String[] str = s.split("-", 5);
        String[] letters = str[4].split("", 4);
        String w = String.join("/", str[1], str[3], letters[1], letters[3]);
        System.out.println(w.toLowerCase());
    }

    //Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре
    //(реализовать с помощью класса StringBuilder).
    public static void printLettersToUpperCase(String s) {
        String[] q = s.toUpperCase()
                      .replaceAll("[0-9]", "/")
                      .split("-", 5);
        String a = String.join("/", q[1], q[3]).concat(q[4]);
        StringBuilder stringBuilder = new StringBuilder(a);
        System.out.println(stringBuilder.insert(0, "Letters:"));
    }

    //Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет
    //(причем, abc и ABC считается одинаковой последовательностью).
    public static void isDocNumberContainsABC(String s) {
        if (s.contains("abc") || s.contains("ABC")) {
            System.out.println("The document number contains 'ABC' or 'abc'");
        } else
            System.out.println("The document number doesn't contain 'ABC' or 'abc'");
    }

    //Проверить начинается ли номер документа с последовательности 555.
    public static void isDocNumberBeginsWith555(String s) {
        if (s.startsWith("555")) {
            System.out.println("The document number begins with '555'");
        } else
            System.out.println("The document number doesn't begin with '555'");
    }

    //Проверить заканчивается ли номер документа на последовательность 1a2b.
    public static void isDocNumberEndsWith1a2b(String s) {
        if (s.endsWith("1a2b")) {
            System.out.println("The document number ends with '1a2b'");
        } else
            System.out.println("The document number doesn't end with '1a2b'");
    }
}