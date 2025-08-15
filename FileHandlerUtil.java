package com.example.oopispproject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandlerUtil<T> implements FileHandler<T> {

    @Override
    @SuppressWarnings("unchecked")
    public List<T> readFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (List<T>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }

    @Override
    public void writeToFile(List<T> list, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addToFile(T object, String filename) {
        List<T> list = readFromFile(filename);
        list.add(object);
        writeToFile(list, filename);
    }
}
