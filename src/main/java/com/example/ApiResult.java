package com.example;

import java.util.List;

// класс для хранения данных о запросе

public class ApiResult {
    private Query query;

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    public List<SearchItem> getSearchResults() {
        return query != null ? query.getSearch() : null;
    }
}