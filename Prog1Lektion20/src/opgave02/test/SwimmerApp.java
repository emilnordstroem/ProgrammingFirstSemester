package opgave02.test;

import opgave02.model.Swimmer;
import opgave02.model.TrainingPlan;

import java.util.ArrayList;

public class SwimmerApp {

    private static ArrayList<TrainingPlan> trainingPlans = new ArrayList<>();

    public static void main(String[] args) {

        ArrayList<Double> lapTimes = new ArrayList<>();
        lapTimes.add(1.02);
        lapTimes.add(1.01);
        lapTimes.add(0.99);
        lapTimes.add(0.98);
        lapTimes.add(1.02);
        lapTimes.add(1.04);
        lapTimes.add(0.99);
        Swimmer swimmer1 = new Swimmer("Jan", 1994, lapTimes, "AGF");

        lapTimes = new ArrayList<>();
        lapTimes.add(1.05);
        lapTimes.add(1.01);
        lapTimes.add(1.04);
        lapTimes.add(1.06);
        lapTimes.add(1.08);
        lapTimes.add(1.04);
        lapTimes.add(1.02);
        Swimmer swimmer2 = new Swimmer("Bo", 1995, lapTimes, "Lyseng");

        lapTimes = new ArrayList<>();
        lapTimes.add(1.03);
        lapTimes.add(1.01);
        lapTimes.add(1.02);
        lapTimes.add(1.05);
        lapTimes.add(1.03);
        lapTimes.add(1.06);
        lapTimes.add(1.03);
        Swimmer swimmer3 = new Swimmer("Mikkel", 1993, lapTimes, "AIA-Tranbjerg");
        
        ArrayList<Swimmer> swimmers = new ArrayList<>();
        swimmers.add(swimmer1);
        swimmers.add(swimmer2);
        swimmers.add(swimmer3);

        for (Swimmer swimmer : swimmers) {
            System.out.println(swimmer.getName() + "'s bedste tid: " + swimmer.bestLapTime());
        }

        TrainingPlan trainingPlanA = new TrainingPlan('A', 16,10);
        TrainingPlan trainingPlanB = new TrainingPlan('B', 10,6);

        trainingPlanA.setSwimmerToList(swimmer1);
        trainingPlanA.setSwimmerToList(swimmer2);
        trainingPlanB.setSwimmerToList(swimmer3);

        trainingPlans.add(trainingPlanA);
        trainingPlans.add(trainingPlanB);

        for(TrainingPlan trainingPlan : trainingPlans){
             ArrayList<Swimmer> swimmerArrayList = trainingPlan.getSwimmerArrayList();
             for(Swimmer swimmer : swimmerArrayList){
                 System.out.println(swimmer.toString());
             }
        }

    }
}
