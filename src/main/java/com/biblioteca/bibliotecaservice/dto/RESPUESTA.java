//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.10.16 a las 10:33:46 AM CST 
//


package com.biblioteca.bibliotecaservice.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="ID_PR"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="USR-[0-9]{4}-[0-9]{3}X"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{https://www.example.com/Valores}ID_LIBRO"/&gt;
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
    "idpr",
    "mensaje",
    "idlibro",
    "estado"
})
@XmlRootElement(name = "RESPUESTA")
public class RESPUESTA {

    @XmlElement(name = "ID_PR", required = true)
    protected String idpr;
    @XmlElement(name = "Mensaje")
    protected String mensaje;
    @XmlElement(name = "ID_LIBRO", namespace = "https://www.example.com/Valores", required = true)
    protected String idlibro;
    @XmlElement(name = "ESTADO", namespace = "https://www.example.com/Valores", required = true)
    protected String estado;

    /**
     * Obtiene el valor de la propiedad idpr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDPR() {
        return idpr;
    }

    /**
     * Define el valor de la propiedad idpr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDPR(String value) {
        this.idpr = value;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad idlibro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDLIBRO() {
        return idlibro;
    }

    /**
     * Define el valor de la propiedad idlibro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDLIBRO(String value) {
        this.idlibro = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESTADO() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESTADO(String value) {
        this.estado = value;
    }

}
