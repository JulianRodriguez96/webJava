package com.pruebadev.web.helpers;

import java.net.http.HttpClient;



import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientHelper {

    /**
     * Obtener cliente para peticiones http
     * @return
     */
	public WebClient getWebClient()
	{	    
		return WebClient.builder()
		        .baseUrl("https://63560c7bda523ceadc0a961f.mockapi.io")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .defaultHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
		        .build();
	}
}
