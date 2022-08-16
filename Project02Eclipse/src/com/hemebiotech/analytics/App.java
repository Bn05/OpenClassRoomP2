package com.hemebiotech.analytics;

public class App {

    public static void main(String[] args) throws Exception {
        String path = "Project02Eclipse/";
        String fileIn = "symptoms.txt";

        AnalyticsCounter.temporaire();

        // Code temporaire pour tester la class ReadSymptomDataFromFile
        ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile();
        reader.readSymptomDataFromFile(path + fileIn);

        AnalyticsCounter analyticsCounter = new AnalyticsCounter();

        System.out.println(analyticsCounter.countSymptoms(reader.getSymptoms()));
    }


}
