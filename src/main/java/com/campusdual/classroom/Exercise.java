package com.campusdual.classroom;

public class Exercise {
    public static void main(String[] args) {
        try {
            throw new Exception("Forced exception");
        } catch (Exception e) {
            System.out.println("Exception controlled");
        }
    }
}
