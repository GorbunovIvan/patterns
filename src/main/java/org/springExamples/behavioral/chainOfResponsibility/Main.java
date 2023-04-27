package org.springExamples.behavioral.chainOfResponsibility;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Notifier simpleReport = context.getBean(SimpleReportNotifier.class);

        simpleReport.sendMessage("little problem", Priority.SIMPLE);
        System.out.println();

        simpleReport.sendMessage("significant problem", Priority.IMPORTANT);
        System.out.println();

        simpleReport.sendMessage("very urgently", Priority.ASAP);

        context.close();

        // If we have a request (or task) that can be handled by one or more classes,
        // and we may not know these classes previously because it will be evaluated at runtime
    }
}
