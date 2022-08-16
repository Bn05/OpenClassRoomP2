package com.hemebiotech.analytics;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadSymptomDataFromFile implements ISymptomReader {


    private String filepathIn;

    /**
     * @param filePathIn String : Path+ nom du fichier ou lire les données. 1 symptomes par ligne.
     */
    @Override
    public void readSymptomDataFromFile(String filePathIn) {
        this.filepathIn = filePathIn;
    }

    /**
     * @return List des symptomes présents dans le fichier. Iteration possible.
     */
    @Override
    public List<String> getSymptoms() {

        List<String> symptomsList = new ArrayList<>();

        try {
            File file = new File(filepathIn);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line;
                line = scanner.nextLine();
                symptomsList.add(line);
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.err.println("Fichier introuvable !");
        }
        return symptomsList;
    }
}
