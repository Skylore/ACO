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

        // Print res of tests
        System.out.println("Test add:");
        for (int i = 0; i < 3; i++) {
            System.out.println(testAdd(contacts[i]));
        }

        System.out.println("\nTest show details:");
        for (int i = 0; i < 3; i++) {
            System.out.println(testShowDetails(contacts[i]));
        }

        System.out.println("\nTest show all:\n" + testShowAll(contact1, contact2, contact3));
        System.out.println("\nTest override contact\n" + testOverrideContact(contact1));
        System.out.println("\nTest remove contact\n" + testRemoveContact(contact1, contact2));
    }

    // Tests
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

        return run.contains(contact.name) && run.contains(contact.phone) && run.contains(contact.operator);
    }

    private static boolean testShowAll(Contact contact, Contact contact1, Contact contact2) {
        ContactList list = new ContactList();
        list.addContact(contact);
        list.addContact(contact1);
        list.addContact(contact2);

        String run = list.showAll();

        return  run.contains(contact.name) &&
                run.contains(contact1.name) &&
                run.contains(contact2.name);
    }

    private static boolean testOverrideContact(Contact contact) {
        String testName = "Max";
        String testPhone = "+3709423459871";

        ContactList list = new ContactList();
        list.addContact(contact);
        list.overrideContact(1, testName, testPhone);

        return contact.name.equals(testName) && contact.phone.equals(testPhone);
    }

    private static boolean testRemoveContact(Contact contact, Contact contact1) {
        ContactList list = new ContactList();
        list.addContact(contact);
        list.addContact(contact1);
        list.removeContact(1);

        return list.getContacts()[0] != contact;
    }
}
