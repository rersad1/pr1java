package com.example;


public class Main {
    public static void main(String[] args) {
        request req = new request();
        String url = req.createUrl();
        String response = req.searchResult(url);
        searchPrint print = new searchPrint();
        print.printResults(response);
    }
}
