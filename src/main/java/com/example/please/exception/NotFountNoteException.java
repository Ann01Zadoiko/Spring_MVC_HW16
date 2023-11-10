package com.example.please.exception;


public class NotFountNoteException extends Exception{

    public NotFountNoteException(Long id){
        super("Note with id: " + id + " wasn't fount. Please try again");
    }

}

