import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static final String STR = "5554-ABC-5678-rTy-1a3b";

    public static void main(String[] args) {
        String message = "\nEnter the task number: 1, 2 or 3. 0 - closing the program.";
        System.out.println(message);
        isScannerHaveInt(message);
        int taskNumber = scanner.nextInt();

        while (true) {
            switch (taskNumber) {
                case 1 -> mainTask();
                case 2 -> AdditionalTasks.task1();
                case 3 -> AdditionalTasks.task2();
                case 0 -> {
                    scanner.close();
                    return;
                }
            }
            System.out.println(message);
            isScannerHaveInt(message);
            taskNumber = scanner.nextInt();
        }
    }

    public static void isScannerHaveInt(String message) {
        while (!scanner.hasNextInt()) {
            System.out.println(message);
            scanner.next();
        }
    }

    public static void mainTask() {
        System.out.println("_____ Main Task _____");
        DocNumber.outputTwoBlocksInOneLine(STR);
        DocNumber.replaceWithAsterisks(STR);
        DocNumber.printLettersToLowerCase(STR);
        DocNumber.printLettersToUpperCase(STR);
        DocNumber.isDocNumberContainsABC(STR);
        DocNumber.isDocNumberBeginsWith555(STR);
        DocNumber.isDocNumberEndsWith1a2b(STR);
    }
}