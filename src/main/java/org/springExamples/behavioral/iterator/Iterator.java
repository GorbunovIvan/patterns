package org.springExamples.behavioral.iterator;

public interface Iterator<EntityOfHouse> {
    boolean hasNext();
    EntityOfHouse next();
}
