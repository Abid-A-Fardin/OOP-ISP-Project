package com.example.finalproject;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class abc extends ObjectOutputStream {
    public abc(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        //
    }
}
