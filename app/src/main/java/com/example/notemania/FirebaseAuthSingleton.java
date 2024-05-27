package com.example.notemania;

import com.google.firebase.auth.FirebaseAuth;

public class FirebaseAuthSingleton {

    // Singleton instance
    private static FirebaseAuthSingleton instance;
    private FirebaseAuth firebaseAuth;

    private FirebaseAuthSingleton() {
        firebaseAuth = FirebaseAuth.getInstance();
    }

    // Singleton getInstance method
    public static synchronized FirebaseAuthSingleton getInstance() {
        if (instance == null) {
            instance = new FirebaseAuthSingleton();
        }
        return instance;
    }

    public FirebaseAuth getFirebaseAuth() {
        return firebaseAuth;
    }
}