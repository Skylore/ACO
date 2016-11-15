package other.contactList;

import java.util.Arrays;

public class ContactList {

    private Contact[] contacts = new Contact[1];

    public Contact[] addContact(Contact contact) {

        contact.id = 0;

        Contact[] res = new Contact[this.contacts.length];

        if (this.contacts[this.contacts.length - 1] != null) {
            res = Arrays.copyOf(this.contacts, this.contacts.length * 2);
        }

        res[res.length - 1] = contact;
        contact.id ++;

        return this.contacts = res;
    }

    public String showDetails(int index) {

        if (this.contacts.length < index - 1 || index < 0) {
            return "That contact does'n exist";
        }
        return String.format("name - %s \nphone number - %s\nid - %d",
                this.contacts[index - 1].name, this.contacts[index - 1].phone, this.contacts[index - 1].id);
    }

    public String showAll() {

        if (this.contacts.length == 0) {
            System.out.println("Contact list is empty");
        }

        String res = "";

        for (int i = 0; i < this.contacts.length; i++) {
            res += this.contacts[i].name + "\n";
        }

        return res;
    }

    private String contactToJson(Contact contact) {

        if (contact == null) {
            return "";
        }

        return String.format("{\n\"name\" : \"%s\",\n\"phone number\" : \"%s\",\n\"id\" : %d\n}",
                contact.name, contact.phone, contact.id);
    }

    public String toJson() {

        String res = "{\n \"contactList\" : [\n";

        for (int i = 0; i < this.contacts.length; i++) {
            res += contactToJson(this.contacts[i]) + ",\n";
        }

        return res.substring(0, res.length() - 2) + "\n]\n}";
    }
}
