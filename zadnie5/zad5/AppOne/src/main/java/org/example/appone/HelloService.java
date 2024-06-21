package org.example.appone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class HelloService {



    private final CommunicationClient communicationClient;

    @Autowired
    public HelloService(CommunicationClient communicationClient) {
        this.communicationClient = communicationClient;
    }



    public String HelloPass() {
        String response = communicationClient.MessagePass();
        if ("to ja".equals(response)) {
            return "Odpowiedź zgodna: " + response;
        } else {
            return "Odpowiedź jest zla";
        }
    }
    public String HelloFail() {
        String response = communicationClient.MessageFail();
        if (" HI, to ja".equals(response)) {
            return "Odpowiedź  zgodna: " + response;
        } else {
            return "Odpowiedź jest zla";
        }
    }
}
