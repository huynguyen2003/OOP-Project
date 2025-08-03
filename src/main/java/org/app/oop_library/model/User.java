package org.app.oop_library.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userId;
    private String name;
    private List<Document> borrowedDocuments;
    private static final int MAX_BORROW = 3;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
        this.borrowedDocuments = new ArrayList<>();
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public List<Document> getBorrowedDocuments() {
        return borrowedDocuments;
    }

    public boolean borrowDocument(Document doc) {
        if (borrowedDocuments.size() >= MAX_BORROW || doc.getQuantity() <= 0) {
            return false;
        }
        borrowedDocuments.add(doc);
        doc.setQuantity(doc.getQuantity() - 1);
        return true;
    }

    public boolean returnDocument(Document doc) {
        if (borrowedDocuments.remove(doc)) {
            doc.setQuantity(doc.getQuantity() + 1);
            return true;
        }
        return false;
    }

    public void printUserInfo() {
        System.out.println("User: " + name + " (ID: " + userId + ")");
        System.out.println("Borrowed Documents:");
        for (Document doc : borrowedDocuments) {
            doc.printInfo();
        }
    }
}
