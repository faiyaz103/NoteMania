package com.example.notemania;

public class firebasemodel {
    private String title;
    private String content;

    // No-argument constructor required for Firestore
    public firebasemodel() {
    }

    public firebasemodel(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
