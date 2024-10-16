//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.10.16 a las 10:33:46 AM CST 
//


package com.biblioteca.bibliotecaservice.dto;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.biblioteca.dto package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IDLIBRO_QNAME = new QName("https://www.example.com/Valores", "ID_LIBRO");
    private final static QName _FECHA_QNAME = new QName("https://www.example.com/Valores", "FECHA");
    private final static QName _ESTADO_QNAME = new QName("https://www.example.com/Valores", "ESTADO");
    private final static QName _TITULO_QNAME = new QName("https://www.example.com/Valores", "TITULO");
    private final static QName _CrearPrestamoIDUSUARIO_QNAME = new QName("http://com.Prestamo", "ID_USUARIO");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.biblioteca.dto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearPrestamo }
     * 
     */
    public CrearPrestamo createCrearPrestamo() {
        return new CrearPrestamo();
    }

    /**
     * Create an instance of {@link ActualizarPrestamo }
     * 
     */
    public ActualizarPrestamo createActualizarPrestamo() {
        return new ActualizarPrestamo();
    }

    /**
     * Create an instance of {@link EliminarPrestamo }
     * 
     */
    public EliminarPrestamo createEliminarPrestamo() {
        return new EliminarPrestamo();
    }

    /**
     * Create an instance of {@link ConsultarPrestamo }
     * 
     */
    public ConsultarPrestamo createConsultarPrestamo() {
        return new ConsultarPrestamo();
    }

    /**
     * Create an instance of {@link RESPUESTA }
     * 
     */
    public RESPUESTA createRESPUESTA() {
        return new RESPUESTA();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.example.com/Valores", name = "ID_LIBRO")
    public JAXBElement<String> createIDLIBRO(String value) {
        return new JAXBElement<>(_IDLIBRO_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.example.com/Valores", name = "FECHA")
    public JAXBElement<XMLGregorianCalendar> createFECHA(XMLGregorianCalendar value) {
        return new JAXBElement<>(_FECHA_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.example.com/Valores", name = "ESTADO")
    public JAXBElement<String> createESTADO(String value) {
        return new JAXBElement<>(_ESTADO_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.example.com/Valores", name = "TITULO")
    public JAXBElement<String> createTITULO(String value) {
        return new JAXBElement<>(_TITULO_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://com.Prestamo", name = "ID_USUARIO", scope = CrearPrestamo.class)
    public JAXBElement<String> createCrearPrestamoIDUSUARIO(String value) {
        return new JAXBElement<>(_CrearPrestamoIDUSUARIO_QNAME, String.class, CrearPrestamo.class, value);
    }

}
