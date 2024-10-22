package com.example;

import java.awt.Desktop;
import java.net.URI;

public class lounchBrowser {

    public void openBrowser(String url) { // функция открытия браузера
        try {
            Desktop desktop = Desktop.getDesktop();
            desktop.browse(new URI(url));
        }
        catch (Exception e) {
            e.printStackTrace(); // обработка ошибки
        }
    }

    public void createUrl(String pageId) { // функция создания ссылки
        String url = "https://ru.wikipedia.org/?curid=" + pageId;
        openBrowser(url);
    }

}
