package pl.javastart.messaging;

public class Main {

    public static void main(String[] args) {

        MessageProducer simpleMessageProducer = new SimpleMessageProducer();
        MessagePrinter firstMessagePrinter = new MessagePrinter(simpleMessageProducer);
        MessagePrinter secondMessagePrinter = new MessagePrinter(simpleMessageProducer);
        firstMessagePrinter.printMessage();
        secondMessagePrinter.printMessage();

        MessageProducer consoleMessageProducer = new ConsoleMessageProducer();
        MessagePrinter thirdMessagePrinter = new MessagePrinter(consoleMessageProducer);
        thirdMessagePrinter.printMessage();
    }

}
