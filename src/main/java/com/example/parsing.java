package com.example;

import com.google.gson.Gson;
import java.util.ArrayList;

public class parsing {
    private ArrayList<String[]> titleAndId = new ArrayList<>();

    public void parse(String response) {
        Gson gson = new Gson();
        ApiResult result = gson.fromJson(response, ApiResult.class);
        if (result != null && result.getSearchResults() != null) {
            for (searchItem item : result.getSearchResults()) {
                titleAndId.add(new String[] {item.getTitle(), String.valueOf(item.getPageid())});
            }
        } else {
            System.out.println("No search results found.");
        }
    }

    public String getTitle(int index) {
        return titleAndId.get(index)[0];
    }

    public String getId(int index) {
        return titleAndId.get(index)[1];
    }

    public int getSizeArray() {
        return titleAndId.size();
    }
}