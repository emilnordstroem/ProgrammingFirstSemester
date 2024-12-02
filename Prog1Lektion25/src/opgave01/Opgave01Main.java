package opgave01;

import opgave01.models.Character;
import opgave01.storage.HogwartsStorage;

import java.util.ArrayList;

public class Opgave01Main {
    public static void main(String[] args) {
        HogwartsStorage storage = new HogwartsStorage();
        ArrayList<Character> gryffindors = storage.getHouseGryffindor();
        ArrayList<Character> slytherins = storage.getHouseSlytherin();

        System.out.println(mergeArrayList(gryffindors, slytherins));
    }

    public static ArrayList<Character> mergeArrayList(ArrayList<Character> sequence1, ArrayList<Character> sequence2){
        ArrayList<Character> result = new ArrayList<>();
        int index1 = 0;
        int index2 = 0;

        while(index1 < sequence1.size() && index2 < sequence2.size()){
            if(sequence1.get(index1).compareTo(sequence2.get(index2)) >= 0){
                result.add(sequence1.get(index1));
                index1++;
            } else {
                result.add(sequence2.get(index2));
                index2++;
            }
        }

        while(index1 < sequence1.size()){
            result.add(sequence1.get(index1));
            index1++;
        }
        while(index2 < sequence2.size()){
            result.add(sequence2.get(index2));
            index2++;
        }

        return result;
    }
}