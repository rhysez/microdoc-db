package org.example.microdoc.model;

import java.util.ArrayList;

public final class Collection extends BaseResource {
    private ArrayList<Document> documents = new ArrayList<Document>();

    public String name;

    public Collection(String name) {
        this.name = name;
    }

    public ArrayList<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(ArrayList<Document> documents) {
        this.documents = documents;
        touch();
    }

    public void insertDocument(Document document) {
        this.documents.add(document);
        touch();
    }

    public void insertDocuments(ArrayList<Document> documents) {
        this.documents.addAll(documents);
        touch();
    }
}
