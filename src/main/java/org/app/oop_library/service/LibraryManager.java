package org.app.oop_library.service;

import org.app.oop_library.model.*;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    private List<Document> documents;
    private List<User> users;

    public LibraryManager() {
        documents = new ArrayList<>();
        users = new ArrayList<>();
    }

    // ------------------- Document Methods -------------------

    public void addDocument(Document doc) {
        documents.add(doc);
        System.out.println("Document added successfully.");
    }

    public boolean removeDocumentById(String id) {
        return documents.removeIf(doc -> doc.getId().equalsIgnoreCase(id));
    }

    public List<Document> findDocumentsByTitle(String title) {
        List<Document> results = new ArrayList<>();
        for (Document doc : documents) {
            if (doc.getTitle().toLowerCase().contains(title.toLowerCase())) {
                results.add(doc);
            }
        }
        return results;
    }

    public void printAllDocuments() {
        if (documents.isEmpty()) {
            System.out.println("No documents in the library.");
            return;
        }
        for (Document doc : documents) {
            doc.printInfo();
        }
    }

    // ------------------- User Methods -------------------

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added successfully.");
    }

    public User findUserById(String userId) {
        for (User user : users) {
            if (user.getUserId().equalsIgnoreCase(userId)) {
                return user;
            }
        }
        return null;
    }

    // ------------------- Borrowing Methods -------------------

    public boolean borrowDocument(String userId, String docId) {
        User user = findUserById(userId);
        if (user == null) {
            System.out.println("User not found.");
            return false;
        }

        Document doc = findDocumentById(docId);
        if (doc == null) {
            System.out.println("Document not found.");
            return false;
        }

        if (doc.getQuantity() <= 0) {
            System.out.println("Document is not available.");
            return false;
        }

        boolean success = user.borrowDocument(doc);
        if (success) {
            System.out.println("Document borrowed successfully.");
        } else {
            System.out.println("Borrow failed. Limit reached or document unavailable.");
        }
        return success;
    }

    public boolean returnDocument(String userId, String docId) {
        User user = findUserById(userId);
        if (user == null) {
            System.out.println("User not found.");
            return false;
        }

        Document doc = findDocumentById(docId);
        if (doc == null) {
            System.out.println("Document not found.");
            return false;
        }

        boolean success = user.returnDocument(doc);
        if (success) {
            System.out.println("Document returned successfully.");
        } else {
            System.out.println("Return failed. Document not borrowed by user.");
        }
        return success;
    }

    public void printUserInfo(String userId) {
        User user = findUserById(userId);
        if (user != null) {
            user.printUserInfo();
        } else {
            System.out.println("User not found.");
        }
    }

    // ------------------- Helper -------------------

    private Document findDocumentById(String id) {
        for (Document doc : documents) {
            if (doc.getId().equalsIgnoreCase(id)) {
                return doc;
            }
        }
        return null;
    }
}
