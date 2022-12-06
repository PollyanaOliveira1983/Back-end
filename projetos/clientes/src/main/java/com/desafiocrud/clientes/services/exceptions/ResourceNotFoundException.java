package com.desafiocrud.clientes.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String msg) {

        super(msg);
    }
}
