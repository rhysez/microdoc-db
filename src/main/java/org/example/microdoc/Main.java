package org.example.microdoc;

// TODO: Create a Document class (Mongo-like documents that can be derived from JSON)
// TODO: Create a Collection class (has many Documents)
// TODO: Create a Database class (has many Collections)
// TODO: Create a Server class (has many Databases) (this should be an HTTP server)
// TODO: Create a Connection class (has one Server)
// TODO: Create a Seeder class (may insert many Documents for one Collection into a Database)
// TODO: Create a Relation class (will somehow handle relations across Collections, not sure how yet)

import org.example.microdoc.model.Collection;
import org.example.microdoc.model.Document;

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

        ArrayList<Document> allDocuments = new ArrayList<>();
        allDocuments.add(document1);
        allDocuments.add(document2);

        collection.insertDocuments(new ArrayList<Document>(allDocuments));

        System.out.println(collection.getDocuments());
    }
}
