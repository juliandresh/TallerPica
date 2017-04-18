//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.07 a las 04:01:49 PM COT 
//


package co.com.foundation.mtx.filter.operations.info;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}common-captures"/>
 *         &lt;element ref="{}operational-captures"/>
 *         &lt;element ref="{}scheduled-captures"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "commonCaptures",
    "operationalCaptures",
    "scheduledCaptures"
})
@XmlRootElement(name = "data-set")
public class DataSet {

    @XmlElement(name = "common-captures", required = true)
    protected CommonCaptures commonCaptures;
    @XmlElement(name = "operational-captures", required = true)
    protected OperationalCaptures operationalCaptures;
    @XmlElement(name = "scheduled-captures", required = true)
    protected ScheduledCaptures scheduledCaptures;

    /**
     * Obtiene el valor de la propiedad commonCaptures.
     * 
     * @return
     *     possible object is
     *     {@link CommonCaptures }
     *     
     */
    public CommonCaptures getCommonCaptures() {
        return commonCaptures;
    }

    /**
     * Define el valor de la propiedad commonCaptures.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonCaptures }
     *     
     */
    public void setCommonCaptures(CommonCaptures value) {
        this.commonCaptures = value;
    }

    /**
     * Obtiene el valor de la propiedad operationalCaptures.
     * 
     * @return
     *     possible object is
     *     {@link OperationalCaptures }
     *     
     */
    public OperationalCaptures getOperationalCaptures() {
        return operationalCaptures;
    }

    /**
     * Define el valor de la propiedad operationalCaptures.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalCaptures }
     *     
     */
    public void setOperationalCaptures(OperationalCaptures value) {
        this.operationalCaptures = value;
    }

    /**
     * Obtiene el valor de la propiedad scheduledCaptures.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledCaptures }
     *     
     */
    public ScheduledCaptures getScheduledCaptures() {
        return scheduledCaptures;
    }

    /**
     * Define el valor de la propiedad scheduledCaptures.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledCaptures }
     *     
     */
    public void setScheduledCaptures(ScheduledCaptures value) {
        this.scheduledCaptures = value;
    }

}
