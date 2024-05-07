package Homework;

import java.util.HashMap;
import java.util.Map;

public class DevDictionary {
    private Map<String ,String> dictionary;

    public DevDictionary() {
        dictionary=new HashMap<>();
        dictionary.put("SEO", "Search engine optimization");
        dictionary.put("SaaS", "Software as a service");
        dictionary.put("UX", "User experience");
        System.out.println(dictionary);
    }

}
