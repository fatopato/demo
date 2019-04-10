package com.globme.idenftit.exceptions;

public class ContextCanNotInitializedException extends Exception {
    private static final String EXCEPTION_MESSAGE  = "Context could not initialized with error code : ";


    public ContextCanNotInitializedException(int errorCode){
        super(EXCEPTION_MESSAGE + errorCode);
    }
}
