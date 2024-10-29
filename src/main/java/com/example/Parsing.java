package com.example;

import com.google.gson.Gson;
import java.util.ArrayList;

public class Parsing {
    private ArrayList<String[]> titleAndId = new ArrayList<>(); // храним заголовок и id статьи

    public void parse(String response) {
        Gson gson = new Gson();
        ApiResult result = gson.fromJson(response, ApiResult.class);  // парсинг JSON

        if (result.getQuery().getTotalhits() == 0) { // если результат не найден
            System.out.println("По вашему запросу ничего не найдено.");
            System.exit(0);                                   
        } 

        if (result != null && result.getSearchResults() != null) { // чтения результата поиска
            for (SearchItem item : result.getSearchResults()) {
                titleAndId.add(new String[] {item.getTitle(), String.valueOf(item.getPageid())}); // добавляем заголовок и id статьи
            }
        }
    }

    // геттеры для работы с данными статьи

    public String getTitle(int index) { // для названия статьи
        return titleAndId.get(index)[0];
    }

    public String getId(int index) {  // для id статьи
        return titleAndId.get(index)[1];
    }

    public int getSizeArray() { // для количества статей
        return titleAndId.size();
    }
}