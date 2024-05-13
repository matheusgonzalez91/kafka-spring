package br.com.matheusgonzalez.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PagamentoRequestConsumer {

    @KafkaListener(
            topics = "${topicos.pagamento.request.topic}",
            groupId = "pagamento-request-group"
    )
    public void consume(String message){
        System.out.println("******* MENSAGEM RECEBIDA *******");
        System.out.println(message);
    }
}
