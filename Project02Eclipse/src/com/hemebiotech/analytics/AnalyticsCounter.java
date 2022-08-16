package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter implements IAnalyticsCounter{
    private static int headacheCount = 0;
    private static int rashCount = 0;
    private static int pupilCount = 0;


    public static void temporaire() throws Exception {
        // first get input
        BufferedReader reader = new BufferedReader(new FileReader("Project02Eclipse/symptoms.txt"));
        String line = reader.readLine();

        while (line != null) {

            if (line.equals("headache")) {
                headacheCount++;

            } else if (line.equals("rash")) {
                rashCount++;
            } else if (line.contains("pupils")) {
                pupilCount++;
            }

            line = reader.readLine();    // get another symptom
        }

        reader.close();

        // next generate output
        FileWriter writer = new FileWriter("Project02Eclipse/result.out");
        writer.write("headache: " + headacheCount + "\n");
        writer.write("rash: " + rashCount + "\n");
        writer.write("dialated pupils: " + pupilCount + "\n");
        writer.close();
    }

    public TreeMap<String, Integer> countSymptoms(List<String> symptomsList) {
        TreeMap<String, Integer> symptomsMap = new TreeMap<>();

        for (String elem : symptomsList) {
            symptomsMap.putIfAbsent(elem, 0);
            symptomsMap.put(elem, symptomsMap.get(elem) + 1);
        }
        return symptomsMap;
    }
}
