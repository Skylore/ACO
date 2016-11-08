package other.contactList;

import java.util.Arrays;
import java.util.Scanner;

public class ContactList {

    private Contact[] contacts = {};

    public Contact[] addContact() {
        Contact contact = new Contact();
        System.out.println("Input name of contact: ");
        contact.name = new Scanner(System.in).nextLine();
        System.out.println("Input phone number: ");
        contact.phone = new Scanner(System.in).nextLine();

        contact.id = this.contacts.length + 1;

        Contact[] res = Arrays.copyOf(this.contacts, this.contacts.length + 1);
        res[res.length - 1] = contact;

        return this.contacts = res;
    }

    public void showDetails() {
        System.out.println("Input id of contact");
        int index = new Scanner(System.in).nextInt();

        if (this.contacts.length < index + 1 || index < 0) {
            System.out.println("That contact does'n exist");
        }

        System.out.printf("name - %s \nphone number - %s\nid - %d",
                this.contacts[index - 1].name, this.contacts[index - 1].phone, this.contacts[index - 1].id);
    }

    public void showAll() {
        if (this.contacts.length == 0) {
            System.out.println("Contact list is empty");
        }

        for (int i = 0; i < this.contacts.length; i++) {
            System.out.println(this.contacts[i].name);
        }
    }

    private String contactToJson(Contact contact) {

        if (contact == null) {
            return "";
        }

        return String.format("{\n\"name\" : \"%s\",\n\"phone number\" : \"%s\",\n\"id\" : %d\n}",
                contact.name, contact.phone, contact.id);
    }

    public void toJson() {

        String res = "{\n \"contactList\" : [\n";

        for (int i = 0; i < this.contacts.length; i++) {
            res += contactToJson(this.contacts[i]) + ",\n";
        }

        System.out.println(res.substring(0, res.length() - 2) + "\n]\n}");
    }
}
