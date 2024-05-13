package br.com.matheusgonzalez.service;

import br.com.matheusgonzalez.dto.PagamentoDTO;
import br.com.matheusgonzalez.producer.PagamentoRequestProducer;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {
    @Autowired
    private PagamentoRequestProducer pagamentoRequestProducer;

    public String integrarPagamento (PagamentoDTO pagamento) {
        try {
            return pagamentoRequestProducer.sendMessage(pagamento);
        } catch (JsonProcessingException e) {
            return "Houve um erro ao solicitar pagamento." + e.getMessage();
        }
    }
}
