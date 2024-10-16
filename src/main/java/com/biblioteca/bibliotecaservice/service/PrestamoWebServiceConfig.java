package com.biblioteca.bibliotecaservice.service;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.Wsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class PrestamoWebServiceConfig {

    // Configuración del servlet para manejar las solicitudes
    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }

    // Definición del WSDL para el servicio de préstamo
    @Bean(name = "prestamoService")
    public Wsdl11Definition defaultWsdl11Definition() {
        SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
        wsdl11Definition.setWsdl(new ClassPathResource("wsdl/Prestamo.wsdl")); // Asegúrate de que la ruta al WSDL sea correcta
        return wsdl11Definition;
    }

    // Definición del esquema XSD para el servicio de préstamo
    @Bean(name = "prestamo")
    public XsdSchema prestamoSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/Prestamo.xsd")); // Asegúrate de que la ruta al XSD sea correcta
    }
}
