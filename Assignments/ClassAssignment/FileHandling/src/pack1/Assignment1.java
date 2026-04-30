package pack1;
import java.io.*;
import java.util.*;

class ContactManager {
    HashMap<String, Long> contacts;
    final String FILE_NAME = "contacts.txt";

    ContactManager() {
        contacts = new HashMap<>();
        loadFromFile();
    }

    void loadFromFile() {
        try {
            File file = new File(FILE_NAME);
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    contacts.put(parts[0], Long.parseLong(parts[1]));
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Error loading file: " + e.getMessage());
        }
    }

    void saveToFile() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME));
            for (Map.Entry<String, Long> entry : contacts.entrySet()) {
                bw.write(entry.getKey() + "," + entry.getValue());
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }

    void addContact(String name, long mobile) {
        contacts.put(name, mobile);
        saveToFile();
        System.out.println("Contact added successfully.");
    }

    void allContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }
        for (Map.Entry<String, Long> entry : contacts.entrySet()) {
            System.out.println("Name: " + entry.getKey() + " | Mobile: " + entry.getValue());
        }
    }

    void searchContact(String name) {
        if (contacts.containsKey(name)) {
            System.out.println("Name: " + name + " | Mobile: " + contacts.get(name));
        } else {
            System.out.println("Contact not found.");
        }
    }

    void updateContact(String name, long newContact) {
        if (contacts.containsKey(name)) {
            contacts.put(name, newContact);
            saveToFile();
            System.out.println("Contact updated successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    void deleteContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            saveToFile();
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }
}

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactManager cm = new ContactManager();
        int choice;

        while (true) {
            System.out.println("\n1. Add a new contact");
            System.out.println("2. Display all contacts");
            System.out.println("3. Search for a contact");
            System.out.println("4. Update an existing contact number");
            System.out.println("5. Delete a contact");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                continue;
            }

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter mobile number: ");
                        long mobile = Long.parseLong(sc.nextLine());
                        cm.addContact(name, mobile);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid mobile number format.");
                    }
                    break;
                case 2:
                    cm.allContacts();
                    break;
                case 3:
                    System.out.print("Enter name to search: ");
                    String searchName = sc.nextLine();
                    cm.searchContact(searchName);
                    break;
                case 4:
                    try {
                        System.out.print("Enter name to update: ");
                        String updateName = sc.nextLine();
                        System.out.print("Enter new mobile number: ");
                        long newMobile = Long.parseLong(sc.nextLine());
                        cm.updateContact(updateName, newMobile);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid mobile number format.");
                    }
                    break;
                case 5:
                    System.out.print("Enter name to delete: ");
                    String deleteName = sc.nextLine();
                    cm.deleteContact(deleteName);
                    break;
                case 6:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select from 1 to 6.");
            }
        }
    }
}