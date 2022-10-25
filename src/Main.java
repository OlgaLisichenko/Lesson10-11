import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static final String STR = "1554-ABB-5678-rTy-1a1b";

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
        try {
            DocNumber.isDocNumberContainsABC(STR);
        } catch (NoABCSequence noABCSequence) {
            System.out.println("Error: " + noABCSequence.getMessage());
        }
        try {
            DocNumber.isDocNumberBeginsWith555(STR);
        } catch (No555AtTheBeginning no555AtTheBeginning) {
            System.out.println("Error: " + no555AtTheBeginning.getMessage());
        }
        try {
            DocNumber.isDocNumberEndsWith1a2b(STR);
        } catch (No1a2bAtTheEnd no1a2bAtTheEnd) {
            System.out.println("Error: " + no1a2bAtTheEnd.getMessage());
        }
    }
}