package org.rhyshodgson.microdoc;

// TODO: Create a Database class (has many Collections)
// TODO: Figure out a way of storing the data. Might need to get creative.
// TODO: Create a Seeder class (may insert many Documents for one Collection into a Database)
// TODO: Create a Relation class (will somehow handle relations across Collections, not sure how yet)
// TODO: Figure out how to have a running "connection" to another program. Would need to expose a port like MySQL does.

import org.rhyshodgson.microdoc.model.Collection;
import org.rhyshodgson.microdoc.model.Document;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main() {
        Map<String, Object> seededFields = new HashMap<>();
        seededFields.put("field_1", 1);
        seededFields.put("field_2", 2);
        seededFields.put("field_3", 3);

        Collection collection = new Collection("example_collection");
        Document document1 = new Document(seededFields);
        Document document2 = new Document(seededFields);

        ArrayList<Document> mergedDocuments = new ArrayList<>();
        mergedDocuments.add(document1);
        mergedDocuments.add(document2);

        collection.insertDocuments(new ArrayList<Document>(mergedDocuments));

        ArrayList<Document> collectionDocuments = collection.getDocuments();

        System.out.println(collectionDocuments);
        System.out.println(collectionDocuments.getFirst().getId());
    }
}
