package org.springExamples.behavioral.memento;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Project project = context.getBean(Project.class);
        project.setVersion("1");
        project.saveVersion();
        System.out.println(project);

        project.setVersion("2");
        project.saveVersion();
        System.out.println(project);

        project.setVersion("3");
        project.saveVersion();
        System.out.println(project);

        System.out.println("something went wrong, doing rollback");

        project.loadVersion("2");
        System.out.println(project);

        // project.saveVersion(); - we can save it to make version "2" current

        context.close();

        // The memento takes out the internal state of the object to have the ability to restore the object.
        // Useful when we need breakpoints for an object.
    }
}
