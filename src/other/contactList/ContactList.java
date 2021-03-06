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

    private boolean contains(String key) {

        if (this.contacts[0] == null) {
            return false;
        }

        for (int i = 0; i < this.contacts.length; i++) {
            if (this.contacts[i].name.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public void addContact(Contact contact) {

        if (contains(contact.name)) {
            System.out.println("That contact is already exist");
            return;
        }

        contact.id = findLastContact();

        if (this.contacts.length <= contact.id || this.contacts[contact.id] != null) {
            this.contacts = Arrays.copyOf(this.contacts, this.contacts.length * 2);
        }

        this.contacts[contact.id] = contact;
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

        for (int i = 0; i < findLastContact(); i++) {
            res += this.contacts[i].name + "\n";
        }
        return res;
    }

    public String search(String key) {
        if (key == null) {
            System.out.println("Invalid key");;
        }

        String res = "";

        for (int i = 0; i < this.contacts.length; i++) {
            if (this.contacts[i].name.equals(key)) {
                res += showDetails(i + 1) + "\n";
            }
            if (this.contacts[i].phone.equals(key)) {
                res += showDetails(i + 1) + "\n";
            }
        }

        if (res.length() == 0) {
            res = "Contact not found";
        }

        return res;
    }

    public void overrideContact(int index, String name, String phone) {

        if (index <= 0 || index - 1 > this.contacts.length ) {
            return;
        }

        this.contacts[index - 1].name = name;
        this.contacts[index - 1].phone = phone;
    }

    public void removeContact(int index) {

        if (this.contacts.length <= index || this.contacts[index] == null || index < 0) {
            return;
        }

        this.contacts[index - 1] = null;
        int j = 0;

        Contact[] temp = new Contact[this.contacts.length];

        for (int i = 0; i < this.contacts.length; i++) {

            if (this.contacts[i] == null) {
                i++;
            }

            temp[j] = this.contacts[i];
            j++;
        }

        this.contacts = temp;
    }

    private String contactToJson(Contact contact) {

        if (contact == null) {
            return "";
        }

        return String.format("{\"name\":\"%s\",\"phone number\":\"%s\",\"id\":%d,\"operator\":\"%s\"}",
                contact.name, contact.phone, contact.id + 1, contact.operator);
    }

    public String toJson() {

        String res = "";

        for (int i = 0; i < findLastContact(); i++) {
            res += contactToJson(this.contacts[i]) + ",";
        }

        return "{\"contactList\":[" +  res.substring(0, res.length() - 1) + "]}";
    }

    public Contact[] getContacts() {
        return this.contacts;
    }
}