package com.example;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URLEncoder;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;


public class Request { // класс для создания запроса

    public String createUrl() { // создание запроса
        System.out.println("Введите запрос для поиска");
        String query = System.console().readLine(); //  ввод запроса
        System.out.println("Поск по запросу " + query);
        try {
            query = URLEncoder.encode(query, "UTF-8");  // кодирование запроса
        } catch (UnsupportedEncodingException e) {
            System.out.println("Encoding не поддерживается");
            return "";
        }
        
        
        String url = "https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=" + query; // создание url
        return url;
    }

    public String searchResult(String url) { // получение результата поиска
        try {
            URI uri = new URI(url); // Создание URI вместо URL
            URL obj = uri.toURL(); 
            HttpURLConnection connection = (HttpURLConnection) obj.openConnection(); 
            int responseCode = connection.getResponseCode(); // получение ответа от сервера
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream())); // буфер для чтения ответа
                String inputLine;
                StringBuffer response = new StringBuffer();

                while ((inputLine = in.readLine()) != null) { // чтение ответа
                    response.append(inputLine);
                }
                in.close();

                return response.toString(); // Возврат результата поиска
            } 
            else {
                System.out.println("Ответ сервера: " + responseCode);
                return "";      
            }              
        }
        catch (Exception e) {
            System.out.println("Ошибка при создании URL"); // обработка ошибки
            return "";
        }
    }
}