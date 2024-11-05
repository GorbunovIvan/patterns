package org.springExamples.behavioral.chainOfResponsibility;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public Notifier simpleReport(@Qualifier("emailReport") Notifier emailReport) {
        var notifier = new SimpleReportNotifier(Priority.SIMPLE);
        notifier.setNextNotifier(emailReport);
        return notifier;
    }

    @Bean
    public Notifier emailReport(@Qualifier("SMSReport") Notifier SMSReport) {
        var notifier = new EmailNotifier(Priority.IMPORTANT);
        notifier.setNextNotifier(SMSReport);
        return notifier;
    }

    @Bean
    public Notifier SMSReport() {
        return new SMSNotifier(Priority.ASAP);
    }

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
