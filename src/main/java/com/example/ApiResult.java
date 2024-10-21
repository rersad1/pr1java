package com.example;

import java.util.List;

public class ApiResult {
    private query query;

    public query getQuery() {
        return query;
    }

    public void setQuery(query query) {
        this.query = query;
    }

    public List<searchItem> getSearchResults() {
        return query != null ? query.getSearch() : null;
    }
}