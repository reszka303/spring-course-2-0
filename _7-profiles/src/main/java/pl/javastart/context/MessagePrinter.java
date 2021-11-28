package pl.javastart.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.javastart.context.producer.MessageProducer;

@Service
public class MessagePrinter {

    private final MessageProducer messageProducer;

    @Autowired
    public MessagePrinter(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    public void printMessage() {
        String message = messageProducer.getMessage();
        System.out.println(message);
    }

}
