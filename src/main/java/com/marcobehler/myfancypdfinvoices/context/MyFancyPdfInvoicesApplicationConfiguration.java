package com.marcobehler.myfancypdfinvoices.context;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.marcobehler.myfancypdfinvoices.services.InvoiceService;
import com.marcobehler.myfancypdfinvoices.services.UserService;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan
public class MyFancyPdfInvoicesApplicationConfiguration {

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}
