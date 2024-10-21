package com.example;

public class searchPrint {
    public void printResults(String response) {
        parsing parse = new parsing();
        parse.parse(response);
        for (int i = 0; i < parse.getSizeArray(); i++) {
            System.out.println(i+1 + ") " + parse.getTitle(i));
        }
    }
}