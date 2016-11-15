package other.contactList;

import java.util.Arrays;

public class ContactList {

    private Contact[] contacts = new Contact[1];

    private int findLastContact() {

        int res = 0;

        for (int i = 0; i < this.contacts.length; i++) {
            if (this.contacts[i] != null) {
                res++;
            }
        }

        return res;
    }

    public Contact[] addContact(Contact contact) {

        contact.id = findLastContact();

        if (this.contacts.length <= contact.id|| this.contacts[contact.id] != null) {
            this.contacts = Arrays.copyOf(this.contacts, this.contacts.length * 2);
        }

        this.contacts[contact.id] = contact;

        return this.contacts;
    }

    public String showDetails(int index) {

        if (this.contacts.length < index - 1 || index < 0) {
            return "That contact does'n exist";
        }
        return String.format("name - %s \nphone number - %s\nid - %d \noperator - %s",
                this.contacts[index - 1].name, this.contacts[index - 1].phone, this.contacts[index - 1].id + 1, this.contacts[index - 1].operator);
    }

    public String showAll() {

        if (this.contacts.length == 0) {
            System.out.println("Contact list is empty");
        }

        String res = "";

        int temp = 0;

        while (this.contacts[temp] != null) {
            res += this.contacts[temp].name + "\n";
            temp++;
        }

        return res;
    }

    private String contactToJson(Contact contact) {

        if (contact == null) {
            return "";
        }

        return String.format("{\n\"name\" : \"%s\",\n\"phone number\" : \"%s\",\n\"id\" : %d, \n\"operator\" : \"%s\"}",
                contact.name, contact.phone, contact.id + 1, contact.operator);
    }

    public String toJson() {

        String res = "";

        int temp = 0;

        while (this.contacts[temp] != null) {
            res += contactToJson(this.contacts[temp]) + ",\n";
            temp++;
        }

        return "{\n \"contactList\" : [\n" + res.substring(0, res.length() - 2) + "\n]\n}";
    }
}
