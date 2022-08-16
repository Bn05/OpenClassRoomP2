package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter implements IAnalyticsCounter {

    /**
     * @param symptomsList List symptoms, itération possible.
     * @return TreeMap de symptoms, pas d'itération possible, le nombre d'itération de la liste est donné en value.
     */
    public TreeMap<String, Integer> countSymptoms(List<String> symptomsList) {
        TreeMap<String, Integer> symptomsMap = new TreeMap<>();

        for (String elem : symptomsList) {
            symptomsMap.putIfAbsent(elem, 0);
            symptomsMap.put(elem, symptomsMap.get(elem) + 1);
        }
        return symptomsMap;
    }

    private String filePathOut;

    /**
     * @param filePathOut String : Path+ nom du fichier ou écrire les données.
     */
    @Override
    public void writeSymptomsToFile(String filePathOut) {
        this.filePathOut = filePathOut;
    }

    /**
     * @param symptomsMap TreeMap avec les symptomes en key et le nombre d'itération en value.
     */
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
