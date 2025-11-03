package org.springExamples.behavioral.iterator;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RoomFactory implements FactoryBean<Room> {

    private int NEXT_ID = 1;

    @Override
    public Room getObject() {
        return new Room(NEXT_ID++);
    }

    @Override
    public Class<?> getObjectType() {
        return Room.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    public List<Room> generateObjects(int number) {
        var list = new ArrayList<Room>();
        for (int i = 0; i < number; i++) {
            list.add(getObject());
        }
        return list;
    }
}
