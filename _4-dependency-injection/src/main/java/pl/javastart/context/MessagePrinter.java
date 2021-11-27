package pl.javastart.context;

public class MessagePrinter {

    private final SimpleMessageProducer messageProducer;

    public MessagePrinter(SimpleMessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    public void printMessage() {
        String message = messageProducer.getMessage();
        System.out.println(message);
    }

}
