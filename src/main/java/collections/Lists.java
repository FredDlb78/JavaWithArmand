package collections;

import java.util.*;

public class Lists {
    public static void main(String[] args){
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Guava");
        fruits.add("Mango");
        fruits.add("Cherry");
        //Vérifier qu'un élément est dans ma liste
        if(fruits.contains("Banana")){
            System.out.println("Cette liste contient le fruit Banana");
        }else {
            System.out.println("Cette liste ne contient pas le fruit banana");
            int index = fruits.indexOf("Mango");
            fruits.set(1, "Banana");}


        // Supprimer un élément avec son nom
//        fruits.remove("Apple");
        // Supprimer un élément avec son index
//        fruits.remove(0);


        //3 façons de parcourir le tableau
        for(int i = 0; i < fruits.size(); i++){
            System.out.println(fruits.get(i));
        }

        for (String fruit : fruits){
            System.out.println(fruit);
        }
        // Trier une liste (ordre naturel)
        Collections.sort(fruits);

        Iterator<String> it = fruits.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
