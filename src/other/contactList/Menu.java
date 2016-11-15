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
                System.out.println("Input operator of contact: ");
                contact.operator = new Scanner(System.in).next();

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

                Scanner scanner = new Scanner(System.in);

                System.out.println("Input index of contact what would you like to override");
                int index = scanner.nextInt();
                System.out.println("Input name:");
                String name = scanner.next();
                System.out.println("Input phone number");
                String phone = scanner.next();
                list.overrideContact(index, name, phone);
            } else if (choose == 6) {

                System.out.println("Input id of contact which you would to remove: ");
                list.removeContact(new Scanner(System.in).nextInt());
            } else if (choose == 7) {

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
                "if you would to show json version - input 4\n" +
                "if you would to override contact, input 5\n" +
                "if you would to remove contact, input 6\n" +
                "if you to exit - input 7");
    }
}
