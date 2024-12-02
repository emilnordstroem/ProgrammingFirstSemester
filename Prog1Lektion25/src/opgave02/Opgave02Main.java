package opgave02;

import opgave02.models.Team;
import opgave02.storage.ChampionsLeagueStorage;
import java.util.ArrayList;

public class Opgave02Main {
    public static void main(String[] args) {
        ChampionsLeagueStorage storage = new ChampionsLeagueStorage();
        Team[] groupA = storage.getGroupA();
        Team[] groupB = storage.getGroupB();
        ArrayList<Team> result = mergeArray(groupA, groupB);
        for(Team team : result){
            System.out.print(String.format("%s points: %d ", team.getName(), team.getPoints()));
        }
    }

    public static ArrayList<Team> mergeArray(Team[] sequence1, Team[] sequence2){
        ArrayList<Team> result = new ArrayList<>();
        int index1 = 0;
        int index2 = 0;

        while(index1 < sequence1.length && index2 < sequence2.length){
            int sequence1Point = sequence1[index1].getPoints();
            int sequence2Point = sequence2[index2].getPoints();

            if(sequence1Point > sequence2Point){
                result.add(sequence1[index1]);
                index1++;
            } else if (sequence1Point < sequence2Point) {
                result.add(sequence2[index2]);
                index2++;
            } else {

                int sequence1Difference = sequence1[index1].getGoalDifference();
                int sequence2Difference = sequence2[index2].getGoalDifference();

                if(sequence1Difference > sequence2Difference){
                    result.add(sequence1[index1]);
                    index1++;
                } else if(sequence1Difference < sequence2Difference){
                    result.add(sequence2[index2]);
                    index2++;
                } else {
                    result.add(sequence1[index1]);
                    index1++;
                    index2++;
                }
            }
        }

        while(index1 < sequence1.length){
            result.add(sequence1[index1]);
            index1++;
        }
        while(index2 < sequence2.length){
            result.add(sequence2[index2]);
            index2++;
        }

        return result;
    }
}
