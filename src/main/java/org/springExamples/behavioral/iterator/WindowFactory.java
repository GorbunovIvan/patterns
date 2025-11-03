package org.springExamples.behavioral.iterator;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class WindowFactory implements FactoryBean<Window> {

    private int NEXT_ID = 1;

    @Override
    public Window getObject() {
        return new Window(NEXT_ID++);
    }

    @Override
    public Class<?> getObjectType() {
        return Window.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    public List<Window> generateObjects(int number) {
        var list = new ArrayList<Window>();
        for (int i = 0; i < number; i++) {
            list.add(getObject());
        }
        return list;
    }
}
