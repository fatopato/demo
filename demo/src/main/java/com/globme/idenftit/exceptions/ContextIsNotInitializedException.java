package com.globme.idenftit.exceptions;

public class ContextIsNotInitializedException extends Exception {
    private static final String EXCEPTION_MESSAGE  = "Context is not initialized. Initialize context first ";


    public ContextIsNotInitializedException(){
        super(EXCEPTION_MESSAGE);
    }
}
