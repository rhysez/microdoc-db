package org.rhyshodgson.microdoc.model;

import java.util.ArrayList;
import java.util.UUID;

public final class Collection extends BaseResource {
    private ArrayList<Document> documents = new ArrayList<Document>();

    public String name = "Collection";

    public Collection() {}

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

    public Document getDocumentById(String id) {
        for (Document document : documents) {
            if (document.getId().equals(id)) {
                return document;
            }
        }

        return null;
    }
}
