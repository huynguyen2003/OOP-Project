package org.app.oop_library;

import org.app.oop_library.model.*;
import org.app.oop_library.service.LibraryManager;

import java.util.List;
import java.util.Scanner;

public class MainMenu {
    private static final Scanner scanner = new Scanner(System.in);
    private static final LibraryManager library = new LibraryManager();

    public static void main(String[] args) {
        int choice;
        do {
            printMenu();
            try {
                System.out.print("Your choice: ");
                choice = Integer.parseInt(scanner.nextLine());
                handleChoice(choice);
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                choice = -1;
            }
        } while (choice != 0);

        System.out.println("👋 Goodbye!");
    }

    private static void printMenu() {
        System.out.println("\n===== LIBRARY MENU =====");
        System.out.println("[0] Exit");
        System.out.println("[1] Add Document");
        System.out.println("[2] Remove Document");
        System.out.println("[3] Update Document (WIP)");
        System.out.println("[4] Find Document");
        System.out.println("[5] Display Document");
        System.out.println("[6] Add User");
        System.out.println("[7] Borrow Document");
        System.out.println("[8] Return Document");
        System.out.println("[9] Display User Info");
    }

    private static void handleChoice(int choice) {
        switch (choice) {
            case 1 -> addDocument();
            case 2 -> removeDocument();
            case 4 -> findDocument();
            case 5 -> library.printAllDocuments();
            case 6 -> addUser();
            case 7 -> borrowDocument();
            case 8 -> returnDocument();
            case 9 -> displayUserInfo();
            case 0 -> {} // exit
            default -> System.out.println("Action is not supported.");
        }
    }

    private static void addDocument() {
        System.out.print("Enter document ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int qty = Integer.parseInt(scanner.nextLine());

        System.out.print("Is this a Book or Thesis? (b/t): ");
        String type = scanner.nextLine();

        if (type.equalsIgnoreCase("b")) {
            System.out.print("Enter publisher: ");
            String publisher = scanner.nextLine();
            Book book = new Book(id, title, author, qty, publisher);
            library.addDocument(book);
        } else if (type.equalsIgnoreCase("t")) {
            System.out.print("Enter university: ");
            String university = scanner.nextLine();
            Thesis thesis = new Thesis(id, title, author, qty, university);
            library.addDocument(thesis);
        } else {
            System.out.println("Invalid type.");
        }
    }

    private static void removeDocument() {
        System.out.print("Enter document ID to remove: ");
        String id = scanner.nextLine();
        boolean removed = library.removeDocumentById(id);
        System.out.println(removed ? "Removed." : "Document not found.");
    }

    private static void findDocument() {
        System.out.print("Enter title keyword: ");
        String keyword = scanner.nextLine();
        List<Document> results = library.findDocumentsByTitle(keyword);
        if (results.isEmpty()) {
            System.out.println("No matching documents found.");
        } else {
            System.out.println("Found:");
            for (Document doc : results) {
                doc.printInfo();
            }
        }
    }

    private static void addUser() {
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        User user = new User(userId, name);
        library.addUser(user);
    }

    private static void borrowDocument() {
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();
        System.out.print("Enter document ID: ");
        String docId = scanner.nextLine();
        library.borrowDocument(userId, docId);
    }

    private static void returnDocument() {
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();
        System.out.print("Enter document ID: ");
        String docId = scanner.nextLine();
        library.returnDocument(userId, docId);
    }

    private static void displayUserInfo() {
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();
        library.printUserInfo(userId);
    }
}
