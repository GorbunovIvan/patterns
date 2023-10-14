package org.springExamples.behavioral.chainOfResponsibility;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringConfig {

    @Bean
    public SimpleReportNotifier simpleReportNotifier(Notifier emailNotifier) {
        var report = new SimpleReportNotifier(Priority.SIMPLE);
        report.setNextNotifier(emailNotifier);
        return report;
    }

    @Bean
    public EmailNotifier emailNotifier(Notifier SMSNotifier) {
        var report = new EmailNotifier(Priority.IMPORTANT);
        report.setNextNotifier(SMSNotifier);
        return report;
    }

    @Bean
    public SMSNotifier SMSNotifier() {
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
