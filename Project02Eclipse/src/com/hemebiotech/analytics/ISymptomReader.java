package com.hemebiotech.analytics;

import java.util.List;

public interface ISymptomReader {

    void getSymptoms(String filePathIn);

    List<String> readSymptomDataFromFile();
}
