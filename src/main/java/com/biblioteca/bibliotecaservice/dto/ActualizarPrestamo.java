//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.10.16 a las 10:33:46 AM CST 
//


package com.biblioteca.bibliotecaservice.dto;

import javax.xml.datatype.XMLGregorianCalendar;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="ID_PRESTAMO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FECHA_DEVOLUCION" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
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
    "idprestamo",
    "fechadevolucion"
})
@XmlRootElement(name = "ActualizarPrestamo")
public class ActualizarPrestamo {

    @XmlElement(name = "ID_PRESTAMO", required = true)
    protected String idprestamo;
    @XmlElement(name = "FECHA_DEVOLUCION", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechadevolucion;

    /**
     * Obtiene el valor de la propiedad idprestamo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDPRESTAMO() {
        return idprestamo;
    }

    /**
     * Define el valor de la propiedad idprestamo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDPRESTAMO(String value) {
        this.idprestamo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechadevolucion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFECHADEVOLUCION() {
        return fechadevolucion;
    }

    /**
     * Define el valor de la propiedad fechadevolucion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFECHADEVOLUCION(XMLGregorianCalendar value) {
        this.fechadevolucion = value;
    }

}
