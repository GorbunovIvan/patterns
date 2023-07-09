package org.example.behavioral.chainOfResponsibility;

public class Main {

    public static void main(String[] args) {

        Notifier simpleReport = new SimpleReportNotifier(Priority.SIMPLE);
        Notifier emailReport = new EmailNotifier(Priority.IMPORTANT);
        Notifier SMSReport = new SMSNotifier(Priority.ASAP);

        simpleReport.setNextNotifier(emailReport);
        emailReport.setNextNotifier(SMSReport);

        simpleReport.sendMessage("little problem", Priority.SIMPLE);
        System.out.println();

        simpleReport.sendMessage("significant problem", Priority.IMPORTANT);
        System.out.println();

        simpleReport.sendMessage("very urgently", Priority.ASAP);

        // If we have a request (or task) that can be handled by one or more classes,
        // and we may not know these classes previously because it will be evaluated at runtime
    }
}
