package com.example.searchengine.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * search task that is assigned to worker node
 */
@AllArgsConstructor
public class Task implements Serializable {
    private final List<String> searchTerms;
    private final List<String> documents;

    public List<String> getSearchTerms() {
        return Collections.unmodifiableList(searchTerms);
    }

    public List<String> getDocuments() {
        return Collections.unmodifiableList(documents);
    }
}
