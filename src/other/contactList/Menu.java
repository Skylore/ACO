package other.contactList;

import java.util.Scanner;

public class Menu {

    public static void core() {
        ContactList list = new ContactList();

        while (true) {
            intro();
            int choose = new Scanner(System.in).nextInt();

            if (choose == 1) {
                list.addContact();
                System.out.println();
            } else if (choose == 2) {
                list.showAll();
                System.out.println();
            } else if (choose == 3) {
                list.showDetails();
                System.out.println();
            } else if (choose == 4) {
                list.toJson();
                System.out.println();
            } else if (choose == 5) {
                break;
            } else {
                System.out.println("Invalid value");
            }
        }
    }

    private static void intro() {
        System.out.println("Input your action: \n" +
                "if you would to add contact - input 1\n" +
                "if you would to show all contacts - input 2\n" +
                "if you would to show details - input 3\n" +
                "if you would to show json version - in put 4\n" +
                "if you to exit - input 5");
    }
}
