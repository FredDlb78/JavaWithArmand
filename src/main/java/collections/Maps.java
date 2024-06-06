package collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args){
        Map<String, Integer> courses = new HashMap<>();
        courses.put("Physics", 6);
        courses.put("English", 3);
        courses.put("Maths", 8);
        courses.put("Sport", 2);
        courses.put("Economics", 4);
        courses.put("French", 4);

        System.out.println(courses.get("Maths"));

        for(Map.Entry<String, Integer> entry : courses.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
