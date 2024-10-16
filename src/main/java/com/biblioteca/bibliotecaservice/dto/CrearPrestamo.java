//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.10.16 a las 10:33:46 AM CST 
//

package com.biblioteca.bibliotecaservice.dto;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://www.example.com/Valores}ID_LIBRO"/&gt;
 *         &lt;element name="ID_USUARIO"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[A-Z]{3,4}[0-9]{4}[A-Za-z]{2,3}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{https://www.example.com/Valores}FECHA"/&gt;
 *         &lt;element ref="{https://www.example.com/Valores}FECHA"/&gt;
 *         &lt;element ref="{https://www.example.com/Valores}ESTADO"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "CrearPrestamo")
public class CrearPrestamo {

    @XmlElementRefs({
        @XmlElementRef(name = "ID_LIBRO", namespace = "https://www.example.com/Valores", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ID_USUARIO", namespace = "http://com.Prestamo", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FECHA", namespace = "https://www.example.com/Valores", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ESTADO", namespace = "https://www.example.com/Valores", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Obtiene el resto del modelo de contenido. 
     * 
     * <p>
     * Ha obtenido esta propiedad que permite capturar todo por el siguiente motivo: 
     * El nombre de campo "FECHA" se está utilizando en dos partes diferentes de un esquema. Consulte: 
     * línea 25 de file:/C:/Users/andre/Documents/Biblioteca/bibliotecaservice/src/main/resources/xsd/Prestamo.xsd
     * línea 24 de file:/C:/Users/andre/Documents/Biblioteca/bibliotecaservice/src/main/resources/xsd/Prestamo.xsd
     * <p>
     * Para deshacerse de esta propiedad, aplique una personalización de propiedad a una
     * de las dos declaraciones siguientes para cambiarles de nombre: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

}
