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
    public void signIn(String email, String password, onSignInListener listener) {
        firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(task -> {
            if (task.isSuccessful()) {
                listener.onSignInSuccess();
            } else {
                // Login failed
                listener.onSignInFailed(task.getException().getMessage());
            }
        });
    }

    public void signOut() {
        firebaseAuth.signOut();
    }



    public interface onSignInListener {
        void onSignInSuccess();
        void onSignInFailed(String errorMessage);
    }

}
