package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter implements IAnalyticsCounter {
    public TreeMap<String, Integer> countSymptoms(List<String> symptomsList) {
        TreeMap<String, Integer> symptomsMap = new TreeMap<>();

        for (String elem : symptomsList) {
            symptomsMap.putIfAbsent(elem, 0);
            symptomsMap.put(elem, symptomsMap.get(elem) + 1);
        }
        return symptomsMap;
    }

    private String filePathOut;

    @Override
    public void writeSymptomsToFile(String filePathOut) {
        this.filePathOut = filePathOut;
    }

    @Override
    public void writeSymptom(TreeMap<String, Integer> symptomsMap) {
        try {
            FileWriter fw = new FileWriter(filePathOut);

            for (String elem : symptomsMap.keySet()) {
                fw.write(elem + " : " + symptomsMap.get(elem) + "\n");
            }
            fw.close();
        } catch (IOException e) {
            System.err.println("Impossible de créer le fichier de sorite !");
        }
    }
}
