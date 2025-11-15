package org.rhyshodgson.microdoc.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Database {
    private final String name;
    private final int port;
    private final String user;
    private final String password;

    private Map<String, Collection> collections = null;

    private Database(Builder builder) {
        this.name = builder.name;
        this.port = builder.port;
        this.user = builder.user;
        this.password = builder.password;
    }

    public static class Builder {
        private String name = "Database";
        private int port = 3306;
        private String user = "root";
        private String password = "password";

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder port(int port) {
            this.port = port;
            return this;
        }

        public Builder user(String userName) {
            this.user = user;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Database build() {
            return new Database(this);
        }
    }

    public String getName() {
        return name;
    }
    public int getPort() {
        return port;
    }

    public Collection createCollection(String name) {
        Collection collection = new Collection(name);

        if (collections == null) {
            collections = new HashMap<>();
        }

        collections.put(name, collection);

        return collection;
    }

    public Collection getCollection(String name) {
        if (collections == null) {
            return null;
        }
        return collections.get(name);
    }

    public int getCollectionCount() {
        if (collections == null) {
            return 0;
        }
        return collections.size();
    }

    public int getDocumentCount() {
        int count = 0;

        if (collections == null) {
            return 0;
        }

        for (Collection collection : collections.values()) {
            if (collection != null) {
                count += collection.getDocuments().size();
            }
        }

        return count;
    }

    public void info() {
        String message = String.format(
                """
                Database: %s
                Collection count: %s
                Document count: %s
                """,
                this.name,
                this.getCollectionCount(),
                this.getDocumentCount()
        );

        System.out.println(message);
    }
}

