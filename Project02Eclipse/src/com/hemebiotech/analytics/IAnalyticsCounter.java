package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public interface IAnalyticsCounter {

    TreeMap<String, Integer> countSymptoms(List<String> symptomsList);
}
