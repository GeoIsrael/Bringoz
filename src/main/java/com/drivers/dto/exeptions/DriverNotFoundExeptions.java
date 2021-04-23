package com.drivers.dto.exeptions;

public class DriverNotFoundExeptions extends RuntimeException {
    private static final long serialVersionUID = 2701569702621294192L;

    public DriverNotFoundExeptions(Long id) {
        super("Driver with id = " + id+" not found");

    }
}
