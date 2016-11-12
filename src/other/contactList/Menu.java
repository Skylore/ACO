package other.contactList;

import java.util.Scanner;

public class Menu {

    public static void core() {
        ContactList list = new ContactList();

        while (true) {
            intro();
            int choose = new Scanner(System.in).nextInt();

            if (choose == 1) {

                Contact contact = new Contact();
                System.out.println("Input name of contact: ");
                contact.name = new Scanner(System.in).nextLine();
                System.out.println("Input phone number: ");
                contact.phone = new Scanner(System.in).nextLine();

                list.addContact(contact);

            } else if (choose == 2) {
                System.out.println(list.showAll());

            } else if (choose == 3) {

                System.out.println("Input id of contact");
                int index = new Scanner(System.in).nextInt();

                System.out.println(list.showDetails(index));

            } else if (choose == 4) {
                System.out.println(list.toJson() + "\n");

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
