package org.example;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> person = new HashMap<>();
        person.put("name", "Oleh");
        person.put("lastName", "Davydenko");


        Gson gs = new Gson();
        System.out.println(gs.toJson(person));

    }
}
