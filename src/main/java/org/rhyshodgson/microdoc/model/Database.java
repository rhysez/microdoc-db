package org.rhyshodgson.microdoc.model;

public class Database {
    private final String name;
    private final short port;
    private final String userName;
    private final String password;

    private Database(Builder builder) {
        this.name = builder.name;
        this.port = builder.port;
        this.userName = builder.userName;
        this.password = builder.password;
    }

    public static class Builder {
        private String name = "Database";
        private short port = 3306;
        private String userName = "root";
        private String password = "password";

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder port(short port) {
            this.port = port;
            return this;
        }

        public Builder userName(String userName) {
            this.userName = userName;
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
}

