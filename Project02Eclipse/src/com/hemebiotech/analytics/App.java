package com.hemebiotech.analytics;


import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {
        String path = "Project02Eclipse/";
        String fileIn = "symptoms.txt";

        AnalyticsCounter.temporaire();

        // Code temporaire pour tester la class ReadSymptomDataFromFile
        ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile();
        List<String> temp;
        reader.readSymptomDataFromFile(path + fileIn);
        temp = reader.getSymptoms();

        for (String elem : temp) {
            System.out.println(elem);
        }


    }


}
