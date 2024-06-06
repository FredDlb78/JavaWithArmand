package collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args){
        Set<String> cars = new TreeSet<>();
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Renault");
        cars.add("Peugeot");
        //Créer un 2e set
        Set<String> others = Set.of("Nissan", "Toyota");
        //Ajouter tous les éléments du set others au set cars
        cars.addAll(others);

        List<Integer> numbers = List.of(5,1,9,4,3,7,4,5);
        Set<Integer> set = new TreeSet<>();
        set.addAll(numbers);
        //Tri et élimine les doublons
        for(Integer num : set){
            System.out.println(num);
        }
        //Set = Liste qui ne contient pas de doublon

    }
}
