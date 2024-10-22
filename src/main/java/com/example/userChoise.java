package com.example;

public class userChoise {

    public void displayAndChooseArticle(String response) {
        parsing parse = new parsing();
        parse.parse(response); // парсинг результата поиска
        for (int i = 0; i < parse.getSizeArray(); i++) { // вывод статей
            System.out.println(i+1 + ") " + parse.getTitle(i));
        }

        System.out.println("Введите номер статьи для открытия"); 
        int index = Integer.parseInt(System.console().readLine()); // чтение номера статьи
        lounchBrowser browser = new lounchBrowser();
        browser.createUrl(parse.getId(index-1)); // создание ссылки, которую запустит браузер
    }


}