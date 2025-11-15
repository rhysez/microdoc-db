package org.rhyshodgson.microdoc;

// TODO: Figure out a way of storing the data as JSON. Look into MongoDB internal architecture.
// TODO: Create a basic query language that can be used to execute operations on a Database.
// TODO: Figure out how to have a running "connection" to another program (Research TCP servers)

import org.rhyshodgson.microdoc.model.Collection;
import org.rhyshodgson.microdoc.model.Database;
import org.rhyshodgson.microdoc.model.Document;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main() {
        Database database = new Database.Builder()
                .name("My Database")
                .port(3306)
                .user("Test")
                .password("password")
                .build();

        database.info();
    }
}
