package com.hemebiotech.analytics;

public class App {

    public static void main(String[] args) {
        // Chemin d'accès au dossier où seront lu et créé les différents fichier du programme.
        String path = "Project02Eclipse/";
        // Nom du fichier ou le programme ira lire les symptoms
        String fileIn = "symptoms.txt";
        // Nom du fichier ou le programme ira écrire les symptoms et leur nombre d'itération.
        String fileOut = "result.out";

        ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile();
        AnalyticsCounter analyticsCounter = new AnalyticsCounter();

        reader.readSymptomDataFromFile(path + fileIn);
        analyticsCounter.writeSymptomsToFile(path + fileOut);

        analyticsCounter.writeSymptom(analyticsCounter.countSymptoms(reader.getSymptoms()));
    }


}
