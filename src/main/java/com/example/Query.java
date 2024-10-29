package com.example;

import java.util.List;

// класс для хранения массива данных о статье

public class Query {
    private List<SearchItem> search;

    private int totalhits;

    public List<SearchItem> getSearch() {
        return search;
    }

    public void setSearch(List<SearchItem> search) {
        this.search = search;
    }

    public int getTotalhits() {
        return totalhits;
    }
}