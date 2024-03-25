package org.springExamples.structural.proxy;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ProxyDog implements Animal, ApplicationContextAware {

    Animal dog;

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void makeSound() {
        if (dog == null)
            dog = applicationContext.getBean(Dog.class);
        dog.makeSound();
    }
}
