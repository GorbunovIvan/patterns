package org.springExamples.behavioral.iterator.beans;

public interface Iterator<EntityOfHouse> {
    boolean hasNext();
    EntityOfHouse next();
}
