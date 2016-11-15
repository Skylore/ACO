package other.contactList.test;

import other.contactList.Contact;
import other.contactList.ContactList;

public class TestContactUtils {

    public static void main(String[] args) {

        Contact contact1 = new Contact();
        contact1.name = "Vlad";
        contact1.phone = "+380673768496";
        contact1.operator = "kyivstar";

        Contact contact2 = new Contact();
        contact2.name = "Bogdan";
        contact2.phone = "+380503168499";
        contact2.operator = "vodaphone";

        Contact contact3 = new Contact();
        contact3.name = "Daria";
        contact3.phone = "+380927492704";
        contact3.operator = "life";

        Contact[] contacts = {contact1, contact2, contact3};

        System.out.println("Test add:");
        for (int i = 0; i < 3; i++) {
            System.out.println(testAdd(contacts[i]));
        }

        System.out.println("\nTest show details:");
        for (int i = 0; i < 3; i++) {
            System.out.println(testShowDetails(contacts[i]));
        }
    }

    private static boolean testAdd(Contact contact) {
        ContactList list = new ContactList();
        list.addContact(contact);
        Contact[] run = list.getContacts();

        return (run[0].name.equals(contact.name) &&
                run[0].phone.equals(contact.phone) &&
                run[0].operator.equals(contact.operator));
    }

    private static boolean testShowDetails(Contact contact) {
        ContactList list = new ContactList();
        list.addContact(contact);
        String run = list.showDetails(1);

        String expected = String.format("name - %s \nphone number - %s\nid - %d \noperator - %s",
                contact.name, contact.phone,1 , contact.operator);

        return run.equals(expected);
    }
}
