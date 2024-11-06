package com.example;


public class Main {
    public static void main(String[] args) {
        Request req = new Request();
        String url = req.createUrl();
        String response = req.searchResult(url);
        DisplayResults display = new DisplayResults();
        display.displayArticles(response);
        UserChoice choice = new UserChoice();
        choice.chooseArticle(response);
    }
}
