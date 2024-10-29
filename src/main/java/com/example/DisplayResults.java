package com.example;

public class DisplayResults {

    public void displayArticles(String response) {

        Parsing parse = new Parsing();
        parse.parse(response); // парсинг результата 

        for (int i = 0; i < parse.getSizeArray(); i++) { 
            System.out.println(i+1 + ") " + parse.getTitle(i)); // вывод статей
        }
        
        System.out.println("Введите номер статьи для открытия"); 

    }
}