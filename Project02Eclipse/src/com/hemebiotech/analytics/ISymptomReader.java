package com.hemebiotech.analytics;

import java.util.List;

public interface ISymptomReader {

    void readSymptomDataFromFile(String filePathIn);
    List<String> getSymptoms();
}
