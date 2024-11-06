package com.example;

public class UserChoice {

    void chooseArticle(String response) {
        Parsing parse = new Parsing();
        parse.parse(response);
        int index = -1;

        while (true) {
            try {
                index = Integer.parseInt(System.console().readLine()); // ввод номера статьи

                if (index > 0 && index <= parse.getSizeArray()) {
                    break; // если введён корректный номер статьи, выходим из цикла
                } else {
                    System.out.println("Некорректный ввод, введите существующий номер статьи."); // если введён несуществующий номер
                }
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод, введите номер статьи."); // если получено не число
            }
        }

        LaunchBrowser browser = new LaunchBrowser(); // открытие статьи в браузере
        browser.createUrl(parse.getId(index - 1));
    }
}