package org.example.microdoc.model;

import java.time.Instant;
import java.util.UUID;

public abstract class BaseResource {
    protected final UUID id;
    protected final Instant createdAt;
    protected Instant updatedAt;

    protected BaseResource() {
        this.id = UUID.randomUUID();
        this.createdAt = Instant.now();
        this.updatedAt = createdAt;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void touch() {
        this.updatedAt = Instant.now();
    }
}
