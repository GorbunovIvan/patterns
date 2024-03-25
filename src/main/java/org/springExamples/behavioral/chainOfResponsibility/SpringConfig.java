package org.springExamples.behavioral.chainOfResponsibility;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringConfig {

    @Bean
    public Notifier simpleReportNotifier(@Qualifier("emailReportNotifier") Notifier nextNotifier) {
        var notifier = new SimpleReportNotifier(Priority.SIMPLE);
        notifier.setNextNotifier(nextNotifier);
        return notifier;
    }

    @Bean
    public Notifier emailReportNotifier(@Qualifier("SMSReportNotifier") Notifier nextNotifier) {
        var notifier = new EmailNotifier(Priority.IMPORTANT);
        notifier.setNextNotifier(nextNotifier);
        return notifier;
    }

    @Bean
    public Notifier SMSReportNotifier() {
        return new SMSNotifier(Priority.ASAP);
    }

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Notifier simpleReport = context.getBean("simpleReportNotifier", Notifier.class);

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
