package org.example.microdoc.model;

import java.util.HashMap;
import java.util.Map;

public class Document {
    private final Map<String, Object> fields = new HashMap<>();

    public Document(Map<String, Object> fields) {
        this.fields.putAll(fields);
    }

    public Map<String, Object> getFields() {
        return fields;
    }

    public void put(String key, Object value) {
        fields.put(key, value);
    };

    public Object get(String key) {
        return fields.get(key);
    }

    public Map<String, Object> toMap() {
        return new HashMap<>(fields);
    }

    @Override
    public String toString() {
        return fields.toString();
    }
}
