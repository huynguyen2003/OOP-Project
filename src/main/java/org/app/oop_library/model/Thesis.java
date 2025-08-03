package org.app.oop_library.model;

public class Thesis extends Document {
    private String university;

    public Thesis(String id, String title, String author, int quantity, String university) {
        super(id, title, author, quantity);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    @Override
    public void printInfo() {
        System.out.println("Thesis - ID: " + id + ", Title: " + title + ", Author: " + author +
                ", Quantity: " + quantity + ", University: " + university);
    }
}
