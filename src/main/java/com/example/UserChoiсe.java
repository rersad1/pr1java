package com.example;

public class UserChoiсe {

    void chooseArticle(String response) {
        Parsing parse = new Parsing();
        parse.parse(response);
        int index = -1; 

        try {
            index = Integer.parseInt(System.console().readLine()); // ввод номера статьи
        }
        catch(NumberFormatException e) {
            System.out.println("Некорректный ввод, введите номер статьи."); // если получено нё число
            chooseArticle(response);
        }

        if (index > parse.getSizeArray() || index < 1) {
            System.out.println("Некорректный ввод, введите существующий номер статьи."); // если введён несуществующий номер
            chooseArticle(response);
        }

        LaunchBrowser browser = new LaunchBrowser(); // открытие статьи в браузере
        browser.createUrl(parse.getId(index-1));

    }

}
