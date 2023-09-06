package com.example.searchengine.algo;

import com.example.searchengine.model.DocumentData;

import java.util.List;

public class TFIDF {

    public static double calculateTermFrequency(List<String> words, String term) {
        long count = 0;
        for (String word : words) {
            if (term.equalsIgnoreCase(word)) {
                count++;
            }
        }
        return (double) count / words.size();
    }


    public static DocumentData createDocumentData(List<String> words, List<String> terms) {
        DocumentData documentData = new DocumentData();

        for (String term : terms) {
            double termFreq = TFIDF.calculateTermFrequency(words, term.toLowerCase());
            documentData.putTermFrequency(term, termFreq);
        }
        return documentData;
    }

}
