package com.example.oopispproject;

import java.io.* ;
import java.util.List;

public interface FileHandler<T> {
    List<T> readFromFile(String filename);
    void writeToFile(List<T> list, String filename);
    void addToFile(T object, String filename);
}