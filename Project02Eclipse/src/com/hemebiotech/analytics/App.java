package com.hemebiotech.analytics;

public class App {

    public static void main(String[] args) {
        String path = "Project02Eclipse/";
        String fileIn = "symptoms.txt";
        String fileOut = "result.out";

        ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile();
        AnalyticsCounter analyticsCounter = new AnalyticsCounter();

        reader.readSymptomDataFromFile(path + fileIn);
        analyticsCounter.writeSymptomsToFile(path + fileOut);

        analyticsCounter.writeSymptom(analyticsCounter.countSymptoms(reader.getSymptoms()));
    }


}
