package org.springExamples.structural.proxy.beans;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ProxyDog implements Animal, ApplicationContextAware {

    private ApplicationContext context;

    private Animal dog;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    @Override
    public void makeSound() {
        dog = context.getBean(Dog.class);
        dog.makeSound();
    }
}
