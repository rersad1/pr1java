package com.example;

// класс для хранения данных о статье

public class SearchItem {
    private String title;
    private int pageid;

    public String getTitle() { // геттер названия статьи
        return title;
    }

    public void setTitle(String title) { // сеттер названия
        this.title = title;
    }

    public int getPageid() {  // геттер id статьи
        return pageid;
    }

    public void setPageid(int pageid) { // сеттер id
        this.pageid = pageid;
    }
}