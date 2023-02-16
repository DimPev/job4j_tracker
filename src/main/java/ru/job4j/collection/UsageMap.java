package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev Sergeevich");
        map.put("caкisnota@Mail.ci", "КотоПес");
        map.put("parsentev@yandex.ru", "Petr Arsentev Sergeevich");
        map.put("caкisnota@Mail.ci", "КотоПес");
        map.put("catisa@Mail.ci", "КотоПес");
        map.put("parsentev@yandex.ru", "Petr Arsentev Sergeevich");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "  " + value);
        }
    }
}
