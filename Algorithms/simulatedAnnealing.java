package Algorithms;

import distanceMatrix.DistanceMatrix;
import java.util.ArrayList;
import static java.lang.Math.log;

public class simulatedAnnealing {

    private String current;
    private String next;
    private String best;
    private float temperature;


    public simulatedAnnealing(DistanceMatrix dm) {


    }

    private float initialTemperature(DistanceMatrix dm) {
        ArrayList<String> cities = dm.getCities();
        ArrayList<ArrayList<Integer>> distances = dm.getDistances();
        int d1 = 0;
        int d2 = 0;
        int smallest1 = ;
        int smallest2 = 0;
        float temp = 0;
        for(int i = 0; i < cities.size() - 1; i++){
            d1 += dm.distance(cities.get(i), cities.get(i + 1));
            if(dm.distance(cities.get(i), cities.get(i + 1)) < smallest1){
                smallest1 = dm.distance(cities.get(i), cities.get(i + 1));
            } else
        }
        d1 += dm.distance(cities.get(cities.size()), cities.get(0));

        distances.stream().sorted();



        return temp;
    }



}
